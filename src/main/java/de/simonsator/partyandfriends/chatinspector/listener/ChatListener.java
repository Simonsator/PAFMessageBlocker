package de.simonsator.partyandfriends.chatinspector.listener;

import de.simonsator.partyandfriends.api.events.message.FriendMessageEvent;
import de.simonsator.partyandfriends.api.events.message.FriendOnlineMessageEvent;
import de.simonsator.partyandfriends.api.events.message.PartyMessageEvent;
import de.simonsator.partyandfriends.api.events.message.SimpleMessageEvent;
import de.simonsator.partyandfriends.api.pafplayers.OnlinePAFPlayer;
import de.simonsator.partyandfriends.friends.commands.Friends;
import de.simonsator.partyandfriends.party.command.PartyCommand;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.config.Configuration;
import net.md_5.bungee.event.EventHandler;

import java.util.List;

public class ChatListener implements Listener {
	private final List<String> FORBIDDEN;
	private final String DO_NOT_WRITE_THAT;
	private final String PERMISSION;

	public ChatListener(List<String> pList, Configuration pConfig) {
		for (int i = 0; i < pList.size(); i++)
			pList.set(i, pList.get(i).toLowerCase());
		FORBIDDEN = pList;
		PERMISSION = pConfig.getString("Permission.Ignore");
		DO_NOT_WRITE_THAT = pConfig.getString("Messages.DoNotWriteThat");
	}

	@EventHandler
	public void onChat(PartyMessageEvent pEvent) {
		if (cancelled(pEvent))
			pEvent.getSender().sendMessage(PartyCommand.getInstance().getPrefix() + DO_NOT_WRITE_THAT);
	}

	@EventHandler
	public void onChat(FriendMessageEvent pEvent) {
		if (cancelled(pEvent))
			pEvent.getSender().sendMessage(Friends.getInstance().getPrefix() + DO_NOT_WRITE_THAT);
	}

	@EventHandler
	public void onChat(FriendOnlineMessageEvent pEvent) {
		onChat((FriendMessageEvent) pEvent);
	}

	private boolean cancelled(SimpleMessageEvent pEvent) {
		final OnlinePAFPlayer p = pEvent.getSender();
		if (!p.hasPermission(PERMISSION)) {
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