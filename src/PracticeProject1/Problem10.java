package PracticeProject1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem10{
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog.";

        // Define the pattern
        Pattern pattern = Pattern.compile("\\bfox\\b");

        // Create the matcher
        Matcher matcher = pattern.matcher(text);

        // Find matches
        while (matcher.find()) {
            System.out.println("Match found: " + matcher.group());
        }
    }
}
