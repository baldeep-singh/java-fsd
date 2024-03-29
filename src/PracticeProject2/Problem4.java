package PracticeProject2;
public class Problem4 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Divide by zero error
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
