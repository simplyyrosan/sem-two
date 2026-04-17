package lab3;

public class Q02 {
    public static void main(String[] args) {

        String[] colors = null;  // not initialized (can cause NullPointerException)

        try {
            // initializing array
            colors = new String[3];
            colors[0] = "Blue";
            colors[1] = "Black";
            colors[2] = "Green";

            // accessing elements
            for (int i = 0; i <= 3; i++) {  // intentional mistake (index 3 is invalid)
                System.out.println(colors[i]);
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        } catch (NullPointerException e) {
            System.out.println("Error: Array is not initialized.");
        } finally {
            System.out.println("Program execution completed.");
        }
    }
}