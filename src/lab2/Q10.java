package lab2;

// myInterface and studentTest package is created to run this program. 
import lab2.studentTest.Test;

public class Q10 {
    public static void main(String[] args) {
        Test ob = new Test();
        ob.inputDetails();
        ob.showDetails();
        int totalMarks = ob.totalMarks();
        int totalScore = ob.totalScore();
        System.out.println("Grand Total Marks: " + totalMarks);
        System.out.println("Grand Total Score: " + totalScore);
    }
}
