package lab3;

public class Q13 {
    public static String Conv(int num, String res) {
        if (num==0)
            return res;
        return Conv(num/2, (num%2)+res);
    }

    public static void main(String[] args) {
        System.out.println(Conv(8, ""));
    }
}
