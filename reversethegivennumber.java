public class reversethegivennumber {

    public static void main(String[] args) {
        // we need to reverse the original number only
        int n = 10899;
        int rev = 0;

        while (n > 0) { // condition
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n = n / 10; // updation or removing
        }
        System.err.println(rev);

    }
}

// n = 10899
// formula = rev = (rev*10) + last digit
// rev=0

// lD=9 rev=(0*10)+9=9
// ld=9 rev=(9*10)+9= 99

// ld=8 rev=(99*10)+8= 998
// same like that for above number
