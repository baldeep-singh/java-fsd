package PracticeProject1;
 class AccessModifierExample {
    public void publicMethod() {
        System.out.println("Public Method");
    }
    
    private void privateMethod() {
        System.out.println("Private Method");
    }
    
    protected void protectedMethod() {
        System.out.println("Protected Method");
    }
    
    void defaultMethod() {
        System.out.println("Default Method");
    }
}


public class Problem2 {
    public static void main(String[] args) {
        AccessModifierExample example = new AccessModifierExample();
        example.publicMethod();
     
        example.protectedMethod();
        example.defaultMethod();
    }
}
