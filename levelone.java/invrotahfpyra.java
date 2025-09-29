public class invrotahfpyra {

    public static void inverted_rotated_halfpy(int n) {

        // outer loop
        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        inverted_rotated_halfpy(4);
    }
}

// // with while loop

// Scanner sc = new Scanner(System.in);

// int n = sc.nextInt();

// int stars = 1;

// int spaces = n - 1;

// int current_number_of_lines = 1;

// while(current_number_of_line<=total_number-of_lines)
// {

// // print spaces

// for (int i = 1; i <= spaces; i++) {
// System.out.print(" ");
// }

// // print stars

// for (int i = 1; i <= stars; i++) {
// System.out.print("*");
// }

// // pepare for next line

// System.out.println();
// spaces--;
// stars++;
// current_number_of_line++;

// }
