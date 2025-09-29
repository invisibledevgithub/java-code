public class printhallowrecpattern {

    public static void hallow_rectangle(int totRows, int totcols) {

        // outer loop
        for (int i = 1; i <= totRows; i++) { // i = lines and lines= total rows

            // inner loop -columns
            for (int j = 1; j <= totcols; j++) {

                // cell -(i , j)
                if (i == 1 || i == totRows || j == 1 || j == totcols) {

                    // boundary cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        hallow_rectangle(4, 5);
    }

}
