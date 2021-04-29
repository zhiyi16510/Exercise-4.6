package Exercise4_3;

public class Fruits {
private String name, taste;
	
	public Fruits() { //constructor without argument
		name = " ";
	}
	
	public Fruits(String n, String t) { //constructor with 2 argument
		name = n;
		taste = t;
		
	}
	
	public String getName() {
		return name;
	}
	
	public String getTaste() {
		return taste;
	}
	
	public String toString() { //overriding method
		return name + " constructor is invoked" + "\nFruit is\t\t: " + getName()+ "\nTaste is\t\t: " +taste;
	}
}
