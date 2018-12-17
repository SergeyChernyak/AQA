import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task {

    private Scanner scanner = new Scanner(System.in);

    protected void hello () {
        System.out.println("Hello World");
    }

    protected double averageMas () {
        System.out.print("Enter length array = ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        Random random = new Random();
        double averageValue = 0;

        for (int i=0; i < array.length; i++) {
            array[i] = random.nextInt(20);
            averageValue += array[i];
        }
        averageValue = averageValue / array.length;
        System.out.println("Array = " + Arrays.toString(array));
        return averageValue;
    }

    protected int factorialValue () {
        System.out.print("Enter value for calculate Factotial = ");
        int value = scanner.nextInt();
        int res = 1;
        for (int i = 1; i <= value; i++) {
            res *= i;
        }
        return res;
    }

    protected void printPrice () {
        System.out.print("Enter id product = ");
        int id = scanner.nextInt();
        switch (id) {
            case 1:
                System.out.println("Product price = " + 1);
                break;
            case 2:
                System.out.println("Product price = " + 2);
                break;
            case 3:
                System.out.println("Product price = " + 3);
                break;
            case 4:
                System.out.println("Product price = " + 4);
                break;
            default:
                System.out.println("Product not found!");
                break;
        }
    }

    protected void checkValue () {
        System.out.print("Enter value = ");
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println("The number " + n + " is event!");
        } else
            System.out.println("The number " + n + " is not event!");
    }

    protected void arrayToStr () {
        int[] array = {1,2,3,4,5};
        String arrayStr = "";
        char[] newArray;
        arrayStr = Arrays.toString(array);
        System.out.println("Array to String = " + arrayStr);
        newArray = arrayStr.toCharArray();
        for (int i = 0; i < newArray.length; i++) {
            System.out.println("array[" + i + "] = " + newArray[i]);
        }
    }

    protected void addHelloToArray () {
        String[] array = {"1", "2", "3"};
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + "hello";
        }
        System.out.println("Array with hello = " + Arrays.toString(array));
    }

}
