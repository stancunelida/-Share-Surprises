package surprise;

public class BagFactory implements IBagFactory{
	
	public IBag makeBag(String type) {
		switch(type) {
		case "RANDOM":
			return new RandomBag();
		case "FIFO":
			return new FIFOBag();
		case "LIFO":
			return new LIFOBag();
		default:
			System.out.println("Invalid imput!");
			break;
		}
		return null;
	}

}
