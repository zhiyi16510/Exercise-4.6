package Exercise4_3;

public class GreenApple extends Apple {
	private String country;
	private char size;
	private int calory;
	private double sugar, weight;
	
	public GreenApple() { //constructor without argument
		super();
		country = " ";
		size = ' ';
		calory  = 0;
		sugar = 0;
		weight = 0;
	}
	
	public GreenApple(String n, String t, String c, char s, int q, int p, int ca, double dis, double su, double w) { //constructor with 10 arguments
		super(n,t,q,p,dis);
		country = c;
		size = s;
		calory = ca;
		sugar = su;
		weight = w;
		
		setDetails(c, s,ca, su, w);
	}
	
	public void setDetails(String c, char s, int ca, double su, double w) { //constructor with 5 arguments
		if(ca>=0)
			calory = ca;
		else
			calory = 0;
		
		if(su>=0)
			sugar = su;
		else
			sugar = 0;
		
		if(w>=0)
			weight = w;
		else
			weight = 0;
	}
	
	public double nutrition() { //overloading without parameter
		return sugar*calory;
	}
	
	public double nutrition(int gram) { //overloading with 1 parameter
		return sugar*calory*gram;
	}
	
	public double nutrition(int gram, int quantity) { //overloading with 2 parameter
		return sugar*calory*gram*quantity;
	}
	
	public double totalSugar() { //overriding quantity from apple class
		return sugar*super.getQuantity();
	}
	
	public double totalWeight() { //overriding
		return weight*super.getQuantity();
	}
	
	public String getCountry() {
		return country;
	}
	
	public char getSize() {
		return size;
	}
	
	public int getCalory() {
		return calory;
	}
	
	public double getSugar() {
		return sugar;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public String toString() { //overriding method
		return super.toString()+"\nCountry\t\t\t: " +country+ "\nSize\t\t\t: " +size+ "\nCalory\t\t\t: " +calory+ "\nSugar\t\t\t: " +sugar+ "\nTotal sugar\t\t: " +totalSugar()+ "\nWeight\t\t\t: " +weight;
	} 
}
