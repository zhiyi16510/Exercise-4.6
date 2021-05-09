package Exercise4_5;

public class Melon extends Fruits implements Discount{
	private char size;
	private int quantity, calories;
	private double price, discount;
	
	public Melon() {
		super();
		size = ' ';
		quantity = 0;
		calories = 0;
		price = 0;
		discount = 0;
	}
	
	public double discountRate() {
		if(size==('S')) {
			if(size==('M'))
				discount = 0.2;
			else if(size==('L'))
				discount = 0.3;
		}
		return discount;
	}
	
	public Melon(String n, String t, char s, int q, int ca, double p, double d) {
		super(n, t);
		size = s;
		quantity = q;
		calories = ca;
		price = p;
		discount = d;
		
		System.out.print("\n===== BUY M SIZE MELON FOR 20% DISCOUNT ====="
						+"\n===== BUY L SIZE MELON FOR 30% DISCOUNT =====");
		System.out.print("\nFruit\t\t\t\t: " +n);
		System.out.print("\nTaste\t\t\t\t: " +t);
		switch(size) {
		case 'S':
			System.out.printf("\nTotal price\t\t\t: RM.2f", totalPrice());
			System.out.print("\nTotal calories of "+size+" melon is "+totalCalories()+" kcal");
			break;
		case 'M':
			double pr = price*(1-discountRate());
			System.out.print("\nTotal calories of "+size+" melon is "+totalCalories(5)+" kcal");
			System.out.printf("\nPrice before discount\t\t: RM%.2f", totalPrice());
			System.out.printf("\nSize is M, total price is RM%.2f", totalPrice(pr));
			System.out.print("\nYou got a discount of 20% ! ");
			break;
		case 'L':
			double pr1 = price*(1-discountRate());
			System.out.print("\nTotal calories of "+size+" melon is "+totalCalories(7)+" kcal");
			System.out.printf("\nPrice before discount\t\t: RM%.2f", totalPrice());
			System.out.printf("\nSize is L, total price is RM%.2f", totalPrice(pr1));
			System.out.print("\nYou got a discount of 30% ! ");
			break;
		}
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
	
	public int totalCalories() {
		return calories;
	}
	
	public int totalCalories(int q) {
		return calories*q;
	}
	
	public String printUses() {
		return "\n----- FACT -----"+"\nMelon could help in reducing blood pressure";
	}
	
	public String toString() {
		return printUses();
	}
}
