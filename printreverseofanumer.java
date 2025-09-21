public class printreverseofanumer {

    public static void main(String[] args) {

        int n = 10899; // if we want last digit of a number we % with 10 it will give riminder as 10
        // we if want remove last digit num/10

        while (n > 0) { // condition
            int lastDigit = n % 10;
            System.out.print(lastDigit + " ");
            n = n / 10; // n/ = 10 updation
        }
        System.out.println();
    }
}
