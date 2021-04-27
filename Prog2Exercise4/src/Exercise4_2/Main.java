package Exercise4_2;

public class Main {

	public static void main(String[] args) {
		Apple apple = new Apple("Apple", 5, 10);
		System.out.println(" ---------- APPLE ----------");
		System.out.println(apple);
		System.out.println();
		
		Melon melon = new Melon("Melon", "Pale Green", "Japan", 5, 250);
		System.out.println(" ---------- MELON ----------");
		System.out.println(melon);
		
		Papaya papaya = new Papaya("Papaya", 9, 7.8);
		System.out.println(" ---------- PAPAYA ----------");
		System.out.println(papaya);
	
		RedApple red = new RedApple("Red Apple", "United States", 59, 6, 13, 10.48, 0.44);
		System.out.println(" ---------- US RED APPLE ----------");
		System.out.println(red);
		
		GreenApple green = new GreenApple("Green Apple", "Australia",'M', 3, 9, 58, 9.59, 97.5);
		System.out.println(" ---------- AUSSIE GREEN APPLE ----------");
		System.out.println(green);

	}

}
