package PracticeProject2;
interface A {
    default void show() {
        System.out.println("A");
    }
}

interface B extends A {
    default void show() {
        System.out.println("B");
    }
}

interface C extends A {
    default void show() {
        System.out.println("C");
    }
}

class D implements B, C {
    public void show() {
        B.super.show(); // Resolving ambiguity by explicitly calling the interface method
    }
}

public class Problem9 {
    public static void main(String[] args) {
        D obj = new D();
        obj.show();
    }
}
