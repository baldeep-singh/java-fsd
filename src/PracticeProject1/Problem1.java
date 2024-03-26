package PracticeProject1;

public class Problem1 {
    public static void main(String[] args) {
        // Implicit type casting (widening conversion)
        int intValue = 10;
        double doubleValue = intValue;
        System.out.println("Implicit Type Casting: int to double - " + doubleValue);
        
        // Explicit type casting (narrowing conversion)
        double doubleVal = 15.75;
        int intVal = (int) doubleVal;
        System.out.println("Explicit Type Casting: double to int - " + intVal);
    }
}
