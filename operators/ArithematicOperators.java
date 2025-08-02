package operators;

import java.util.Scanner;

public class ArithematicOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter two numbers");
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c=a%b;
			int d = a-b;
			int e= a * b;
			int f=a/b;
			int g=a+b;

			System.out.println(c);
			System.out.println(d);
			System.out.println(e);
			System.out.println(f);
			System.out.println(g);
		}
	}
}
