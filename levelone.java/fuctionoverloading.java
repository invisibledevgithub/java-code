public class fuctionoverloading {

    // func to calc sum of 2 nums
    // public static int sum(int a, int b) {
    // // int sum = a + b; no need to store in variable
    // return a + b;
    // }

    // // func to calc sum of 3 nums
    // public static int sum(int a, int b, int c) {
    // // int sum = a + b; no need to store in variable
    // return a + b + c;
    // }

    // function overloading using data types

    // using int data type
    public static int sum(int a, int b) {
        return a + b;
    }

    // using float data type
    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println(sum(3, 5));
        System.out.println(sum(3.3f, 5.5f));

    }
}
