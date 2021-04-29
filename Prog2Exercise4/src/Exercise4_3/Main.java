package Exercise4_3;

public class Main {

	public static void main(String[] args) {
		Apple apple = new Apple("Apple","Sweet", 5, 10, 0.04);
		System.out.println(" ---------- APPLE ----------");
		System.out.println(apple); 
		System.out.println("\nTotal price\t\t: RM" +apple.totalPrice(10));
		System.out.println();
		
		Melon melon = new Melon("Melon","Sweet", "Pale Green", "Japan", 5, 250);
		System.out.println(" ---------- MELON ----------");
		System.out.println(melon);
		
		Papaya papaya = new Papaya("Papaya","Sweet", 9, 7.8);
		System.out.println(" ---------- PAPAYA ----------");
		System.out.println(papaya);
	
		RedApple red = new RedApple("Red Apple","Sour", "United States", 59, 6, 13, 0.04, 10.48, 0.44);
		System.out.println(" ---------- US RED APPLE ----------");
		System.out.println(red);
		System.out.println("\nTotal price\t\t: RM" +red.totalPrice(6));
		System.out.println();
		
		GreenApple green = new GreenApple("Green Apple","Sweet", "Australia",'M', 3, 9, 58, 0.05, 9.59, 97.5);
		System.out.println(" ---------- AUSSIE GREEN APPLE ----------");
		System.out.println(green);
		System.out.println("Total nutrition\t\t: "+green.nutrition(100, 9));

	}

}
