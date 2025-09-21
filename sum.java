import java.util.Scanner;

public class sum {

    public static void main(String[] args) {
        // int a = 5;
        // int b = 10;
        // int sum = a + b;
        // System.out.println("The sum of " + a + " and " + b + " is: " + sum);

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;
        int product = a * b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
        System.out.println("The product of " + a + " and " + b + " is: " + product);

        sc.close(); // Close the Scanner to avoid resource leak warning
    }
}

// this is a single line comment
// this is also a single line comment

/*
 * this is a multiple line comment
 * this is also a multiple line comment
 * this is also a multiple line comment
 */
