package surprise;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		GiveSurpriseAndApplause surpriza1 = new GiveSurpriseAndApplause("LIFO", 1);
		surpriza1.put(GatherSurprise.gather(4));
		System.out.println(surpriza1);
		surpriza1.giveAll();
		
		for(int i = 0; i < 5; i++) {
			surpriza1.put(GatherSurprise.gather());
		}
		System.out.println(surpriza1);
		for(int i = 0; i < 5; i++) {
			surpriza1.give();;
		}
		System.out.println(surpriza1);
		
		
		GiveSurpriseAndHug surpriza2 = new GiveSurpriseAndHug("RANDOM", 3);
		surpriza2.put(GatherSurprise.gather(5));
		System.out.println(surpriza2);
		surpriza2.giveAll();
		System.out.println(surpriza2);
		
		
		GiveSurpriseAndSing surpriza3 = new GiveSurpriseAndSing("FIFO", 2);
		surpriza3.put(GatherSurprise.gather(3));
		System.out.println(surpriza3);
		surpriza3.giveAll();
		System.out.println(surpriza3);
	}
}
