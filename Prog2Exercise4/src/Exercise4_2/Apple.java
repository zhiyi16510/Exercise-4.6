package Exercise4_2;

public class Apple extends Fruits {
	private int quantity, price;
	
	public Apple() { //constructor without argument
		super();
		quantity=0;
		price=0;
	}
	
	public Apple(String n, int q, int p) { //constructor with 3 arguments
		super(n);
		quantity = q;
		price = p;
		
		setDetails(n, p, q);
	}
	
	public void setDetails(String n, int q, int p) {
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
	
	public int getPrice() {
		return price;
	}
	
	public int totalPrice() {
		return quantity*price;
	}
	
	public String toString() {
		return super.toString() + "\nPrice\t\t\t: RM" +price+ "\nQuantity\t\t: RM" +quantity+ "\nTotal price\t\t: RM" +totalPrice();
	}
}
