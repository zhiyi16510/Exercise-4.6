package Exercise4_2;

public class Fruits {
	private String name;
	
	public Fruits() { //constructor without argument
		name = " ";
	}
	
	public Fruits(String n) { //constructor with argument
		name = n;
		
		setName(n);
	}
	
	public void setName(String name) {
		name = " ";
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() { //overriding method
		return name + " constructor is invoked" + "\nFruit is\t\t: " + getName();
	}
}
