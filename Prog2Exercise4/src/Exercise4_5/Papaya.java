package Exercise4_5;

public class Papaya extends Fruits implements Discount{
	private String country, colour;
	private double price, discount;
	private int quantity;
	
	public Papaya() {
		super();
		country = "";
		colour = "";
		price = 0;
		quantity = 0;
	}
	
	public double discountRate() {
		if(country=="Mexico") {
			discount = 0.1;
		} else if(country=="Hawaii") {
			discount = 0.2;
		}
		return discount;
	}
	
	public Papaya(String n, String t, String c, String col, double p, double d, int q) {
		super(n, t);
		country = c;
		colour = col;
		price = p;
		quantity = q;
		discount = d;
		
		System.out.print("\n===== BUY MEXICO PAPAYA FOR 10% DISCOUNT ====="
				+"\n===== BUY HAWAII PAPAYA FOR 20% DISCOUNT =====");
		System.out.print("\nFruit\t\t\t\t: " +n);
		System.out.print("\nTaste\t\t\t\t: " +t);
		switch(country) {
		case "Mexico":
			double pr = price*(1-discountRate());
			System.out.print(info("Mexico", "Orange", 12));
			System.out.printf("\nPrice before discount\t\t: RM%.2f", totalPrice());
			System.out.printf("\nPrice after discount\t\t: RM%.2f", totalPrice(pr));
			System.out.print("\nYou got a discount of 10% ! ");
			break;
		case "Hawaii":
			double pr1 = price*(1-discountRate());
			System.out.print(info("Hawaii", "Orange", 8));
			System.out.printf("\nPrice before discount\t\t: RM%.2f", totalPrice());
			System.out.printf("\nPrice after discount\t\t: RM%.2f", totalPrice(pr1));
			System.out.print("\nYou got a discount of 20% ! ");
			break;
		}
	}
	
	public String info() {
		return "\nCountry\t\t\t\t: "+country+"\nColour\t\t\t\t: "+colour+"\nPrice\t\t\t\t: RM"+price;
	}
	
	public String info(String c, String col) {
		return "\nCountry\t\t\t\t: "+c+"\nColour\t\t\t\t: "+col+"\nPrice\t\t\t\t: RM"+price;
	}
	
	public String info(String c, String col, double p) {
		return "\nCountry\t\t\t\t: "+c+"\nColour\t\t\t\t: "+col+"\nPrice\t\t\t\t: RM"+p;
	}
	
	public double totalPrice() {
		return price*quantity;
	}
	
	public double totalPrice(double pr) {
		return pr*quantity;
	}
	
	public double totalPrice(double pr, int q) {
		return pr*q;
	}
	
	public String printUses() {
		return "\n----- FACT -----"+"\nPapaya may reduce the risk of heart disease";
	}
	
	public String toString() {
		return printUses();
	}
}
