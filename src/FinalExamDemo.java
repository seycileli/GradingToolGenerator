package GradeActivity;

import java.util.Scanner;

/**
 * This program demonstrates the Final Exam Class
 * Which inherits from the class Grade
 */
public class FinalExamDemo {
    // == Will initialize and Declare code here so that we can use anywhere within the class

    static int questions, missed;
    // == Number of Questions && Number of Questions missed

    // == Creating static Scanner so that it can be called anywhere in class
    static Scanner keyboard = new Scanner(System.in);

    // == Creating FinalExam Object for use
    static FinalExam finalExam = new FinalExam(questions, missed);

    public static void main(String[] args) {

        testing();
    }

    public static void testing() {
        System.out.print("How many Questions are on " +
                "the final exam?");
        questions = keyboard.nextInt();

        // == Get the number of Questions the Student Missed
        System.out.print("How many Questions did the " +
                "student miss? ");
        missed = keyboard.nextInt();

        // == Displaying results
        System.out.println("Each Question counts as " +
                finalExam.getPointsEach() + " points");

        System.out.println("The Exam score is " +
                finalExam.getScore());

        System.out.println("The Exam grade is " +
                finalExam.getGrade());
    }
}

