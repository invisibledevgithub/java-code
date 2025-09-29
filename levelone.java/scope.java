public class scope {

    // method scope
    public static void printS() {

        // int s = 45; // this will also not get print as print statement is outside the
        // function
        // we need use as a parameter only not directly
        // as prints is only its scope(place) not main function
    }

    int s = 45;

    public static void main(String[] args) {

        // System.out.println(s); // it will show error as it isnot resolved to a
        // variable

        // int s = 45;
        int s = 45;
        System.out.println(s);

        // block scope example

        // int p = 10;
        {
            int y = 8;
            System.out.println(y); // this is valid it will print
            // System.out.println(p); // this will print as main function is the block here
        }
        // System.out.println(y); as y is not in block scope
    }
}
