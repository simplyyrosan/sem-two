package lab1;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter person's weight: ");
        double w = sc.nextInt();
        System.out.print("Enter person's height: ");
        double h = sc.nextInt();
        double bmi = w/(h*h);
        System.out.print("Enter person is ");
        if (bmi<18.5) 
            System.out.println("Under weight");
        else if (bmi>=18.5 && bmi < 25.0)
            System.out.println("Normal weight"); 
        else if (bmi>=25.0 && bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
        sc.close();

    }
}
