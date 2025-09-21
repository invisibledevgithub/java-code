public class typepromotion {

    public static void main(String[] args) {

        // char a = 'a';
        // char b = 'b';
        // // char c = a - b; // it will give error because char is not promoted to int
        // System.out.println((int) (b));
        // System.out.println((int) (a));
        // System.out.println(a); // it will print 'a'
        // System.out.println(b - a); // it will print 1 because 'b' is 98 and 'a' is 97
        // so 98 - 97 = 1

        short a = 5;
        byte b = 25;
        char c = 'c';
        byte bt = (byte) (a + b + c);
        // it will give error because short, byte and char are promoted to int

        System.out.println(bt); // it will print 97 + 5 + 25 = 127

        int a1 = 10;
        float b1 = 20.25f;
        long c1 = 25;
        double d = 30;
        double result = a1 + b1 + c1 + d; // int, float and long are promoted to double in this expression beacause
                                          // double is the largest data type

        System.out.println(result); // it will print 85.25}

        byte x = 5;
        // byte y = x * 2; // it will give error because x is promoted to int in this
        // expression
        byte y = (byte) (x * 2); // explicit type casting int to byte
        System.out.println(y);
    }
}

// Type promotion is only on expressions not on variables
