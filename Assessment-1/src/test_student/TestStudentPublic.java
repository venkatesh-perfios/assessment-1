package test_student;

import problems.Student;

public class TestStudentPublic {
	public static void main(String[] args) {
		Student obj = new Student();
		System.out.println("Accessing public variable.....");
		System.out.println("Eligible: " + obj.isEligible);
	}
}
