package Exercise4_6;

public class RedApple extends Apple{

	public RedApple(String n, String t, int q, double p) {
		super(n, t, q, p);
	}
	
	public String printUses() {
		return "\n----- FACT -----"+"\nRed apple may be good for weight loss";
	}
	
	public String toString() {
		return printUses();
	}
	
}
