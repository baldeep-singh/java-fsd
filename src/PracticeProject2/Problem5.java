package PracticeProject2;
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class Problem5{
    public static void main(String[] args) {
        try {
            if (true) {
                throw new CustomException("Custom exception occurred");
            }
        } catch (CustomException e) {
            System.out.println("Custom exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
