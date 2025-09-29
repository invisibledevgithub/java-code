public class printhalfpyramid {

    public static void main(String[] args) {

        int n = 5;

        for (int line = 1; line <= n; line++) {

            // print numbers
            for (int number = 1; number <= line; number++) {
                System.out.print(number);
            }
            System.out.println(); // for coming out of inner loop and going to next line
        }

    }
}
