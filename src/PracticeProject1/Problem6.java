package PracticeProject1;
import java.util.HashMap;
import java.util.Map;

public class Problem6 {
    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "One");
        myMap.put(2, "Two");
        myMap.put(3, "Three");

        for (Map.Entry<Integer, String> entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
