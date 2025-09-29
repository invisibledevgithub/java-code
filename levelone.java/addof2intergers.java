public class addof2intergers {

    public static int sum(int a, int b) {
        int res = a + b;
        return res;
        // System.out.println(res); // this will not print as void cannot be converted
        // int0 int type as main function only prints the value but cNNOT RETURN The int
        // type

    }

    public static void main(String[] args) {

        // sum(2, 7);
        int res = sum(2, 7); // using return value
        System.out.println(res);
    }
}
