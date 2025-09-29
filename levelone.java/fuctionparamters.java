import java.util.*;

public class fuctionparamters {

    // public static void printHelloWorld(String name, int age) {
    // System.out.println("Hello " + name);
    // System.out.println("Your age is " + age);
    // return; // suppose void is int then return is necessary otherwisr it
    // willthrough error
    // // return 3;
    // }

    // we can create multiple fucctions in same class

    // public static void calculatesum(int a , int b)
    public static int calculatesum(int a, int b) { // function with parameters
        int sum = a + b;
        return sum;
        // System.out.println("The sum is " + sum);
    }

    public static void main(String[] args) { // main function which will help us to print hello world

        // printHelloWorld("Ritik", 20); // fuction call
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // calculatesum(a, b); // function call with arguments
        int sum = calculatesum(a, b); // arguments or actual parametres
        System.out.println("The sum is " + sum);

        sc.close();

    }

}
