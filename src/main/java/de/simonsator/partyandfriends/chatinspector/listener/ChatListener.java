package de.simonsator.partyandfriends.chatinspector.listener;

import de.simonsator.partyandfriends.api.events.message.FriendMessageEvent;
import de.simonsator.partyandfriends.api.events.message.FriendOnlineMessageEvent;
import de.simonsator.partyandfriends.api.events.message.PartyMessageEvent;
import de.simonsator.partyandfriends.api.events.message.SimpleMessageEvent;
import de.simonsator.partyandfriends.api.pafplayers.OnlinePAFPlayer;
import de.simonsator.partyandfriends.friends.commands.Friends;
import de.simonsator.partyandfriends.party.command.PartyCommand;
import de.simonsator.partyandfriends.utilities.ConfigurationCreator;

import java.util.List;
import java.util.regex.Pattern;

public abstract class ChatListener {
	private final List<String> FORBIDDEN;
	private final String DO_NOT_WRITE_THAT;
	private final String PERMISSION;
	private final Pattern REGEX_WHITELIST;

	public ChatListener(List<String> pList, ConfigurationCreator pConfig) {
		pList.replaceAll(String::toLowerCase);
		FORBIDDEN = pList;
		PERMISSION = pConfig.getString("Permission.Ignore");
		DO_NOT_WRITE_THAT = pConfig.getString("Messages.DoNotWriteThat");
		if(pConfig.getBoolean("UseRegexWhiteList")) {
			REGEX_WHITELIST = Pattern.compile(pConfig.getString("RegexWhiteList"));
		} else {
			REGEX_WHITELIST = null;
		}
	}

	protected void onChatGlobal(PartyMessageEvent pEvent) {
		if (cancelled(pEvent))
			pEvent.getSender().sendMessage(PartyCommand.getInstance().getPrefix() + DO_NOT_WRITE_THAT);
	}

	protected void onChatGlobal(FriendMessageEvent pEvent) {
		if (cancelled(pEvent))
			pEvent.getSender().sendMessage(Friends.getInstance().getPrefix() + DO_NOT_WRITE_THAT);
	}

	protected void onChatGlobal(FriendOnlineMessageEvent pEvent) {
		onChatGlobal((FriendMessageEvent) pEvent);
	}

	private boolean cancelled(SimpleMessageEvent pEvent) {
		final OnlinePAFPlayer p = pEvent.getSender();
		if (!p.hasPermission(PERMISSION)) {
			if (REGEX_WHITELIST != null && !REGEX_WHITELIST.matcher(pEvent.getMessage()).matches()) {
				pEvent.setCancelled(true);
				return true;
			}
			String message = pEvent.getMessage().toLowerCase();
			for (String forbiddenWord : FORBIDDEN)
				if (message.contains(forbiddenWord)) {
					pEvent.setCancelled(true);
					return true;
				}
		}
		return false;
	}
}