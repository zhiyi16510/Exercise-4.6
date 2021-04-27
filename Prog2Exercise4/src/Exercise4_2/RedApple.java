package Exercise4_2;

public class RedApple extends Apple {
	private String country;
	private int calory;
	private double sugar, protein;
	
	public RedApple() { //constructor without argument
		super();
		country = " ";
		calory = 0;
		sugar = 0;
		protein = 0;
	}
	
	public RedApple(String n, String c, int ca, int q, int p, double s, double pro) {
		super(n, q, p);
		country = n;
		calory = ca;
		sugar = s;
		protein = pro;
		
		setDetails(n, c, ca, q, p, s, pro);
	}
	
	public void setDetails(String n, String c, int ca, int q, int p, double s, double pro) { //overloading with parameter
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
	
	public int totalCalory() {
		return calory*super.getQuantity();
	}
	
	public String toString() {
		return super.toString() +"\nOrigin country\t\t: " +country+ "\nCalory\t\t\t: " +calory+ "\nTotal calory\t\t: " +totalCalory()+"\nSugar\t\t\t: " +sugar+ "\nProtein\t\t\t: " +protein+ "\n";
	}
}
