public class invertedstar {

    public static void main(String[] args) {

        int n = 4;
        for (int i = 1; i <= n; i++) { // i=line we can write i = n

            for (int j = 1; j <= n - i + 1; j++) { // j=star n = 4 lines
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
