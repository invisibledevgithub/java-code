import java.util.Scanner;

public class Typeconversion {

    public static void main(String[] args) {

        int a = 25;
        long b = a; // implicit type conversion (int to long)
        // long a = 25;
        // int b = a; // explicit type conversion (long to int) it may cause data loss
        // and this type
        // of conversion throws error beacuse long is larger than int. destination type
        // must be larger than source type. So it is a lossy conversion

        System.out.println(b);

        Scanner sc = new Scanner(System.in);
        // int num = sc.nextFloat(); // not possible explicit type conversion (float to
        // int)
        float number = sc.nextInt(); // implicit type conversion (int to float)
        System.out.println(number);

        sc.close(); // Close the Scanner to avoid resource leak warning

    }

}
