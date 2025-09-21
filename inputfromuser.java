import java.util.Scanner;

public class inputfromuser {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // System.in is a standard input stream
        // String input = sc.next(); // reads string input
        // System.out.println("You entered: " + input);

        String name = sc.nextLine(); // reads string input including space
        System.out.println("You entered: " + name);

        int num = sc.nextInt(); // reads integer input
        System.out.println("You entered: " + num);

        float price = sc.nextFloat(); // reads float input
        System.out.println("You entered: " + price);
        sc.close(); // close the scanner object to avoid resource leak warning
    }
}

// string num = sc.nextInt(); means if we give space it will not read it after
// it
