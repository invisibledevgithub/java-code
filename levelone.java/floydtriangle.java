public class floydtriangle {

    public static void floydTriangle(int n) {

        // outer loop
        int counter = 1;

        for (int i = 1; i <= n; i++) { // lines

            // inner loop- how many times will cunter be printed
            for (int j = 1; j <= i; j++) { // counter
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        floydTriangle(5);
    }
}
