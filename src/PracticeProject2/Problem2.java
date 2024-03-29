package PracticeProject2;
public class Problem2 {
    public static void main(String[] args) {
        // Sleep example
        System.out.println("Sleep example");
        try {
            Thread.sleep(2000); // Sleep for 2 seconds
            System.out.println("After sleep");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Wait example
        System.out.println("Wait example");
        Object obj = new Object();
        synchronized(obj) {
            try {
                obj.wait(2000); // Wait for 2 seconds
                System.out.println("After wait");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
