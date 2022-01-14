package surprise;

import java.util.ArrayList;
import java.util.Random;

import java.util.Random;

public final class GatherSurprise {
	
	private static ArrayList<ISurprise> surpriseList = new ArrayList<ISurprise>();
	private static Random randomSurprise = new Random();
	
	private GatherSurprise() {
		
	}
	
	public static ISurprise gather() {
		ISurprise surprise = null;
		switch (GatherSurprise.randomSurprise.nextInt(3)) {
		case 0:
			surprise = FortuneCookie.generate();
			break;
		case 1:
			surprise = Candies.generate();
			break;
		case 2:
			surprise = MinionToy.generate();
			break;
		default:
			break;
		}
		return surprise;
	
	}
	
	public static ArrayList<ISurprise> gather(int n){
		GatherSurprise.surpriseList.clear();
		for(int i = 0; i < n; i++) {
			GatherSurprise.surpriseList.add(gather());
		}
		return GatherSurprise.surpriseList;
	}

}
