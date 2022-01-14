package surprise;

import java.util.ArrayList;
import java.util.Arrays;

public class MinionToy implements ISurprise {
	
	private String name;
	private static int index;
	private static final ArrayList<String> minionNames = new ArrayList<String>(Arrays.asList("Dave", "Carl", "Kevin", "Stuart", "Jerry", "Tim"));
	
	public MinionToy(String name) {
		this.name = name;
	}
	
	@Override
	public void enjoy() {
		System.out.println("Felicitari! Ai primit minionul cu numele " + this.name);
		}
	
	@Override
	public String toString(){
		return " Ai primit minionul cu numele " + this.name + "";
	}

	public static MinionToy generate() {
		if(MinionToy.index == MinionToy.minionNames.size()) {
			MinionToy.index = 0;
		}
		return new MinionToy(minionNames.get(MinionToy.index++));
	}
	
	
	

}
