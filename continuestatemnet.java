public class continuestatemnet {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // to skip an iteration so it will skip 3
            }
            System.out.println(i);
        }

    }
}
