package Exercise4_3;

public class Papaya extends Fruits{
	private int quantity;
	private double price;
	
	public Papaya() { //constructor without arguments
		super();
		quantity = 0;
		price = 0;
	}
	
	public Papaya(String n, String t, int q, double p) { //constructor with 4 arguments
		super(n, t);
		quantity = q;
		price = p;
		
		setDetails(q, p);
	}
	
	public void setDetails(int q, double p) { //constructor with 2 arguments
		if(q>=0)
			quantity = q;
		else
			quantity = 0;
		
		if(p>=0)
			price = p;
		else
			price = 0;
	}
	
	public double totalPrice() {
		return quantity*price;
	}
	
	public double discount() {
		return totalPrice()*0.05;
	}
	
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String toString() { //overriding method
		return super.toString() + "\nQuantity\t\t: " +quantity+ "\nPrice\t\t\t: RM" +price+ "\nTotal price\t\t: RM" +totalPrice()+ "\nDiscount available\t: RM" +discount()+ "\n";
	}
}


