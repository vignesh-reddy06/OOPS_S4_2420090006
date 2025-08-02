package controlstatements;

import java.util.Scanner;

public class PrintMultiplicationTable {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            System.out.println("Multiplication Table of " + num);
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i)); 
            }
        }
    }
}

