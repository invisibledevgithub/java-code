import java.util.*;

public class evenoroddf {

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("enter an integer");
        num = sc.nextInt();

        if (isEven(num)) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }
        sc.close();
    }
}
