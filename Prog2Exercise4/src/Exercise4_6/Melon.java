package Exercise4_6;

public class Melon extends Apple {

	public Melon(String n, String t, int q, double p) {
		super(n, t, q, p);
	}
	
	public String printUses() {
		return "\n----- FACT -----"+"\nMelon could help in reducing blood pressure";
	}
	
	public String toString() {
		return printUses();
	}
	
}
