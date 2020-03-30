package de.simonsator.partyandfriends.chatinspector.listener;

import de.simonsator.partyandfriends.api.PAFExtension;
import de.simonsator.partyandfriends.api.events.message.FriendMessageEvent;
import de.simonsator.partyandfriends.api.events.message.FriendOnlineMessageEvent;
import de.simonsator.partyandfriends.api.events.message.PartyMessageEvent;
import de.simonsator.partyandfriends.utilities.ConfigurationCreator;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

import java.util.List;

public class ChatListenerBungee extends ChatListener implements Listener {

	public ChatListenerBungee(List<String> pList, ConfigurationCreator pConfig, PAFExtension pPlugin) {
		super(pList, pConfig);
		ProxyServer.getInstance().getPluginManager().registerListener(pPlugin, this);
	}

	@EventHandler
	public void onChat(PartyMessageEvent pEvent) {
		onChatGlobal(pEvent);
	}

	@EventHandler
	public void onChat(FriendMessageEvent pEvent) {
		onChatGlobal(pEvent);
	}

	@EventHandler
	public void onChat(FriendOnlineMessageEvent pEvent) {
		onChatGlobal(pEvent);
	}

}
