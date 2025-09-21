public class elseifstatements {

    public static void main(String[] args) {

        // conditional statements in else if statements if (first condition (if)) is
        // true then else if will not get checked
        // if else is opposite of else if

        int age = 13;

        if (age >= 18) {
            System.out.println("adult");
        } else if (age >= 13 && age < 18) {
            System.out.println("teenager");
        } else {
            System.out.println("child");
        }

    }
}

// else if saves complier time
