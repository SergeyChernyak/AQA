package thread;

public class MyFirstThread extends Thread {

    public synchronized void printStr() {
        System.out.println("Synchronized method");
    }

    public void run() {
        printStr();
    }

}
