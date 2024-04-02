package PracticeProject3;
public class Problem1{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Sample array
        int n = arr.length;
        int steps = 5;

        // Right rotation logic
        int[] rotatedArray = new int[n];
        for (int i = 0; i < n; i++) {
            rotatedArray[(i + steps) % n] = arr[i];
        }

        // Print rotated array
        for (int num : rotatedArray) {
            System.out.print(num + " ");
        }
    }
}
