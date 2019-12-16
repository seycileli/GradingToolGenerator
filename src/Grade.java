package GradeActivity;

/**
 * A Class that holds Grades
 */

public class Grade {
    /**
     * Because the Score field is Delcared as Protected. Any class that inherits from this class
     * has direct access to it.
     */
    protected double score; // == Our Numeric Score

    /**
     * The setScore Method stores its arguments in the
     * score field
     * @param score
     */
    public void setScore(double score) {
        this.score = score;
    }

    /**
     * The getScore Method returns the Score Field
     * @return
     */
    public double getScore() {
        return score;
    }

    public char getGrade() {
        char letterGrade = ' ';

        if (score >= 90 && score <= 99) {
            letterGrade = 'A';
        } else if (score >= 80 && score < 90) {
            letterGrade = 'B';
        } else if (score >= 70 && score <= 79) {
            letterGrade = 'C';
        } else if (score >= 60 && score <= 69) {
            letterGrade = 'D';
        } else if (score >= 0 && score <= 59) {
            letterGrade = 'F';
        } else {
            System.out.println("Invalid Grade");
        }

        return letterGrade;
    }
}
