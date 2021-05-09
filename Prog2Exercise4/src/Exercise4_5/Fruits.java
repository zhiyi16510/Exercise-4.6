package Exercise4_5;

public abstract class Fruits {
private String name, taste;
	
	public Fruits() { // constructor without argument
		name = " ";
	}
	
	public Fruits(String n) { // constructor with argument
		name = n;
	}
	
	public Fruits(String n, String t) {
		name = n;
		taste = t;
	}
	
	public String printUses() {
		return "\nFruits are excellent source of essential vitamins and minerals";
	}
	
	public String getName() {
		return name;
	}
	
	public String getTaste() {
		return taste;
	}
	
	//abstract method
	public abstract String toString();
	public abstract double totalPrice();
	public abstract double totalPrice(double pr);
	public abstract double totalPrice(double pr, int q);

}
