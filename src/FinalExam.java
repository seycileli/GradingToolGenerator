package GradeActivity;

/**
 * This class determines the grade for a Final Exam.
 * The Numeric Score is rounded up to the next whole number
 * If it's fractional part is .5 or Greater
 */
public class FinalExam extends Grade {
    /**
     * The Extends keyword indicates that this Class inherits from another (superclass)
     *
     * The name of the SuperClass is listed AFTER the word Extends
     */

    private int numQuestions; // == Number of Questions
    private double pointsEach; // == Points for Each Question
    private int numMissed; // == Number of Questions Missed

    /**
     * The Constructor accepts as arguments the number
     * Of Questions on the Exam and the Number of
     * Questions the Students Missed
     */

    public FinalExam (int questions, int missed) {
        double numericScore; //To calculate the Numeric Score

        // == Set the numQuestions and numMissed fields
        numQuestions = questions;
        numMissed = missed;

        // == Calculate the points for each Question and Numeric Score to the Exam
        pointsEach = 100.0 / questions; //Points towards Each Question(s)
        numericScore = 100.0 - (missed * pointsEach);

        // == Calling Superclass's setScore method to the Numeric Score
        setScore(numericScore);
    }

    public int getNumQuestions() {
        return numQuestions;
    }

    public void setNumQuestions(int numQuestions) {
        this.numQuestions = numQuestions;
    }

    /**
     * The getsPointsEach method returns the pointsEach field.
     * @return
     */
    public double getPointsEach() {
        return pointsEach;
    }

    public void setPointsEach(double pointsEach) {
        this.pointsEach = pointsEach;
    }

    /**
     * The getNumMissed Method Returns numMissed field
     * @return
     */
    public int getNumMissed() {
        return numMissed;
    }

    public void setNumMissed(int numMissed) {
        this.numMissed = numMissed;
    }

}
