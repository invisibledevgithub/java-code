import java.util.*;

public class oddoreven {

    public static void main(String[] args) {

        // number even or not
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("num is even");
        } else {
            System.out.println("num is odd");
        }
        sc.close(); // Close the Scanner to avoid resource leak warning
    }

}
