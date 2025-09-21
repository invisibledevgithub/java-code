public class logicop {

    public static void main(String[] args) {
        // logical operators: && (AND), || (OR), ! (NOT) used with boolean values to
        // form compound boolean expressions

        // Logical AND condition only true if both operands are true

        // Logical OR condition true if at least one operand is true

        // Logical NOT inverts the boolean value

        System.out.println(3 > 2 && 5 > 2); // true beacause both are true
        System.out.println(3 > 2 && 5 < 0); // false because one is false

        // System.out.println(3 > 2 || 6 < 3); // true because one is true
        System.out.println(3 < 2 || 6 < 3); // false because both are false

        System.out.println(!(3 > 2)); // false because 3 is greater than 2
        System.out.println(!(3 < 2)); // true because 3 is not less than

    }
}
