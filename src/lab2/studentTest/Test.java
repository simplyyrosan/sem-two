package lab2.studentTest;
import lab2.myInterface.Sports;
import java.util.Scanner;

public class Test extends Student implements Sports {
    public int mark1;
    public int mark2;
    public void inputDetails() {
        super.inputDetails();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Mark1 and Mark2");
        mark1=sc.nextInt();
        mark2=sc.nextInt();
    }
    public void showDetails() {
        super.showDetails();
        System.out.println("Student's Mark1: "+mark1+"\n"+"Student's Mark2: "+mark2);
    }
    public int totalMarks() {
        return mark1 + mark2;
    }
}