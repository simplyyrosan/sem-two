package lab3;



public class Q06 {

    public static <T> int count(T[] arr, T item) {
        int c = 0; 
        for (T ele: arr) {
            if (ele.equals(item))
            c++;
        } 
        return c;
    }
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 3, 4, 5};
        System.out.println(count(arr, 3));
        
        String[] arr2= {"Hello", "Hi", "Hi"};
        System.out.println(count(arr2, "Hi"));

        Double[] arr1 = {1.2, 1.3, 1.2};
        System.err.println(count(arr1, 1.2));
    }
}
