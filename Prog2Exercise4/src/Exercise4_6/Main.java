package Exercise4_6;

public class Main {

	public static void main(String[] args) {
		System.out.println(" ========== APPLE ==========");
		Apple a = new Apple("Apple", "Sweet", 10, 4.1);
		System.out.println(a+"\n");
		
		System.out.println(" ========== MELON ==========");
		Melon b = new Melon("Melon", "Sweet", 35, 13.50);
		System.out.println(b+"\n");
		
		System.out.println(" ========== PAPAYA ===========");
		Papaya c = new Papaya("Papaya", "Sweet", 8, 10);
		System.out.println(c+"\n");
		
		System.out.println(" ========== RED APPLE ==========");
		RedApple d = new RedApple("Red apple", "Sweet", 21, 4);
		System.out.println(d+"\n");
		
		System.out.println(" ========== GREEN APPLE ==========");
		GreenApple e = new GreenApple("Green apple", "Sour", 35, 5);
		System.out.println(e+"\n");

	}

}
