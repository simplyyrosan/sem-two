package studentTest;

import java.util.Scanner;

public class Student {
    public String name;
    public int roll;
    public void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name and Roll: ");
        name = sc.nextLine();
        roll = sc.nextInt();
    }
    public void showDetails() {
        System.out.println(name + " " + roll);
    }
}
