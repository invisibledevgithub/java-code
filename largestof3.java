public class largestof3 {

    public static void main(String[] args) {

        int a = 15;
        int b = 20;
        int c = 25;

        if (a >= b && a >= c) {
            System.out.println("a is largest of 3");

        } else if (b >= c) {
            System.out.println("b is largest of 3");
        } else {
            System.out.println("c is largest of 3");
        }
    }
}
