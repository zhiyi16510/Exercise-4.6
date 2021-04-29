package Exercise4_3;

public class RedApple extends Apple{
	private String country;
	private int calory, price;
	private double sugar, protein;
	
	public RedApple() { //constructor without argument
		super();
		country = " ";
		calory = 0;
		sugar = 0;
		protein = 0;
	}
	
	public RedApple(String n, String t, String c, int ca, int q, int p, double dis, double s, double pro) {  //constructor with 9 arguments
		super(n, t, q, p,dis);  
		price = p;
		country = n;
		calory = ca;
		sugar = s;
		protein = pro;
		
		setDetails(c, ca, s, pro);
	}
	
	public void setDetails(String c, int ca, double s, double pro) { //constructor with 4 arguments
		if(ca>=0)
			calory = ca;
		else
			calory = 0;
		
		if(s>=0)
			sugar = s;
		else
			sugar = 0;
		
		if(pro>=0)
			protein = pro;
		else
			protein = 0;
	}
	
	public int totalPrice() { //overloading without parameter
		return price*6;
	}
	
	public int totalPrice(int quantity) { //overloading with 1 parameter
		return price*quantity;
	}
	
	public double totalPrice(int quantity, double discount) { //overloading with 2 parameter
		return price*quantity*discount;
	}
	
	public int totalCalory() { //overriding quantity from super apple class
		return calory*super.getQuantity();
	}
	
	public String getCountry() {
		return country;
	}
	
	public int getCalory() {
		return calory;
	}
	
	public double getSugar() {
		return sugar;
	}
	
	public double getProtein() {
		return protein;
	}
	
	public String toString() { //overriding method
		return super.toString() +"\nOrigin country\t\t: " +country+ "\nCalory\t\t\t: " +calory+ "\nTotal calory\t\t: " +totalCalory()+"\nSugar\t\t\t: " +sugar+ "\nProtein\t\t\t: " +protein;
	}
}


