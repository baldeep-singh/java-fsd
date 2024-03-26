package PracticeProject1;
import java.util.ArrayList;
import java.util.List;

public class Problem5 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");

        for (String fruit : myList) {
            System.out.println(fruit);
        }
    }
}
