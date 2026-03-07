package lab1;

public class Q04 {

    public static int z = 0;

    public static void permute(char[] arr, boolean[] used, String current) {

        if (current.length() == arr.length) {
            System.out.println(current);
            return;
        } 

        // Try every character
        for (int i = 0; i < arr.length; i++) {
            if (!used[i]) {
                used[i] = true;                    // choose
                permute(arr, used, current + arr[i]);  // explore
                used[i] = false;                   // un-choose (backtrack)
            }
        }
    }

    public static void main(String[] args) {
        char[] chars = {'c', 'a', 'r', 'b', 'o', 'n'};
        //char[] chars = {'c', 'a', 'r'};
        
        boolean[] used = new boolean[chars.length];

        permute(chars, used, "");
    }

}



