package problems;

class Singleton {
	private static Singleton obj = null;
	
	private Singleton() {}
	
	public static Singleton getObj() {
		if (obj == null)
			obj = new Singleton();
		
		return obj;
	}
}

public class SingletonTest {
	public static void main(String[] args) {
		Singleton obj1 = Singleton.getObj();
		Singleton obj2 = Singleton.getObj();
		
		System.out.println("Hashcode for obj1: " + obj1.hashCode());
		System.out.println("Hashcode for obj2: " + obj2.hashCode());
		System.out.println("Therefore, they both reference the same object");
	}
}
