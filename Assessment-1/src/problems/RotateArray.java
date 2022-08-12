package problems;

import java.util.Scanner;

public class RotateArray {
	private static int[] rotateArray(int size, int[] originalArray, int steps) {
		int rotatedArray[] = new int[size];
		for (int i = 0; i < size; ++i) {
			rotatedArray[(i + steps) % size] = originalArray[i];
		}
		
		return rotatedArray;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of array elements: ");
		int size = scanner.nextInt();
		
		System.out.println("Enter the array elements: ");
		int originalArray[] = new int[size];
		for (int i = 0; i < size; ++i) {
			originalArray[i] = scanner.nextInt();
		}
		
		System.out.println("Enter the number of steps by which to rotate the array in anti-clockwise direction: ");
		int steps = scanner.nextInt();
		steps %= size;
		
		int rotatedArray[] = rotateArray(size, originalArray, steps);
		
		System.out.println("Array after anti-clockwise rotation by " + steps + " step(s) is: ");
		for (int i = 0; i < size; ++i) {
			System.out.print(rotatedArray[i] + " ");
		}
		
		scanner.close();
	}
}
