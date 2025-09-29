
public class pattern {

    public static void main(String[] args) {

        // nested loops
        for (int line = 1; line <= 4; line++) {

            // one line
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println(); // every line printing then again next line
        }

    }
}
