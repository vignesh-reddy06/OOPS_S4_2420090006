package controlstatements;

import java.util.Scanner;

public class PrintNumbers {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter N: ");
			int N = sc.nextInt();

			for (int i = 1; i <= N; i++) {
			    System.out.print(i + " ");
			}
		}
    }
}

