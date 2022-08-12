package test_student;

import problems.Student;

public class TestStudentProtected extends Student {
	public static void main(String[] args) {
		System.out.println("Accessing protected variable.....");
		System.out.println("Percentage: " + percentage);
	}
}
