package Exercise4_6;

public class Papaya extends Apple {

	public Papaya(String n, String t, int q, double p) {
		super(n, t, q, p);
	}
	
	public String printUses() { // overriding method
		return "\n----- FACT -----"+"\nPapaya may reduce the risk of heart disease";
	}
	
	public String toString() { // overriding method
		return printUses();
	}

}
