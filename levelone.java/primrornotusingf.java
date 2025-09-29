public class primrornotusingf {

    // only for n>=2
    public static boolean isPrime(int n) {

        // corner cases
        // 2
        if (n == 2) {
            return true;
        }

        // boolean isPrime = true;
        // for (int i = 2; i <=Math.sqrt(n); i++)
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) { // completely dividing
                // isPrime = false;
                // break;
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        isPrime(5);
        System.out.println(isPrime(5));
    }
}
