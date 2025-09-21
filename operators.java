
public class operators {

    public static void main(String args[]) {
        // Arithmetic operators (+,-,*,/,%) used to perform mathematical operations

        int a = 10;
        int b = 5;
        System.out.println("add = " + (a + b)); // binary operator beacuse it takes two operands
        System.out.println("sub = " + (a - b));
        System.out.println("mul = " + (a * b));
        System.out.println("div = " + (a / b));
        System.out.println("mod = " + (a % b));

        // unary operator (++ , --) it works with single operand

        int x = 10;
        int y = ++x; // pre-increment it first increments the value and then uses it in the
                     // expression
        System.out.println(x); // 11 increments the value of x
        System.out.println(y); // 11 uses the incremented value of x

        int m = 10;
        int n = m++; // post-increment it first uses the value in the expression and then
                     // increments it
        System.out.println(m); // 11 increments the value of m
        System.out.println(n); // 10 uses the original value of m

        // decrementExample();

        int s = 10;
        int t = --s; // pre-decrement
        System.out.println(s); // 9 decrements the value of s
        System.out.println(t); // 9 uses the decremented value of s

        int p = 10;
        int q = p--; // post-decrement
        System.out.println(p); // 9 decrements the value of p
        System.out.println(q); // 10 uses the original value of p

        // operators there are 5 types of operators
        // 1. Arithmetic operators (+,-,*,/,%) // used to perform mathematical
        // operations
        // 2. relational operators (>,<,>=,<=,==,!=) // used to compare two values
        // 3. logical operators (&&,||,!) // used to combine multiple boolean
        // expressions
        // 4. bitwise operators (&,|,^,~,<<,>>,>>>) // used to perform operations on
        // individual bits

        // 5. assignment operators (=,+=,-=,*=,/=,%=) // used to assign values to
        // variables
        // 6. ternary operator ( ? : ) // used to evaluate a boolean expression and
        // return one of two values
        int age = 18;
        String result = (age >= 18) ? "You are eligible to vote." : "You are not eligible to vote.";

        // Example usage
        System.out.println(result);
        // 7. instanceof operator
        // 8. type casting operators

    }
}
