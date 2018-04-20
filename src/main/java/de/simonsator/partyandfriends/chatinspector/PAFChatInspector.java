package de.simonsator.partyandfriends.chatinspector;

import de.simonsator.partyandfriends.api.PAFExtension;
import de.simonsator.partyandfriends.chatinspector.configuration.ChatInspectorConfig;
import de.simonsator.partyandfriends.chatinspector.listener.ChatListener;
import de.simonsator.partyandfriends.main.Main;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.config.Configuration;

import java.io.File;
import java.io.IOException;

public class PAFChatInspector extends PAFExtension {

	@Override
	public void onEnable() {
		Main.getInstance().registerExtension(this);
		try {
			Configuration config = (new ChatInspectorConfig(new File(getConfigFolder(), "config.yml"))).getCreatedConfiguration();
			ProxyServer.getInstance().getPluginManager().registerListener(this,
					new ChatListener(config.getStringList("ForbiddenWords"), config));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onDisable() {
		ProxyServer.getInstance().getPluginManager().unregisterListeners(this);
	}
}