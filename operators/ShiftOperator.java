package operators;

import java.util.Scanner; 

public class ShiftOperator {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) { 
            System.out.println("Enter a number: ");
            int num = sc.nextInt();

            System.out.print("Enter number of positions to shift: ");
            int shift = sc.nextInt();

            int leftShift = num << shift;
            int rightShift = num >> shift;

            System.out.println("\nOriginal number: " + num);
            System.out.println("Left Shift (" + num + " << " + shift + ") = " + leftShift);
            System.out.println("Right Shift (" + num + " >> " + shift + ") = " + rightShift);
        }
    }
}
