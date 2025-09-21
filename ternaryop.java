public class ternaryop {

    public static void main(String[] args) {

        // another method to write if else in ternary we can writ if-else in one single
        // line.(rarely used)
        int number = 4;
        // ternary operator
        String type = ((number % 2) == 0) ? "even" : "odd";
        System.out.println(type);

        // marks of student will pass or fail

        int marks = 68;
        String reportcard = marks >= 33 ? "Pass" : "Fail";
        System.out.println(reportcard);
    }
}
