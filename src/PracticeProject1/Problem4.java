
package PracticeProject1;
class ConstructorExample {
    private String message;

    // Default constructor
    public ConstructorExample() {
        this.message = "Default message";
    }

    // Parameterized constructor
    public ConstructorExample(String message) {
        this.message = message;
    }

    public void displayMessage() {
        System.out.println("Message: " + message);
    }

}

public class Problem4 
{
	public static void main(String[] args) {
        ConstructorExample obj1 = new ConstructorExample();
        obj1.displayMessage();

        ConstructorExample obj2 = new ConstructorExample("Custom message");
        obj2.displayMessage();
    }
	}