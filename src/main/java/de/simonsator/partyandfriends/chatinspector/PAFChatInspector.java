package de.simonsator.partyandfriends.chatinspector;

import de.simonsator.partyandfriends.api.PAFExtension;
import de.simonsator.partyandfriends.api.adapter.BukkitBungeeAdapter;
import de.simonsator.partyandfriends.api.adapter.ServerSoftware;
import de.simonsator.partyandfriends.chatinspector.configuration.ChatInspectorConfig;
import de.simonsator.partyandfriends.chatinspector.listener.ChatListenerBungee;
import de.simonsator.partyandfriends.chatinspector.listener.ChatListenerSpigot;
import de.simonsator.partyandfriends.main.Main;
import de.simonsator.partyandfriends.utilities.ConfigurationCreator;

import java.io.File;
import java.io.IOException;

@SuppressWarnings("unused")
public class PAFChatInspector extends PAFExtension {

	@Override
	public void onEnable() {
		Main.getInstance().registerExtension(this);
		try {
			ConfigurationCreator config = new ChatInspectorConfig(this, new File(getConfigFolder(), "config.yml"));
			if (BukkitBungeeAdapter.getInstance().getServerSoftware() == ServerSoftware.BUNGEECORD)
				new ChatListenerBungee(config.getStringList("ForbiddenWords"), config, this);
			else new ChatListenerSpigot(config.getStringList("ForbiddenWords"), config, this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}