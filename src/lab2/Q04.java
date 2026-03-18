package lab2;

class Deposit {
    long principal;
    int time;
    double rate;
    double total_amt;

    Deposit() {
        this.principal = 0;
        this.time = 0;
        this.rate = 0;
    }

    Deposit(long principal, int time, double rate) {
        this.principal = principal;
        this.time = time;
        this.rate = rate;
    }

    Deposit(long principal, int time) {
        this.principal = principal;
        this.time = time;
        this.rate = 0;
    }

    Deposit(long principal, double rate) {
        this.principal = principal;
        this.time = 0;
        this.rate = rate;
    }

    void display() {
        System.out.println("Pricipal: " + principal + "\nTime: " + time + "\nRate: " + rate + "\nTotal amt: " + total_amt + "----------");
    }

    void cacl_amt() {
        total_amt = principal + (principal*rate*time)/100;
    }

}

public class Q04 {

    public static void main(String[] args) {
        Deposit dp1 = new Deposit();
        Deposit dp2 = new Deposit(100000, 4, 5);
        Deposit dp3 = new Deposit(10000, 5.6);
        dp1.cacl_amt();
        dp2.cacl_amt();
        dp3.cacl_amt();
        dp1.display();
        dp2.display();
        dp3.display();
    }
    
}
