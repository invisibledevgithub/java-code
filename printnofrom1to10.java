import java.util.*;

public class printnofrom1to10 {

    public static void main(String[] args) {

        // int counter = 1;
        // while (counter <= 10) {
        // System.out.print(counter + " ");
        // counter++;
        // }
        // System.out.println();

        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int counter = 1;

        while (counter <= range) {
            System.out.print(counter + " ");
            counter++; // otherwise infinite loop
        }
        System.out.println();
        sc.close();
    }
}
