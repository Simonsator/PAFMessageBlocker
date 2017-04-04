package de.simonsator.partyandfriends.chatinspector.configuration;

import de.simonsator.partyandfriends.utilities.ConfigurationCreator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ChatInspectorConfig extends ConfigurationCreator {
	public ChatInspectorConfig(File file) throws IOException {
		super(file);
		readFile();
		loadDefaultValues();
		saveFile();
		process(configuration);
	}

	@Override
	public void reloadConfiguration() throws IOException {

	}

	private void loadDefaultValues() {
		set("Permission.Ignore", "partyandfriends.chatinspector.ignore");
		set("Messages.DoNotWriteThat", "&cYou are not allowed to write that.");
		List<String> list = new ArrayList<String>();
		list.add("Affenarsch");
		list.add("Affenkotstück");
		list.add("Affenmensch");
		list.add("Allmachtsdackel");
		list.add("Ameisenficker");
		list.add("Analbaron");
		list.add("Analraupe");
		list.add("Analzone");
		list.add("anorektische Fettsau");
		list.add("Armee schwanzloser Primaten");
		list.add("Arschbratze");
		list.add("Arschforscher");
		list.add("Arschfotzengesicht");
		list.add("Arschgesicht");
		list.add("Arschhaarbartfratze");
		list.add("Arschkeks");
		list.add("Arschkopf");
		list.add("Arschlocke");
		list.add("Atomspast");
		list.add("Auspuffbumser");
		list.add("Bachel");
		list.add("Badkapp");
		list.add("bangen");
		list.add("Berber");
		list.add("Birl");
		list.add("Blödfisch");
		list.add("Blödmusiker");
		list.add("Bodendompteuse");
		list.add("Brunskuh");
		list.add("Buckelhur");
		list.add("Bumsnuss");
		list.add("Buschmensch");
		list.add("Butterkuh");
		list.add("Cholerator");
		list.add("Dauerlutscher");
		list.add("Dollbohrer");
		list.add("fotze");
		list.add("Doofmannsgehilfe");
		list.add("Doppeldepp");
		list.add("Dreilochnutte");
		list.add("Du Ast!");
		list.add("Dumm-Rasseler");
		list.add("Dünnschissgurgler");
		list.add("Eibemme");
		list.add("Eichelarschkopf");
		list.add("Fitch");
		list.add("Flachgeist");
		list.add("Flattermuschi");
		list.add("Flodder");
		list.add("Fontanellenfick");
		list.add("Fotzklotz");
		list.add("Gargamel");
		list.add("Gaylon");
		list.add("Gebärfrau");
		list.add("Geburtsfehlermiss");
		list.add("geistiger Tiefflieger");
		list.add("Gesichtseintopf");
		list.add("Gesichtsgünter");
		list.add("Gesichtsmorph");
		list.add("Gnarf");
		list.add("Gnogel");
		list.add("Grasdackel");
		list.add("Gratler");
		list.add("Großhirnkastrat");
		list.add("H2O-Kopf");
		list.add("Hack ab!");
		list.add("Hackfresse");
		list.add("Halbaffe");
		list.add("Halma");
		list.add("Hannefatzke");
		list.add("hartzig");
		list.add("Hausschuhgesicht");
		list.add("HDV");
		list.add("hirnamputierter Rhinozerusarsch");
		list.add("Hodenbussard");
		list.add("Hodenkopf");
		list.add("Hodenschrubbler");
		list.add("Hohlbratze");
		list.add("hohle Fritte");
		list.add("Honk");
		list.add("Hosenlottle");
		list.add("Hosentaschen Godzilla");
		list.add("HRSN");
		list.add("Huru");
		list.add("Hutze");
		list.add("Hübi");
		list.add("ins Hirn scheißen");
		list.add("Intelligenzverweigerer");
		list.add("Kackbatzen");
		list.add("Kackstuhl");
		list.add("Kanisterkopf");
		list.add("Klapskalli");
		list.add("Klitzmorchel");
		list.add("Klufenmichel");
		list.add("Knallarsch");
		list.add("Knecht Huso");
		list.add("Kotlutscher");
		list.add("Kotzkannenfressbrett");
		list.add("Kotzkrücke");
		list.add("Krapfengesicht");
		list.add("Kuttenluder");
		list.add("Larve");
		list.add("Lattenheinrich");
		list.add("Lattenschreck");
		list.add("Lällebäbbl");
		list.add("Liam");
		list.add("Loser");
		list.add("mangelbegent");
		list.add("Missi");
		list.add("Mongo");
		list.add("Mr. Grotte");
		list.add("Muschischeps");
		list.add("Nafti");
		list.add("Napfwurst");
		list.add("Nougatnutte");
		list.add("Nuddebumber");
		list.add("Ogerlurch");
		list.add("Orgasmusbremse");
		list.add("oshig");
		list.add("Otzenfrosch");
		list.add("Paragrafenschubse");
		list.add("Partyopfer");
		list.add("Paselacke");
		list.add("Peniskopf");
		list.add("Penisprothesenträger");
		list.add("Pfeifenheini");
		list.add("Pferdefresse");
		list.add("Pfingstochse");
		list.add("pickelgesichtiger Spritzbock");
		list.add("Pimmel");
		list.add("Pimmelfresse");
		list.add("Pimmelkopf");
		list.add("Pimmelpapagei");
		list.add("Pisskajole");
		list.add("Plempe");
		list.add("Pleppo");
		list.add("Pottmolch");
		list.add("Rotzpupsi");
		list.add("Schlampe");
		list.add("Schlabberlappen");
		list.add("schleimscheißender Bambusaffe");
		list.add("Schmalzgrab");
		list.add("Schmalztitte");
		list.add("Schmongo");
		list.add("Schmönkchen");
		list.add("Schmudel");
		list.add("schnarchzapfiger Rüsselsack");
		list.add("Schüttler");
		list.add("Senfgurke");
		list.add("Sheamus");
		list.add("Simbel");
		list.add("Slut");
		list.add("Spaltenspengler");
		list.add("Spammailautor");
		list.add("Spastard");
		list.add("spastophil");
		list.add("Späner");
		list.add("Spoastie");
		list.add("Spongebob");
		list.add("Sponk");
		list.add("Staubbeutel");
		list.add("Steroidbeule");
		list.add("Steroidmutant");
		list.add("Swarowski-Möse");
		list.add("Tapetengerippe");
		list.add("Topmoppel");
		list.add("Tüffel");
		list.add("Unwerk");
		list.add("Vollaffe");
		list.add("vollgepisste Strumpfhose");
		list.add("vollgeschissene Menschenhülle");
		list.add("Vollmongo");
		list.add("Vongo");
		list.add("Wachsfresse");
		list.add("Waldwichtel");
		list.add("Wichsbazille");
		list.add("Wichsfisch");
		list.add("Wikidiot");
		list.add("Wulfer");
		list.add("wulffen");
		list.add("Zahnspangenbettler");
		list.add("zoologisches Abfallprodukt");
		list.add("aasgeier");
		list.add("abspritzer");
		list.add("sdfds");
		list.add("ackerfresse");
		list.add("affenarsch");
		list.add("affenhirn");
		list.add("affenkotze");
		list.add("afterlecker");
		list.add("aktivex.info");
		list.add("almosenarsch");
		list.add("amazing");
		list.add("am-sperma-riecher");
		list.add("anal");
		list.add("analadmiral");
		list.add("analbesamer");
		list.add("analbohrer");
		list.add("analdrill");
		list.add("analentjungferer");
		list.add("analerotiker");
		list.add("analfetischist");
		list.add("analförster");
		list.add("anal-frosch");
		list.add("analnegerdildo");
		list.add("analratte");
		list.add("analritter");
		list.add("aok-chopper");
		list.add("armleuchter");
		list.add("arsch");
		list.add("arschaufreißer");
		list.add("arschbackenschänder");
		list.add("arschbesamer");
		list.add("ärsche");
		list.add("arschentjungferer");
		list.add("arschficker");
		list.add("arschgeburt");
		list.add("arschgeige");
		list.add("arschgesicht");
		list.add("arschhaarfetischist");
		list.add("arschhaarrasierer");
		list.add("arschhöhlenforscher");
		list.add("arschkrampe");
		list.add("arschkratzer");
		list.add("arschlecker");
		list.add("arschloch");
		list.add("arschlöcher");
		list.add("arschmade");
		list.add("arschratte");
		list.add("arschzapfen");
		list.add("arsebandit");
		list.add("arsehole");
		list.add("arsejockey");
		list.add("arselicker");
		list.add("arsenuts");
		list.add("arsewipe");
		list.add("assel");
		list.add("assfuck");
		list.add("assfucking");
		list.add("assgrabber");
		list.add("asshol");
		list.add("asshole");
		list.add("asshole");
		list.add("assi");
		list.add("assrammer");
		list.add("assreamer");
		list.add("asswipe");
		list.add("astlochficker");
		list.add("auspufflutscher");
		list.add("bad motherfucker");
		list.add("badass");
		list.add("badenutte");
		list.add("bananenstecker");
		list.add("bastard");
		list.add("bastard");
		list.add("bauernschlampe");
		list.add("beating the meat");
		list.add("beef curtains");
		list.add("beef flaps");
		list.add("behindis");
		list.add("bekloppter");
		list.add("muttergeficktes");
		list.add("beklopter");
		list.add("bettnässer");
		list.add("bettpisser");
		list.add("bettspaltenficker");
		list.add("biatch");
		list.add("bimbo");
		list.add("bitch");
		list.add("bitches");
		list.add("bitchnutte");
		list.add("bitsch");
		list.add("bizzach");
		list.add("blödmann");
		list.add("blogspoint");
		list.add("blow job");
		list.add("bohnenfresser");
		list.add("boob");
		list.add("boobes");
		list.add("boobie");
		list.add("boobies");
		list.add("boobs");
		list.add("booby");
		list.add("boy love");
		list.add("breasts");
		list.add("brechfurz");
		list.add("bückfleisch");
		list.add("bückstück");
		list.add("bückvieh");
		list.add("buggery");
		list.add("bullensohn");
		list.add("bummsen");
		list.add("bumsen");
		list.add("bumsklumpen");
		list.add("buschnutte");
		list.add("busty");
		list.add("butt pirate");
		list.add("buttfuc");
		list.add("buttfuck");
		list.add("buttfucker");
		list.add("buttfucking");
		list.add("carpet muncher");
		list.add("carpet munchers");
		list.add("carpetlicker");
		list.add("carpetlickers");
		list.add("chausohn");
		list.add("clitsuck");
		list.add("clitsucker");
		list.add("clitsucking");
		list.add("cock");
		list.add("cock sucker");
		list.add("cockpouch");
		list.add("cracka");
		list.add("crap");
		list.add("craper");
		list.add("crapers");
		list.add("crapping");
		list.add("craps");
		list.add("cunt");
		list.add("cunt");
		list.add("cunts");
		list.add("dachlattengesicht");
		list.add("dackelficker");
		list.add("dickhead");
		list.add("dicklicker");
		list.add("diplomarschloch");
		list.add("doofi");
		list.add("douglette");
		list.add("drecksack");
		list.add("drecksau");
		list.add("dreckschlitz");
		list.add("dreckschüppengesicht");
		list.add("drecksmösendagmar");
		list.add("drecksnigger");
		list.add("drecksnutte");
		list.add("dreckspack");
		list.add("dreckstürke");
		list.add("dreckvotze");
		list.add("dumbo");
		list.add("dummschwätzer");
		list.add("dumpfbacke");
		list.add("dünnpfifftrinker");
		list.add("eichellecker");
		list.add("eierkopf");
		list.add("eierlutscher");
		list.add("eiswürfelpisser");
		list.add("ejaculate");
		list.add("entenfisterer");
		list.add("epilepi");
		list.add("epilepis");
		list.add("epileppis");
		list.add("fagette");
		list.add("fagitt");
		list.add("fäkalerotiker");
		list.add("faltenficker");
		list.add("fatass");
		list.add("ferkelficker");
		list.add("ferkel-ficker");
		list.add("fettarsch");
		list.add("fettsack");
		list.add("fettsau");
		list.add("feuchtwichser");
		list.add("fick");
		list.add("fick*");
		list.add("fickarsch");
		list.add("fickdreck");
		list.add("ficken");
		list.add("ficker");
		list.add("fickfehler");
		list.add("fickfetzen");
		list.add("fickfresse");
		list.add("fickfrosch");
		list.add("fickfucker");
		list.add("fickgelegenheit");
		list.add("fickgesicht");
		list.add("fickmatratze");
		list.add("ficknudel");
		list.add("ficksau");
		list.add("fickschlitz");
		list.add("fickschnitte");
		list.add("fickschnitzel");
		list.add("fingerfuck");
		list.add("fingerfucking");
		list.add("fisch-stinkender hodenfresser");
		list.add("fistfuck");
		list.add("fistfucking");
		list.add("flachtitte");
		list.add("fotze");
		list.add("fotzhobel");
		list.add("frisösenficker");
		list.add("fritzfink");
		list.add("fucked");
		list.add("fucker");
		list.add("fucker");
		list.add("fucking");
		list.add("fuckup");
		list.add("fudgepacker");
		list.add("futtgesicht");
		list.add("gay lord");
		list.add("geilriemen");
		list.add("gesichtsfotze");
		list.add("göring");
		list.add("großmaul");
		list.add("gummifotzenficker");
		list.add("gummipuppenbumser");
		list.add("gummisklave");
		list.add("hackfresse");
		list.add("hafensau");
		list.add("hartgeldhure");
		list.add("heil hitler");
		list.add("hi hoper");
		list.add("hinterlader");
		list.add("hirni");
		list.add("hitler");
		list.add("hodenbeißer");
		list.add("hodensohn");
		list.add("homo");
		list.add("hosenpisser");
		list.add("hosenscheißer");
		list.add("hühnerficker");
		list.add("huhrensohn");
		list.add("hundeficker");
		list.add("hundesohn");
		list.add("hurenlecker");
		list.add("hurenpeter");
		list.add("hurensohn");
		list.add("hurentocher");
		list.add("idiot");
		list.add("idioten");
		list.add("itakker");
		list.add("ittaker");
		list.add("jack off");
		list.add("jackass");
		list.add("jackshit");
		list.add("jerk off");
		list.add("jizz");
		list.add("judensau");
		list.add("kackarsch");
		list.add("kacke");
		list.add("kacken");
		list.add("kackfass");
		list.add("kackfresse");
		list.add("kacknoob");
		list.add("kaktusficker");
		list.add("kanacke");
		list.add("kanake");
		list.add("kanaken");
		list.add("kanaldeckelbefruchter");
		list.add("kartoffelficker");
		list.add("kinderficken");
		list.add("kinderficker");
		list.add("kinderporno");
		list.add("kitzler fresser");
		list.add("klapposkop");
		list.add("klolecker");
		list.add("klötenlutscher");
		list.add("knoblauchfresser");
		list.add("konzentrationslager");
		list.add("kotgeburt");
		list.add("kotnascher");
		list.add("kümmeltürke");
		list.add("kümmeltürken");
		list.add("lackaffe");
		list.add("lebensunwert");
		list.add("lesbian");
		list.add("lurchi");
		list.add("lustbolzen");
		list.add("lutscher");
		list.add("magerschwanz");
		list.add("manwhore");
		list.add("masturbate");
		list.add("meat puppet");
		list.add("missgeburt");
		list.add("mißgeburt");
		list.add("mistsau");
		list.add("miststück");
		list.add("mitternachtsficker");
		list.add("mohrenkopf");
		list.add("mokkastübchenveredler");
		list.add("mongo");
		list.add("möse");
		list.add("mösenficker");
		list.add("mösenlecker");
		list.add("mösenputzer");
		list.add("möter");
		list.add("mother fucker");
		list.add("mother fucking");
		list.add("motherfucker");
		list.add("muschilecker");
		list.add("muschischlitz");
		list.add("mutterficker");
		list.add("nazi");
		list.add("nazis");
		list.add("neger");
		list.add("nigga");
		list.add("nigger");
		list.add("niggerlover");
		list.add("niggers");
		list.add("niggerschlampe");
		list.add("nignog");
		list.add("nippelsauger");
		list.add("nutte");
		list.add("nuttensohn");
		list.add("nuttenstecher");
		list.add("nuttentochter");
		list.add("ochsenpimmel");
		list.add("ölauge");
		list.add("oral sex");
		list.add("penis licker");
		list.add("penis licking");
		list.add("penis sucker");
		list.add("penis sucking");
		list.add("penis");
		list.add("peniskopf");
		list.add("penislecker");
		list.add("penislutscher");
		list.add("penissalat");
		list.add("penner");
		list.add("pferdearsch");
		list.add("phentermine");
		list.add("pimmel");
		list.add("pimmelkopf");
		list.add("pimmellutscher");
		list.add("pimmelpirat");
		list.add("pimmelprinz");
		list.add("pimmelschimmel");
		list.add("pimmelvinni");
		list.add("pindick");
		list.add("piss off");
		list.add("piss");
		list.add("pissbirne");
		list.add("pissbotte");
		list.add("pisse");
		list.add("pisser");
		list.add("pissetrinker");
		list.add("pissfisch");
		list.add("pissflitsche");
		list.add("pissnelke");
		list.add("polacke");
		list.add("polacken");
		list.add("poop");
		list.add("popellfresser");
		list.add("popostecker");
		list.add("popunterlage");
		list.add("porn");
		list.add("porno");
		list.add("pornografie");
		list.add("pornoprengel");
		list.add("pottsau");
		list.add("prärieficker");
		list.add("prick");
		list.add("quiff");
		list.add("randsteinwichser");
		list.add("rasierte votzen");
		list.add("rimjob");
		list.add("rindsriemen");
		list.add("ritzenfummler");
		list.add("rollbrooden");
		list.add("roseten putzer");
		list.add("roseten schlemmer");
		list.add("rosettenhengst");
		list.add("rosettenkönig");
		list.add("rosettenlecker");
		list.add("rosettentester");
		list.add("sackfalter");
		list.add("sackgesicht");
		list.add("sacklutscher");
		list.add("sackratte");
		list.add("saftarsch");
		list.add("sakfalter");
		list.add("schamhaarlecker");
		list.add("schamhaarschädel");
		list.add("schandmaul");
		list.add("scheisse");
		list.add("scheisser");
		list.add("scheissgesicht");
		list.add("scheisshaufen");
		list.add("scheißhaufen");
		list.add("schlammfotze");
		list.add("schlampe");
		list.add("schleimmöse");
		list.add("schlitzpisser");
		list.add("schmalspurficker");
		list.add("schmeue");
		list.add("schmuckbert");
		list.add("schnuddelfresser");
		list.add("schnurbeltatz");
		list.add("schrumpelfotze");
		list.add("schwanzlurch");
		list.add("schwanzlutscher");
		list.add("schweinepriester");
		list.add("schweineschwanzlutscher");
		list.add("schwuchtel");
		list.add("schwutte");
		list.add("shiter");
		list.add("shiting");
		list.add("shitlist");
		list.add("shitomatic");
		list.add("shits");
		list.add("shitty");
		list.add("shlong");
		list.add("shut the fuckup");
		list.add("sieg heil");
		list.add("sitzpisser");
		list.add("skullfuck");
		list.add("skullfucker");
		list.add("skullfucking");
		list.add("slut");
		list.add("smegmafresser");
		list.add("spack");
		list.add("spacko");
		list.add("spaghettifresser");
		list.add("spastard");
		list.add("spasti");
		list.add("spastis");
		list.add("spermafresse");
		list.add("spermarutsche");
		list.add("spritzer");
		list.add("stinkschlitz");
		list.add("stricher");
		list.add("suck my cock");
		list.add("suck my dick");
		list.add("threesome");
		list.add("tittenficker");
		list.add("tittenspritzer");
		list.add("titties");
		list.add("titty");
		list.add("tunte");
		list.add("untermensch");
		list.add("vagina");
		list.add("vergasen");
		list.add("viagra");
		list.add("volldepp");
		list.add("volldeppen");
		list.add("vollhorst");
		list.add("vollidiot");
		list.add("vollpfosten");
		list.add("vollspack");
		list.add("vollspacken");
		list.add("vollspasti");
		list.add("vorhaut");
		list.add("votze");
		list.add("votzenkopf");
		list.add("wanker");
		list.add("wankers");
		list.add("weichei");
		list.add("whoar");
		list.add("whore");
		list.add("wichsbart");
		list.add("wichsbirne");
		list.add("wichser");
		list.add("wichsfrosch");
		list.add("wichsgriffel");
		list.add("wichsvorlage");
		list.add("wickspickel");
		list.add("wixa");
		list.add("wixen");
		list.add("wixer");
		list.add("wixxer");
		list.add("wixxxer");
		list.add("wixxxxer");
		list.add("wurstsemmelfresser");
		list.add("yankee");
		list.add("zappler");
		list.add("zyclon");
		list.add("zyklon");
		set("ForbiddenWords", list);
	}

}
