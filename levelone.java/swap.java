public class swap {

    public static void swap(int x, int y) {
        System.out.println(x + " " + y); // 2 this // 2 this with temp

        int temp = x;
        x = y;
        y = temp;
        System.out.println(x + " " + y); // 3 with temp and swap value a=20 and b = 10
    }

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println(a + " " + b); // 1 this will print as main //function // 1 this print in loop 2 with temp now
        swap(a, b);
        System.out.println(a + " " + b); // 3 then returns to main fuction to complete reaming code // 4th with same
                                         // value with temp without swap
    }
}
