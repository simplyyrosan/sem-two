package lab2;

import java.util.Scanner;

class Book {
    int bookId;
    double price;
    int quantity;

    static double totalAmount = 0;

    Book (int bookId, double price, int quantity) {
        this.bookId = bookId;
        this.price = price;
        this.quantity = quantity;
    }

    void displayDetails() {
        System.out.println("Book ID: " + bookId + " | price: " + price + " | quantity: " + quantity);
    }

    double calculate() {
        return price*quantity;
    }

}

public class Q03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Book[] ob = new Book[5];

        for (int i = 0; i<5; i++) {
            System.out.print("Enter Book ID, price, quantity: ");
            int bid = sc.nextInt();
            double p = sc.nextDouble();
            int q = sc.nextInt();
            
            ob[i] = new Book(bid, p, q);

        }

        for (int i = 0; i<5; i++) {
            ob[i].displayDetails();
            Book.totalAmount += ob[i].calculate();
        }
        
        System.out.println("""
                           ----------------------
                           Total price: """ + Book.totalAmount +
            "\n----------------------\n"
        );

        sc.close();
    }
    
}
