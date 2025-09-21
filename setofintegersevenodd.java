import java.util.Scanner;

public class setofintegersevenodd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evensum = 0;
        int oddsum = 0;

        do {
            System.out.print("enter the number ");
            number = sc.nextInt();

            if (number % 2 == 0) {
                evensum += number;
            } else {
                oddsum += number;
            }

            System.out.print("Do u want to continue? Press 1 for yes or 0 for no");
            choice = sc.nextInt();
        } while (choice == 1);

        System.out.println("sum of even numbers: " + evensum);
        System.out.println("sum of odd numbers: " + oddsum);
        sc.close();
    }
}

// for(int choice=1; choice==1; ) {
// if(choice!=1) {
// break;
// }
// choice=sc.nextInt(); // here we are updating

// }