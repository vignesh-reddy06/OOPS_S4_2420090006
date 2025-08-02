package arrays;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)) {
			int[] marks = new int[6];
			int total = 0;

			System.out.println("Enter marks for 6 subjects:");
			for (int i = 0; i < 6; i++) {
			    marks[i] = sc.nextInt();
			    total += marks[i];
			}

			double average = total / 6.0;

			System.out.println("Subject marks:");
			for (int i = 0; i < 6; i++) {
			    System.out.println("Subject " + (i+1) + ": " + marks[i]);
			}
			System.out.println("Total: " + total);
			System.out.println("Average: "+average);
		}
	}
}
