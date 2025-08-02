package arrays;

import java.util.Scanner;

public class SearchElements {

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

		        System.out.print("Enter element to search: ");
		        int key = sc.nextInt();
		        boolean found = false;

		        for (int num : arr) {
		            if (num == key) {
		                found = true;
		                break;
		            }
		        }

		        if (found)
		            System.out.println("Element found.");
		        else
		            System.out.println("Element not found.");
		 }
	}
}
