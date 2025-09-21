import java.util.Scanner;

public class AssQs3 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = pencil + pen + eraser;
        float gst = (total * 18) / 100;
        total = total + gst;
        System.out.println("The total cost is " + total);
        sc.close(); // Close the Scanner to avoid resource leak warning

        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;
        double result = (f * b) + (i / c) - (d * s); // beacuse larger data type is double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println("The result is " + result);

    }

}
