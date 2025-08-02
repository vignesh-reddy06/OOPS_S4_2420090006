package arrays;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            LinkedHashSet<Integer> unique = new LinkedHashSet<>();
            for (int num : arr) {
                unique.add(num);
            }

            System.out.println("Unique elements:");
            for (int num : unique) {
                System.out.println(num);
            }
        }
    }
}
