package lab1;

public class Q5 {

    public static int sum_Of_Digits(int n) {
        int sum = 0;
        while (n>0) {
            int d = n%10;
            sum+=d;
            n/=10;
        }
        if (sum<10)
            return sum;
        else 
            return sum_Of_Digits(sum);
    }

    public static void main(String[] args) {
        
    }
    
}
