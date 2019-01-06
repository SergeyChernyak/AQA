package thread;

import java.util.Arrays;
import java.util.Random;

public class MySecondThread extends Thread {

    public MySecondThread(String name) {
        super(name);
    }

    public void generateArray() {
        Random random = new Random();
        int n = 5;
        int[] array = new int[n];

        for (int i = 0 ; i < n; i++) {
            array[i] = random.nextInt(20);
        }
        System.out.println("Mas = " + Arrays.toString(array));
    }

    public void run () {
        generateArray();
    }

}
