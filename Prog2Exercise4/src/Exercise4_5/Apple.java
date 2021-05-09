package Exercise4_5;

public class Apple extends Fruits implements Discount {
	private int quantity;
	private double price, discount;
	
	public Apple() {
		super();
		price=0;
		quantity=0;
		discount=0;
	}
	
	public double discountRate() {
		if(quantity<5) {
			if(quantity<=30 && quantity>=5) 
				discount = 0.1;
			else
				discount = 0.2;
		}
		return discount;
	}
	
	public Apple(String n, String t, int q, double p, double d) {
		super(n, t);
		quantity = q;
		price = p;
		discount = d;
		
		System.out.print("\n===== BUY 5 OR MORE FOR 10% DISCOUNT ====="
				+"\n===== BUY 30 OR MORE FOR 20% DISCOUNT =====");
		System.out.print("\nFruit\t\t\t\t: " +n);
		System.out.print("\nTaste\t\t\t\t: " +t);
		if(quantity<5) {
			System.out.printf("\nQuantity less than 5, total price is RM%.2f", totalPrice());
		}
		else if(quantity<=30 && quantity >=5) {
			double pr = price*(1-discountRate());
			System.out.printf("\nPrice before discount\t\t: RM%.2f", totalPrice());
			System.out.printf("\nQuantity more than 5, total price is RM%.2f", totalPrice(pr));
			System.out.print("\nYou got a discount of 10% ! ");
		}
		else {
			double pr = price*(1-discountRate());
			System.out.printf("\nPrice before discount\t\t: RM%.2f", totalPrice());
			System.out.printf("\nQuantity more than 30, total price is RM%.2f", totalPrice(pr));
			System.out.print("\nYou got a discount of 20% ! ");
		}
	}
	
	public double totalPrice() { // overloading without parameter
		return price*quantity;
	}
	
	public double totalPrice(double pr) { // overloading with 1 parameter
		return pr*quantity;
	}
	
	public double totalPrice(double pr, int q) { // overloading with 2 parameter
		return pr*q;
	}
	
	public String printUses() { // overriding method
		return "\n----- FACT -----"+"\nApples contain compounds that can help fight asthma";
	}
	
	public String toString() { //overriding method
		return printUses();
	}
}
