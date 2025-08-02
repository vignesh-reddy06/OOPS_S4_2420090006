package arrays;

import java.util.Scanner;

public class SmallestAndLargestElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter number of elements: ");
			int n = sc.nextInt();
			int[] arr = new int[n];

			System.out.println("Enter " + n + " elements:");
			for (int i = 0; i < n; i++) {
			    arr[i] = sc.nextInt();
			}

			int min = arr[0];
			int max = arr[0];

			for (int num : arr) {
			    if (num < min) min = num;
			    if (num > max) max = num;
			}

			System.out.println("Smallest element: " + min);
			System.out.println("Largest element: "+max);
		}
	}
}
