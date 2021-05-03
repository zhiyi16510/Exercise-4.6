package Exercise4_4;

public class Fruits {
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
	
	public String toString() {
		return name+" constructor is invoked"+"\nFruit\t\t: "+getName()+"\nTaste\t\t: "+getTaste();
	}
}
