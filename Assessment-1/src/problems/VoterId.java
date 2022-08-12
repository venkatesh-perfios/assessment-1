package problems;

import java.util.Scanner;

public class VoterId {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = scanner.nextInt();
		
		if (age >= 18) {
			System.out.println("Congratulations! You are eligible to vote!");
		} else {
			System.out.println("Sorry, you are too young to vote");
		}
		
		scanner.close();
	}
}
