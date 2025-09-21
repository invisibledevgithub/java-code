public class typecasting {

    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // int marks = (int) 97.5f; // explicit type casting float to int
        // System.out.println(marks);

        float a = 67.5444444f;
        int b = (int) a; // explicit type casting float to int lossy conversion
        System.out.println(b);

        float marks = 99.9999f;
        int marks2 = (int) marks; // explicit type casting float to int lossy conversion
        System.out.println(marks2); // it will print 99 not 100 because it is lossy conversion and no rounding off

        char ch = 'a';
        char ch2 = 'b'; //
        int number = ch; // implicit type casting char to int
        int number2 = ch2;
        System.out.println(number); // it will print 97 because 'a' is 97
        System.out.println(number2); // it will print 98 because 'b' is 98
    }
}
// type casting is narrowing conversion