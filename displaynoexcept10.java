import java.util.Scanner;

public class displaynoexcept10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        do {
            System.out.print("enter your number: ");
            int n = scn.nextInt();

            if (n % 10 == 0) {
                continue;
            }
            System.out.println("number was : " + n);
        } while (true); // this code will go on till infinite

    }
}