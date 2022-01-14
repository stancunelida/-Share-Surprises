package surprise;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Candies implements ISurprise {
	
	private static Random randomNumber = new Random();
	private String type;
	private int number;
	private static final ArrayList<String> candiesType = new ArrayList<String>(Arrays.asList("CHOCOLATE", "VANILLA", "FRUITS", "JELLY"));
	
	private Candies(int number, String type) {
		this.number = number;
		this.type = type;
	}
	
	@Override
	public void enjoy() {
		System.out.println("Felicitari! Ai primit " + this.number + " bomboane de " + this.type);
	}
	
	@Override
	public String toString() {
		return "Felicitari! Ai primit " + this.number + " bomboane de tipul " + this.type;
	}
	
	public static Candies generate() {
		return new Candies(Candies.randomNumber.nextInt(30),
				Candies.candiesType.get(Candies.randomNumber.nextInt(Candies.candiesType.size())));
	}
	

}
