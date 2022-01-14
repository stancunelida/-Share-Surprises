package surprise;

public class GiveSurpriseAndApplause extends AbstractGiveSurprise {
	
	public GiveSurpriseAndApplause(String bagType, int waitTime) {
		super(bagType, waitTime);
	}
	
	void giveWithPassion() {
		System.out.println("Loud applause to you… For it is in giving that we receive.");
	}
}
