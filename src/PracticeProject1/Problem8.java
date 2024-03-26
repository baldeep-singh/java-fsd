package PracticeProject1;
public class Problem8 {
    public static void main(String[] args) {
        String str = "Hello";
        StringBuffer stringBuffer = new StringBuffer(str);
        StringBuilder stringBuilder = new StringBuilder(str);

        System.out.println("Original String: " + str);
        System.out.println("StringBuffer: " + stringBuffer);
        System.out.println("StringBuilder: " + stringBuilder);
    }
}
