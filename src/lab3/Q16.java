package lab3;

public class Q16 {

    public static boolean isPalindrome(String s, int left, int right) {
        // base case: pointers crossed or equal
        if (left >= right) {
            return true;
        }

        // if characters don't match → not palindrome
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }

        // recursive call
        return isPalindrome(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        String str1 = "racecar";
        String str2 = "gohangasalamiimalasagnahog";

        System.out.println(str1 + " → " + isPalindrome(str1, 0, str1.length() - 1));
        System.out.println(str2 + " → " + isPalindrome(str2, 0, str2.length() - 1));
    }
}