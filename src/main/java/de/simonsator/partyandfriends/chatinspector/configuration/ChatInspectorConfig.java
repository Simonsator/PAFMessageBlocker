package de.simonsator.partyandfriends.chatinspector.configuration;

import de.simonsator.partyandfriends.api.PAFExtension;
import de.simonsator.partyandfriends.utilities.ConfigurationCreator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ChatInspectorConfig extends ConfigurationCreator {
	public ChatInspectorConfig(PAFExtension pPlugin, File file) throws IOException {
		super(file, pPlugin);
		readFile();
		loadDefaultValues();
		saveFile();
		process();
	}

	private void loadDefaultValues() {
		set("UseRegexWhiteList", false);
		set("RegexWhiteList", "^[\\p{L}\\p{Zs}0-9 \\p{Punct}§]+$");
		set("Permission.Ignore", "partyandfriends.chatinspector.ignore");
		set("Messages.DoNotWriteThat", "&cYou are not allowed to write that.");
		List<String> list = new ArrayList<>();
		list.add("asshole");
		list.add("bastard");
		list.add("bitch");
		list.add("cock");
		list.add("cunt");
		list.add("dick");
		list.add("fag");
		list.add("faggot");
		list.add("nigger");
		list.add("pussy");
		list.add("retard");
		list.add("slut");
		list.add("whore");
		set("ForbiddenWords", list);
	}

}
