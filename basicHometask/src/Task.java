import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Task {

    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();

    protected void hello () {
        System.out.println("Hello World");
    }

    protected double averageMas () {
        System.out.print("Enter length array = ");
        int n = scanner.nextInt();
        int[] array = new int[n];
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

    protected void arrayToStrAndStrToArray() {
        int[] array = {1,2,3,4,5};
        String arrayStr;
        char[] newArray;
        arrayStr = Arrays.toString(array);
        System.out.println("Array to String = " + arrayStr);
        String str1 = arrayStr.replace("[", "");
        String str2 = str1.replace("]", "");
        String str3 = str2.replace(",", "");
        String str4 = str3.replace(" ", "");
        newArray = str4.toCharArray();
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

    protected void arrayToBool () {
        int[] array = {1,0,3,4,0};
        System.out.println("Input int array = " + Arrays.toString(array));
        boolean[] arrayBool = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                    arrayBool[i] = true;
                } else
                    arrayBool[i] = false;
            }
        System.out.println("Int array to Boolean array = " + Arrays.toString(arrayBool));
    }

    protected void whereToGo () {
        System.out.print("Enter now time = ");
        double time = scanner.nextDouble();
        System.out.print("Enter money = ");
        double money = scanner.nextDouble();

        if (time >= 8 & time <= 12 & money >= 10) {
            System.out.println("Go to shop");
        } else if (time > 12 & time < 19 & money >= 50) {
            System.out.println("Go to cafe");
        } else if (time <= 19 & time > 12 & money < 50) {
            System.out.println("Go to neighbour");
        } else if (time > 19 & time <= 22){
            System.out.println("Watch TV");
        } else if (time > 22  & time <=24) {
            System.out.println("Go to bed");
        } else
            System.out.println("Wrong time");
    }

    protected void cycleBefore() {
        System.out.print("Enter value = ");
        int n = scanner.nextInt();
        while (n > 10) {
            System.out.println(n);
            n--;
        }
    }

    protected void cycleAfter () {
        System.out.print("Enter value = ");
        int n = scanner.nextInt();

        do {
            System.out.println(n);
            n--;
        } while (n > 10);
    }

    protected void printValueOfArray () {
        int[] array = new int[10];
        for (int i = 0; i<array.length; i++) {
            array[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(array));

        for (int x: array) {
            if (x == 5)
                System.out.println("Value = " + x);
        }
    }

}
