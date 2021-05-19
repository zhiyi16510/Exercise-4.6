package Exercise4_6;

	class AppleDiscount implements DiscountRate{ // a subclass for interface DiscountRate
		public double discountRate() { // same method as in discount rate
		return 0.1; // with body
	}
}

	class PapayaDiscount implements DiscountRate{ // a subclass for interface DiscountRate
		public double discountRate() { // same method as in discount rate
			return 0.2; // with body
	}
}
	
	class MelonDiscount implements DiscountRate{ // a subclass for interface DiscountRate
		public double discountRate() { // same method as in discount rate
			return 0.3; // with body
		}
	}
