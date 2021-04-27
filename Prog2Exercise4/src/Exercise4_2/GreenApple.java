package Exercise4_2;

public class GreenApple extends Apple{
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
	
	public GreenApple(String n, String c, char s, int q, int p, int ca, double su, double w) { //constructor with arguments
		super(n, q, p);
		country = c;
		size = s;
		calory = ca;
		sugar = su;
		weight = w;
		
		setDetails(n, c, s, q, p, ca, su, w);
	}
	
	public void setDetails(String n, String c, char s, int q, int p, int ca, double su, double w) {
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
	
	public double totalSugar() {
		return sugar*super.getQuantity();
	}
	
	public String toString() {
		return super.toString()+"\nCountry\t\t\t: " +country+ "\nSize\t\t\t: " +size+ "\nCalory\t\t\t: " +calory+ "\nSugar\t\t\t: " +sugar+ "\nTotal sugar\t\t: " +totalSugar()+ "\nWeight\t\t\t: " +weight;
	} 
}
