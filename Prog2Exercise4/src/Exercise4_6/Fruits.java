package Exercise4_6;

public abstract class Fruits {
	private String name, taste;

	public Fruits() {
		name = " ";
	}
	
	public Fruits(String n) {
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
