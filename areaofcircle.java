import java.util.Scanner;

public class areaofcircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        float pi = 3.14f;
        float area = pi * radius * radius;
        System.out.println("The area of circle with radius " + radius + " is: " + area);

        sc.close(); // Close the Scanner to avoid resource leak warning
    }
}
