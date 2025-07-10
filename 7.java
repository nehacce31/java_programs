import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // Read the number of integers
        int product = 1;       // Initialize product as 1

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();    // Read each value
            product *= val;            // Multiply with the product
        }

        System.out.println(product);   // Print the final product
    }
}