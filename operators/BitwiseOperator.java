package operators;

public class BitwiseOperator {

    public static void main(String[] args) {
        int m = 5;
        int n = 3;

        System.out.println("Bitwise AND: " + (m & n));
        System.out.println("Bitwise OR: " + (m | n));
        System.out.println("Bitwise XOR: " + (m ^ n));
        System.out.println("Bitwise Complement (~m): " + (~m));  // Fixed spacing
    }
}


