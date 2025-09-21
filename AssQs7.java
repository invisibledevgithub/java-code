import java.util.Scanner;

public class AssQs7 {
    public static void main(String[] args) {

        // calculator

        Scanner sc = new Scanner(System.in);
        System.out.println("enter week number(1-7):  ");
        int week = sc.nextInt();
        switch (week) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("Invalid input! please enter week between 1-7.");
        }
        sc.close();
    }

}
