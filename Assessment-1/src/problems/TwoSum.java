package problems;

import java.util.Scanner;

public class TwoSum {
	private static void findIndices(int size, int[] array, int target) {
		int first, second;
		boolean isAvailable = false;
		for (int i = 0; i < size; ++i) {
			first = array[i];
			
			for (int j = i + 1; j < size; ++j) {
				second = array[j];
				
				if (first + second == target) {
					isAvailable = true;
					System.out.println("(" + i + ", " + j + ")");
				}
			}
		}
		
		if (!isAvailable)
			System.out.println("None!");
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of array elements: ");
		int size = scanner.nextInt();
		
		System.out.println("Enter the array elements: ");
		int array[] = new int[size];
		for (int i = 0; i < size; ++i) {
			array[i] = scanner.nextInt();
		}
		
		System.out.println("Enter the target sum: ");
		int target = scanner.nextInt();
		
		System.out.println("Indices of all pair of numbers in the array which add up to " + target + " are: ");
		findIndices(size, array, target);
		
		scanner.close();
	}
}
