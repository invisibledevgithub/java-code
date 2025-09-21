import java.util.*;

public class exitloopwhenuserentermulitpleoften {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("enter your number : ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
            System.out.println(n);
        } while (true); // updation or until the user type 10 or until the condtion is true5

        sc.close();
    }
}
