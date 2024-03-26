package PracticeProject1;
public class Problem3{
    public static void main(String[] args) {
        greet(); // calling static method directly
        Problem3 obj = new Problem3();
        obj.sayHello(); // calling non-static method using object
    }

    public static void greet() {
        System.out.println("Hello, World!");
    }

    public void sayHello() {
        System.out.println("Hello from non-static method!");
    }
}
