package lab3;

public class Q05 {
    public static <E> void printArr(E[] arr) {
        for(E ele : arr) {
            System.out.print(ele + " ");
        }
    }    

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4};
        printArr(arr);
    }
}
