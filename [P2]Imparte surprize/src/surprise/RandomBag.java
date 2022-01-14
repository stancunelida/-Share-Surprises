package surprise;

import java.util.ArrayList;
import java.util.Random;

public class RandomBag implements IBag{
	
	private ArrayList<ISurprise> surpriseList;
	private Random randomGenerator;
	
	RandomBag() {
		this.surpriseList = new ArrayList<ISurprise>();
		this.randomGenerator = new Random();
	}

	@Override
	public String toString() {
		return "Sacul contine surpriza:  " + this.surpriseList;
	}
	
	@Override
	public void put(ISurprise newSurprise) {
		this.surpriseList.add(newSurprise);
	}
	
	@Override
	public void put(IBag bagOfSurprise) {
		int initialSize = bagOfSurprise.size();
		for(int i = 0; i < initialSize; i++) {
			surpriseList.add(bagOfSurprise.takeOut());
		}
	}
	
	@Override
	public ISurprise takeOut() {
		ISurprise surpriza = this.surpriseList.get(this.randomGenerator.nextInt(surpriseList.size()));
		surpriseList.remove(surpriza);
		return surpriza;
	}
	
	@Override
	public ISurprise takeObject() {
		ISurprise surpriza = surpriseList.get(this.randomGenerator.nextInt(surpriseList.size()));
		return surpriza;
		
	}
	
	@Override
	public boolean isEmpty() {
		if(this.surpriseList.size() == 0) {
			return true;
		}
		return false;
	}
	@Override
	public int size() {
		return this.surpriseList.size();
	}
	
}
