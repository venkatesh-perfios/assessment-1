package problems;

public class Student {
	private int id = 1;
	String name = "Venkatesh";
	protected static float percentage = 93.4f;
	public boolean isEligible = true;

	public static void main(String[] args) {
		Student obj = new Student();
		System.out.println("Accessing private variable.....");
		System.out.println("ID: " + obj.id);
	}
}
