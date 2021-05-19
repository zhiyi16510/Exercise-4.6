package Exercise4_6;

public class GreenApple extends Apple{

	public GreenApple(String n, String t, int q, double p) {
		super(n, t, q, p);
	}
	
	public String printUses() {
		return "\n----- FACT -----"+"\nThe pectin found in green apples can help you break down foods more efficiently";
	}
	
	public String toString() {
		return printUses();
	}

}
