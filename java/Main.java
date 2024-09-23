package java;

public class Main {
    public static void main(String[] args) {
        // This is a comment
        /* The code below will print the words Hello Word
        to the screen, and it is amazing
         */
        System.out.println("Hello World"); // This is a comment
        System.out.println(100);

        // Java variables

        String name = "John";
        System.out.println(name);

        int myNum = 15;
        System.out.println(myNum);

        int myNum2;
        myNum2 = 15;
        System.out.println(myNum2);

        /*
        this will declare the variable as "final" or "constant",
        which means unchangeable and read-only

        final int myNum3 = 15;
        myNum3 = 20;
        System.out.println(myNum3);

         */

        int x = 5, y = 10, z = 15;
        System.out.println(x + y + z);

        int a, b, c;
        a = b = c = 50;
        System.out.println(a + b + c);


        // Identifiers
        // Good
        int minutesPerHour = 60;

        // OK, but not so easy to understand what m actually is
        int m = 60;


        //Student data
        String studentName = "John Doe";
        int studentID = 15;
        int studentAge = 23;
        float studentFee = 75.25f;
        char studentGrade = 'B';

        // Print variables
        System.out.println("Student name: " + studentName);
        System.out.println("Student id: " + studentID);
        System.out.println("Student age: " + studentAge);
        System.out.println("Student fee: " + studentFee);
        System.out.println("Student grade: " + studentGrade);


        // Create integer variables
        int length = 4;
        int width = 6;
        int area;

        // Calculate the area of a rectangle
        area = length * width;

        // Print variables
        System.out.println("Length is: " + length);
        System.out.println("Width is: " + width);
        System.out.println("Area of the rectangle is: " + area);

    }
}