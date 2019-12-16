package GradeActivity;

import java.util.Scanner;

public class GradeDemo {

    // == Creating a Grade Object so that we can use this throughout the class
    static Grade grade = new Grade();

    // == Creating a Scanner Object for input
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        testing();

    }

    public static void testing() {
        double testScore; //This will hold a Test Score

        // == Will receive test score from user
        System.out.print("Enter a numeric test score: ");
        testScore = keyboard.nextDouble();

        // == Sett Grade object score
        grade.setScore(testScore);

        // == Displaying letter Grade for score
        System.out.println("The Grade for that test is " + grade.getGrade());

    }
}
