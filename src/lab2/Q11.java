/*
Define a class called Student with instance variables Roll, Name, DSA_Mark.
Also, the class consists of instance methods
• getdata( ): To provide input to the instance variable
• showdata( ): To display the value of instance variable.
Write a program to create the details of 5 students. Display the information of the students who has secured
the highest DSA_Mark.
*/

package lab2;

import java.util.Scanner;

class Student {
    int Roll;
    String Name;
    int DSA_Mark;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll Mark Name: ");
        Roll = sc.nextInt();
        DSA_Mark = sc.nextInt();
        Name = sc.nextLine();
    }

    void showdata() {
        System.out.printf("""
            Roll: %d
            Name: %s
            DSA Mark: %d
                """, Roll, Name, DSA_Mark);
    }

}
public class Q11 {
    public static void main(String[] args) {
        Student[] arr = new Student[5];

        for (int i=0; i<5; i++) {
            arr[i] = new Student();
            arr[i].getdata();
        }

        Student max = arr[0];

        for (int i=0; i<5; i++) {
            if (arr[i].DSA_Mark > max.DSA_Mark) 
                max = arr[i];
        }

        System.out.println("\nHighest Scorer:");
        max.showdata();
    }
}
