import java.util.*;

public class integeraandbsum {

    public static int sumDigit(int n) {
        int sumofDigits = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sumofDigits += lastDigit;

            n /= 10;
        }
        return sumofDigits;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("input an integer");
        int digits = sc.nextInt();

        System.out.println("The sum is " + sumDigit(digits));

        sc.close();

    }
}
