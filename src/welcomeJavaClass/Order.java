package welcomeJavaClass;

public class Order {

	public double getAmount() {
		return 0;
	}
	
	private int numberOfLateDeliveries;
	
	int getRating(){
		return(numberOfLateDeliveries > 5 ? 2 : 1);
	}

}
