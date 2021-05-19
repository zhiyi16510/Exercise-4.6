package Exercise4_6;

public class Apple extends Fruits{
	private int quantity;
	private double price;
	
	public Apple(String n, String t, int q, double p) {
		super();
		quantity=q;
		price=p;
		
		Price at = new AppleTotalPrice();
		Price pt = new PapayaTotalPrice();
		Price mt = new MelonTotalPrice();
		
		System.out.println("Fruit\t\t: "+n);
		System.out.println("Taste\t\t: "+t+"\n");
		
		if(quantity<5) {
			System.out.printf("Quantity less than 5, total price is RM%.2f", price*quantity);
		} else if(quantity<=30 && quantity>=5) {
			if(n=="Apple" || n=="Red Apple" || n=="Green Apple") {
				System.out.printf("Quantity more than 5, total price is RM%.2f", at.total(q));
			} else if(n=="Papaya") {
				System.out.printf("Quantity more than 5, total price is RM%.2f", pt.total(q));
			} else if(n=="Melon") {
				System.out.printf("Quantity more than 5, total price is RM%.2f", mt.total(q));
			}
		} else {
			if(n=="Apple" || n=="Red Apple" || n=="Green Apple") {
				DiscountRate aa = new AppleDiscount();
				double ad = aa.discountRate();
				System.out.println("---- YOU GOT A 10% DISCOUNT ----");
				System.out.printf("Total price is RM%.2f", at.total(q, ad));
			} else if(n=="Papaya") {
				DiscountRate pp = new PapayaDiscount();
				double pd = pp.discountRate();
				System.out.println("---- YOU GOT A 20% DISCOUNT ----");
				System.out.printf("Total price is RM%.2f", pt.total(q, pd));
			} else if(n=="Melon") {
				DiscountRate mm = new MelonDiscount();
				double md = mm.discountRate();
				System.out.println("---- YOU GOT A 30% DISCOUNT ----");
				System.out.printf("Total price is RM%.2f", mt.total(q, md));
			}
		}
	}
	
	public String printUses() {
		return "\n----- FACT -----"+"\nApples contain compounds that can help fight asthma";
	}
	
	public String toString() {
		return printUses();
	}
}
