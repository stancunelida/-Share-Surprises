package surprise;

public class GiveSurpriseAndSing extends AbstractGiveSurprise {
	public GiveSurpriseAndSing(String bagType, int waitTime) {
		super(bagType, waitTime);
	}
	
	void giveWithPassion() {
		System.out.println("Singing a nice song, full of joy and genuine excitement…");
	}

}
