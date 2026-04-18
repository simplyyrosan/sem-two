package lab2;

import java.util.Scanner;

class Bank {
    String bankName;
    double depositAmount;
    static double totalAmount = 0;

    void setBankName(String name) {
        this.bankName = name;
    }

    void setAmount(double amount) {
        if (amount >= 1000) {
            this.depositAmount = amount;
        } else {
            System.out.println("Minimum deposit is 1000. Setting amount to 1000.");
            this.depositAmount = 1000;
        }
        totalAmount += this.depositAmount;
    }

    void showData() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Deposit Amount: " + depositAmount);
        System.out.println("---------------------------");
    }

    static void findMinimum(Bank[] banks) {
        double min = banks[0].depositAmount;
        String minBank = banks[0].bankName;

        for (int i = 1; i < banks.length; i++) {
            if (banks[i].depositAmount < min) {
                min = banks[i].depositAmount;
                minBank = banks[i].bankName;
            }
        }

        System.out.println("Bank with Minimum Deposit: " + minBank);
        System.out.println("Minimum Amount: " + min);
    }
}

public class Q13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bank[] banks = new Bank[5];

        // Input using loop
        for (int i = 0; i < banks.length; i++) {
            banks[i] = new Bank();

            System.out.println("Enter Bank Name for Bank " + (i + 1) + ": ");
            String name = sc.nextLine();
            banks[i].setBankName(name);

            System.out.println("Enter Deposit Amount for " + name + ": ");
            double amount = sc.nextDouble();
            sc.nextLine(); // clear buffer

            banks[i].setAmount(amount);
        }

        // Display data
        System.out.println("\n--- Bank Details ---");
        for (int i = 0; i < banks.length; i++) {
            banks[i].showData();
        }

        // Total amount
        System.out.println("Total Amount Deposited: " + Bank.totalAmount);

        // Minimum deposit bank
        Bank.findMinimum(banks);

        sc.close();
    }
}