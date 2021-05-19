package Exercise4_6;

class AppleTotalPrice implements Price {
	double ap = 4.00; // price for apple more than 5 and less than 30
	double ap1 = 3.40; // price for apple more than 30
	
	public double total(double q) { // same method as in Price
		return ap*q; // with body
	}
	
	public double total(double q, double d) { // same method as in Price
		return (ap1*q)*(1-d); // with body
	}
}

class PapayaTotalPrice implements Price {
	double pp = 8.00; // price for papaya more than 5 and less than 30
	double pp1 = 7.6; // price for papaya more than 30
	
	public double total(double q) { // same method as in Price
		return pp*q; // with body
	}
	
	public double total(double q, double d) { // same method as in Price
		return (pp1*q)*(1-q); // with body
	}
}

class MelonTotalPrice implements Price {
	double mp = 5.00; // price for melon more than 5 and less than 30
	double mp1 = 4.20; // price for melon more than 30
	
	public double total(double q) { // same method as in Price
		return mp*q; // with body
	}
	
	public double total(double q, double d) { // same method as in Price
		return (mp1*q)*(1-d); // with body
	}
}
