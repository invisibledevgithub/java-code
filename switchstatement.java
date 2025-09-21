public class switchstatement {

    public static void main(String[] args) {

        // switch statement

        int number = 3;

        switch (number) {

            case 1:
                System.out.println("samosa");
                break;

            case 2:
                System.out.println("burger");
                break; // if we dont apply break after true condition every statement will print that;s
                       // why break is necessary
            case 3:
                System.out.println("mango shake");
                break;
            default:
                System.out.println("we were dreaming");
        }
    }
}
// we can write cases in any order 2, 3, 1 .
// cases can be char , float also not necassary that it should be int.