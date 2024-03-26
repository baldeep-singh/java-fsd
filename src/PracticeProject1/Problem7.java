package PracticeProject1;
public class Problem7 {
    private int outerVar = 10;

    class InnerClass {
        public void display() {
            System.out.println("Outer variable from Inner class: " + outerVar);
        }
    }

    public static void main(String[] args) {
        Problem7 outerObj = new Problem7();
        Problem7.InnerClass innerObj = outerObj.new InnerClass();
        innerObj.display();
    }
}
