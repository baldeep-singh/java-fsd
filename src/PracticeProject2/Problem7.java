package PracticeProject2;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Problem7 {
    public static void main(String[] args) {
        try {
            // Create a file
            File file = new File("test.txt");
            file.createNewFile();

            // Write to a file
            FileWriter writer = new FileWriter(file);
            writer.write("Hello, this is a test.");
            writer.close();

            // Read from a file
            FileReader reader = new FileReader(file);
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char)character);
            }
            reader.close();

            // Update a file (by appending)
            FileWriter writer2 = new FileWriter(file, true);
            writer2.write("\nThis is an appended line.");
            writer2.close();

            // Read from the updated file
            FileReader reader2 = new FileReader(file);
            int character2;
            while ((character2 = reader2.read()) != -1) {
                System.out.print((char)character2);
            }
            reader2.close();

            // Delete the file
            file.delete();
            System.out.println("\nFile deleted successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
