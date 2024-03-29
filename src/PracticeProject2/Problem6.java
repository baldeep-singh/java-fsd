package PracticeProject2;
public class Problem6 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            System.out.println(arr[6]); // Accessing out of bounds element
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
