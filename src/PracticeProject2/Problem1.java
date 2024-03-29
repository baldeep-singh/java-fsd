package PracticeProject2;
//Extending Thread class
class MyThread extends Thread {
 public void run() {
     System.out.println("Thread extended from Thread class is running");
 }
}

//Implementing Runnable interface
class MyRunnable implements Runnable {
 public void run() {
     System.out.println("Thread implemented from Runnable interface is running");
 }
}

public class Problem1 {
 public static void main(String[] args) {
     MyThread thread1 = new MyThread();
     thread1.start();

     MyRunnable myRunnable = new MyRunnable();
     Thread thread2 = new Thread(myRunnable);
     thread2.start();
 }
}
