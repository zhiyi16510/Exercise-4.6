package Exercise4_2;

public class Papaya extends Fruits {
	private int quantity;
	private double price;
	
	public Papaya() { //constructor without arguments
		super();
		quantity = 0;
		price = 0;
	}
	
	public Papaya(String n, int q, double p) {
		super(n);
		quantity = q;
		price = p;
		
		setDetails(n, q, p);
	}
	
	public void setDetails(String n, int q, double p) {
		if(q>=0)
			quantity = q;
		else
			quantity = 0;
		
		if(p>=0)
			price = p;
		else
			price = 0;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double totalPrice() {
		return quantity*price;
	}
	
	public double discount() {
		return totalPrice()*0.04;
	}
	
	public String toString() {
		return super.toString() + "\nQuantity\t\t: " +quantity+ "\nPrice\t\t\t: RM" +price+ "\nTotal price\t\t: RM" +totalPrice()+ "\nDiscount available\t: RM" +discount()+ "\n";
	}
}
