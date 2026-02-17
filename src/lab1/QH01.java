package lab1;

import java.util.Scanner;

public class QH01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b and c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a + b == c)
            System.out.println("a + b = c is Valid formula");
        else if (a == b - c)
            System.out.println("a = b - c is valid formula");
        else if (a*b == c)
            System.out.println("a*b = c is valid formula");
        else
            System.out.println("No fomula is valid");
        sc.close();
        
    }
}
