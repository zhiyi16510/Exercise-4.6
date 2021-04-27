package Exercise4_2;

public class Melon extends Fruits{
	private String colour, country;
	private int quantity, price;
	
	public Melon() { //constructor without arguments
		super();
		colour = " ";
		country = " ";
		quantity = 0;
		price = 0;
	}
	
	public Melon(String n, String c, String coun, int q, int p) { //constructor with 5 arguments
		super(n);
		colour = c;
		country = coun;
		quantity = q;
		price = p;
		
		setDetails(n, c, coun, q, p);
	}
	
	public void setDetails(String n, String c, String coun, int q, int p) {
		if(q>=0)
			quantity = q;
		else
			quantity = 0;
		
		if(p>=0)
			price = p;
		else
			price = 0;
	}
	
	public String getColour() {
		return colour;
	}
	
	public String getCountry() {
		return country;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public int getPrice(){
		return price;
	}
	
	public int totalPrice() {
		return quantity*price;
	}
	
	public double discount() {
		return totalPrice()*0.05;
	}
	
	public String toString() { //overriding
		return super.toString() + "\nColour\t\t\t: " +colour+ "\nOrigin country\t\t: " +country+ "\nQuantity\t\t: " +quantity+ "\nPrice\t\t\t: RM" +price+ "\nTotal price\t\t: RM" +totalPrice()+ "\nDiscount available\t: RM" +discount()+ "\n";
	}
	
}
