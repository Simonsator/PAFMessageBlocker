package de.simonsator.partyandfriends.chatinspector.listener;

import de.simonsator.partyandfriends.api.PAFExtension;
import de.simonsator.partyandfriends.api.adapter.BukkitBungeeAdapter;
import de.simonsator.partyandfriends.api.events.message.FriendMessageEvent;
import de.simonsator.partyandfriends.api.events.message.PartyMessageEvent;
import de.simonsator.partyandfriends.utilities.ConfigurationCreator;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.util.List;

public class ChatListenerSpigot extends ChatListener implements Listener {

	public ChatListenerSpigot(List<String> pList, ConfigurationCreator pConfig, PAFExtension pPlugin) {
		super(pList, pConfig);
		BukkitBungeeAdapter.getInstance().registerListener(this, pPlugin);
	}

	@EventHandler
	public void onChat(PartyMessageEvent pEvent) {
		onChatGlobal(pEvent);
	}

	@EventHandler
	public void onChat(FriendMessageEvent pEvent) {
		onChatGlobal(pEvent);
	}

}
