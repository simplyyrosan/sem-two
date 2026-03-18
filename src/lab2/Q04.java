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
        System.out.println();
    }

}

public class Q04 {


    
}
