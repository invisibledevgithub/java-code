
public class callbyvalueandreference {

    public static void swap(int a, int b) { // parameters

        // // swap
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        // swap -values exchange
        // int a = 5;
        // int b = 10;

        // // swap
        // int temp = a;
        // a = b;
        // b = temp;

        // System.out.println("a = " + a);
        // System.out.println("b = " + b);

        // swap -values exchange
        int a = 5;
        int b = 10;
        swap(a, b); // arguments
        System.out.println("a = " + a); // if we write print statement here instead in fuction this will print the value
        // of original a & b it will not swap because of call by value change will
        // happen in swap function only not in main function

        System.out.println("b = " + b);

    }

}