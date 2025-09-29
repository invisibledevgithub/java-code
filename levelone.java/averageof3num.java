import java.util.Scanner;

public class averageof3num {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter the third number: ");
        double num3 = sc.nextDouble();
        sc.close();

        double avg = average(num1, num2, num3);
        System.out.println("The average is: " + avg);
    }

    public static double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}
