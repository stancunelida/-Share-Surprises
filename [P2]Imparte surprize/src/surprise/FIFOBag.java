package surprise;

import java.util.ArrayList;

public class FIFOBag implements IBag {
	
	private ArrayList<ISurprise> surpriseList;
	
	FIFOBag() {
		this.surpriseList = new ArrayList<ISurprise>();
	}
	
	@Override
	public String toString() {
		return "Sacul contine surpriza FIFO:  " + this.surpriseList;
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
		ISurprise surpriza = surpriseList.get(0);
		surpriseList.remove(surpriseList.get(0));
		return surpriza;
	}
	
	@Override
	public ISurprise takeObject() {
		ISurprise surpriza = surpriseList.get(0);
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
