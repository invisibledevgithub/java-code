public class breakstatement {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; // it exits the code or leave the loop
            }
            System.out.println(i);
        }
        System.out.println(" i am out of the loop");
    }
}
