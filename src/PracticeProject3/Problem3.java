package PracticeProject3;
public class Problem3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Sample array
        int n = arr.length;
        int L = 2; // Start index
        int R = 6; // End index
        int sum = 0;

        // Calculate sum within the range
        for (int i = L; i <= R; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of elements within the range: " + sum);
    }
}
