public class prime {

    public static void main(String[] args) {

        int n = 32;
        if (n <= 1) {
            System.out.println("Number is not prime");
        }
        for (int i = 2; i <= Math.sqrt(n); i++)
            ;
        {
            if (n % 2 == 0) {
                System.out.println("Number is not prime");
                return;
            }
        }

        System.out.println("Number is  prime");
    }
}
