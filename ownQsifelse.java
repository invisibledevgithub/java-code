import java.util.Scanner;

public class ownQsifelse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();

        if (month == 2) {
            System.out.println("February have 28 days");
        } else if (month < 8) {
            if (month % 2 == 0) {
                System.out.println("month have 30 days");
            } else {
                System.out.println("month have 31 days");
            }

        } else {
            if (month % 2 == 0) {
                System.out.println("month have 31 days");
            } else {
                System.out.println("month have 30 days");
            }
        }
        sc.close();

        // int days monthNo == 2? 28 : monthno <=7 ? monthNo % 2==0 ? 30 : 31 monthNo %
        // 2 ==0 ? 31 : 30

    }
}