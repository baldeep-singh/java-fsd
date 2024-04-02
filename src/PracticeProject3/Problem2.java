package PracticeProject3;
import java.util.Arrays;

public class Problem2 {
    public static void main(String[] args) {
        int[] arr = {9, 4, 3, 6, 1, 2, 8, 7, 5}; // Sample array
        Arrays.sort(arr); // Sorting the array
        int fourthSmallest = arr[3]; // Fourth smallest element
        System.out.println("Fourth smallest element: " + fourthSmallest);
    }
}
