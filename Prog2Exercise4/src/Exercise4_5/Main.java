package Exercise4_5;

public class Main {

	public static void main(String[] args) {
		System.out.println(" ========== APPLE ==========");
		Apple a = new Apple("Apple", "Sweet", 10, 4.1, 0.2);
		System.out.println(a+"\n");
		
		System.out.println(" ========== MELON ==========");
		Melon b = new Melon("Melon", "Sweet", 'M', 5, 62, 18, 0.2);
		System.out.println(b+"\n");
		
		System.out.println(" ========== PAPAYA ===========");
		Papaya c = new Papaya("Papaya", "Sweet", "Hawaii", "Orange", 8, 0.2, 10);
		System.out.println(c+"\n");
		
		System.out.println(" ========== RED APPLE ==========");
		RedApple d = new RedApple("Red apple", "Sweet", 6, 4, 0.1);
		System.out.println(d+"\n");
		
		System.out.println(" ========== GREEN APPLE ==========");
		GreenApple e = new GreenApple("Green apple", "Sour", 8, 5, 0.3);
		System.out.println(e+"\n");

	}

}
