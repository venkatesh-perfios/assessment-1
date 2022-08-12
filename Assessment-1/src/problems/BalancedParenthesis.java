package problems;

import java.util.Scanner;

public class BalancedParenthesis {
	private static boolean isParenthesisBalanced(String expression) {
		int balanceTracker = 0;
		for (int i = 0; i < expression.length(); ++i) {
			char currentSymbol = expression.charAt(i);
			
			if (currentSymbol == '(') {
				++balanceTracker;
			}
			else if (currentSymbol == ')') {
				--balanceTracker;
			}
		}

		if (balanceTracker == 0)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter an expression: ");
		String expression = scanner.nextLine();
		
		if (isParenthesisBalanced(expression)) {
			System.out.println("Parenthesis is balanced!");
		} else {
			System.out.println("Parenthesis is not balanced!");
		}
		
	
		scanner.close();
	}
}
