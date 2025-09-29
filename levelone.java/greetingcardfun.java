public class greetingcardfun {

    // 1 function // 2 parameter // string data type
    public static void greetingCard(String firstName, String lastName) {
        System.out.println("good evening " + firstName + " " + lastName);
    }

    // 2 function // function overloading as function name is same but parameter are
    // different // 3 parameters // string data type
    public static String greetingCard(String firstName) { // we want function return value
        System.out.println("good evening " + firstName);
        return "good night";
    }

    // 3 fun // function overloading as function name is same but here data type is
    // different int data type
    public static void greetingCard(int age) {
        System.out.println("good evening " + age);
    }

    public static void main(String[] args) {

        // greetingCard("sohail"); // beacuse of 2nd function it is running // not
        // required to store good night //
        // it's on us to use that value in a variable or not // waht matters is wehter
        // we are passing the parameters or not

        // String lastName = "kumar" same like this with
        String reply = greetingCard("sohail");
        System.out.println(reply);

        greetingCard("sohail", "ahmed"); // 1fun
        greetingCard("vinay", "kumar"); // 1fun
        greetingCard("sudeep", "surya"); // 1fun
        greetingCard(21); // 3 fun
    }
}
