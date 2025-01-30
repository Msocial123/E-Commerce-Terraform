import java.math.BigInteger;
import java.util.Scanner;

public class ComplexAddition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for normal integer addition using bitwise approach
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Perform addition using bitwise logic
        int bitwiseSum = addWithoutPlus(num1, num2);
        System.out.println("🚀 Bitwise Addition Result: " + bitwiseSum);

        // Handling large numbers using BigInteger
        System.out.print("\nEnter first large number: ");
        BigInteger bigNum1 = scanner.nextBigInteger();

        System.out.print("Enter second large number: ");
        BigInteger bigNum2 = scanner.nextBigInteger();

        BigInteger bigSum = addLargeNumbers(bigNum1, bigNum2);
        System.out.println("🔢 BigInteger Addition Result: " + bigSum);

        scanner.close();
    }

    /**
     * Adds two numbers without using the '+' operator.
     * Uses bitwise XOR for sum and AND for carry propagation.
     */
    private static int addWithoutPlus(int a, int b) {
        while (b != 0) {
            int carry = (a & b) << 1;  // Carry is AND shifted left
            a = a ^ b;  // XOR gives sum
            b = carry;  // Update b to carry
        }
        return a;
    }

    /**
     * Adds two large numbers using BigInteger to handle extremely large values.
     */
    private static BigInteger addLargeNumbers(BigInteger a, BigInteger b) {
        return a.add(b);  // Using BigInteger's built-in add() method
    }
}
