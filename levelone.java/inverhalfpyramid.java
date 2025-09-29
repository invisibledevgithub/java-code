public class inverhalfpyramid {

    public static void inver_half_pyram(int n) {

        // outer loop
        for (int i = 1; i <= n; i++) {

            // inner loop
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        inver_half_pyram(5);
    }
}
