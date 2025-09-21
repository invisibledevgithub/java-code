public class AssQs4 {

    public static void main(String args[]) {

        // qs 1
        int a = 2, b = 5;

        int exp1 = (a * b / a);
        int exp2 = (a * (b / a));

        System.out.print(exp1 + ",");
        System.out.print(exp2);

        int x = 200, y = 50, z = 100;
        if (x > y && y > z) {

            System.out.println("Hello");
        }
        if (z > y && z < x) {
            System.out.println("Java");
        }
        if ((y + 200) < x && (y + 150) < z) {
            System.out.println("Hello Java");
        }

        // qs 2
        x = y = z = 2;
        x += y;
        y -= z;
        z /= (x + y);
        System.out.println(x + " " + y + " " + z);

        // qs 3

        int x1 = 9, y1 = 12;
        int a1 = 2, b1 = 4, c = 6;
        int exp = 4 / 3 * (x1 + 34) + 9 * (a1 + b1 * c) + (3 + y1 * (2 + a1)) / (a1 + b1 * y1);
        System.out.println(exp);

        // qs 4
        int x2 = 10, y2 = 5;
        int exp3 = (y2 * (x2 / y2 + x2 / y2));
        int exp4 = (y2 * x2 / y2 + y2 * x2 / y2);
        System.out.println(exp3);
        System.out.println(exp4);
    }
}
