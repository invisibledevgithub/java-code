import java.util.Scanner;

public class AssQs1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float avg = (a + b + c) / 3;
        System.out.println("The average of three numbers is " + avg);

        sc.close(); // Close the Scanner to avoid resource leak warning
    }
}
