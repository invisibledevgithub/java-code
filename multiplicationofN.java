import java.util.*;

public class multiplicationofN {
    public static void printMultiplicationTable(int number) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "" + i + "=" + n * 1);

        }
        sc.close();
    }

    public static void main(String[] args) {
        printMultiplicationTable(5);

    }

}
