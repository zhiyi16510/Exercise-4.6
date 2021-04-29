package Exercise4_3;

public class Apple extends Fruits{
private int quantity, price;
private double discount;
	
	public Apple() { //constructor without argument
		super();
		quantity=0;
		price=0;
		discount=0;
	}
	
	public Apple(String n, String t, int q, int p, double dis) { //constructor with 5 argument
		super(n, t); //inherit data from super class
		quantity = q;
		price = p;
		discount = dis;
		
		setDetails(p, q, dis);
	}
	
	public void setDetails(int q, int p, double dis) { //constructor with 3 argument
		if(q>=0)
			quantity = q;
		else
			quantity = 0;
		
		if(p>=0)
			price = p;
		else
			price = 0;
	}
	
	public int totalPrice() { //overloading without parameter
		return price*5;
	}
	
	public int totalPrice(int quantity) {  //overloading with 1 parameter
		return price*quantity;
	}
	
	public double totalPrice(int quantity, double discount) {  //overloading with 2 parameter
		return price*quantity*discount;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public int getPrice() {
		return price;
	}
	
	public double getDiscount() {
		return discount;
	}
	
	public String toString() { //overriding method
		return super.toString() + "\nPrice\t\t\t: RM" +price+ "\nQuantity\t\t: " +quantity;
	}
}


