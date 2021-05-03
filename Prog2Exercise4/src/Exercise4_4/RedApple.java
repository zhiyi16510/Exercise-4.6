package Exercise4_4;

public class RedApple extends Apple{
	
	public RedApple(String n, String t, int q, double p, double d) {
		super(n, t, q, p, d);
	}
	
	public String printUses() {
		return "\nRed apple may be good for weight loss";
	}
	
	public String toString() {
		return printUses();
	}
}
