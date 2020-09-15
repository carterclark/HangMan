import java.util.Random;

public class WordList {
	
	
	//method for word of chosen length
	public String pickWord(int length) {	//words are between 3-11 and super_long
		String word;
		
		if(length == 20) {
			
			word = super_long[randInt(20)]; // if super_long is selected
			return word.toUpperCase();
		}
		
		else {
			length -= 3;
			word = selector[length][randInt(20)];
			return word.toUpperCase();
		}
		
	}
	
	//method for random number
	private int randInt(int len) {
		int n;
		Random rand = new Random();
		n = rand.nextInt(len);
		
		return n;
	}
	
	static String[] threeLetter = {"and","app","ant","fur","get","got","gum","pop",
			"pit","pin","sky","tap","tar","tax","zoo","zit","yes","say","dog","red"};
	
	static String[] fourLetter = {"vest","lane","chat","helm","roof","loan","beam",
			"mail","fast","foodring","chop","bask","foam","pool","brew","math",
			"tuck","word","past","note"}; 
	
	static String[] fiveLetter = {"three","bleed","since","proud","twirl","poker",
			"typed","canoe","ditch","space","crust","match","slope","vodka","alarm",
			"drake","flame","glory","spear","match"};

	
	static String sixLetter[] = {"copies","hunger","refuse","repute","ruling",
			"reveal","output","fading","maroon","amazon","squirt","tinker",
			"muffle","cloudy","pillow","wallow","summer","faucet","paving",
			"beacon"};
	static String sevenLetter[] = {"shotgun","average","centaur","preface",
			"quarter","startle","tribute","pending","vinegar","trained",
			"packman","trained","exhaust","villain","flatter","science",
			"rubbing","hundred","lighten","pilgrim"};
	
	static String eightLetter[] = {"vertical","shortage","kingship",
			"gathered","coloring","treasure","acoustic","snubbing","flooding",
			"vegetate","vaporize","punching","appeared","chopping","outflank",
			"submerse","timeless","polluted","coherent","highness"};
	
	
	static String[] nineLetter = {"underwent","operating","redeeming","institute",
			"craziness","irradiate","majesties","culturing","postponer","hypnotize",
			"aggregate","gentlemen","voiceless","modernist","parachute","breathful",
			"tressured","efficient","listening","blockhead"};
	
	static String[] tenLetter = {"adjustment","illuminate","personable","occurrence",
			"federalism","transposed","perfection","patriotism","providence","observable",
			"silverback","comparison","assembling","creepiness","glassmaker","vegetation",
			"lighthouse","regenerate","capability","accomplish"};
	
	static String[] elevenLetter = {"materialize","viscerating","actualities","territories",
			"indifferent","invisible","hydrophobia","reliability","environment","extravagant",
			"interpreter","compilation","consecutive","nonresident","complacence","foolishness",
			"premeditate","approximate","kinsmanship","downfalling"};
	
	
	static String[] super_long = {"Haematachometry","Philoprogenitiveness","Crystallographically",
			"Contradistinguishing","protohemicryptophyte ","Incomprehensibility","Hydrometeorological",
			"Incontrovertibility","Cartilaginification","Distinguishableness","Incontrovertibility",
			"Historiographership","Antivaccinationist","Laryngotracheotomy","Antivivisectionist",
			"multialgorithmically ","electrotherapeutical","noncontemporaneities ","ultrafilterabilities ",
			"encephalomyocarditis"};
	
	//selects from an array based on the length of the word chosen
	static String[][] selector = {threeLetter,fourLetter,fiveLetter
			,sixLetter,sevenLetter,eightLetter
			,nineLetter,tenLetter,elevenLetter};
	
}