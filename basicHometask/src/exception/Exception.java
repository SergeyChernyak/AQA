package exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exception {

    public void divideZeroWithCatch() {
        try {
            int a = 1;
            int b = 0;
            int result = a / b;
            System.out.println(result);
        }
        catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
        }
    }


    public void divideZeroWithoutCatch () {
        try {
            int a = 1;
            int b = 0;
            int result = a / b;
            System.out.println(result);
        } finally {
            System.out.println("На ноль делить нельзя");
        }
    }

    public void nullPointer () {
            String string = null;
            try {
                if (string.equals("example"))
                    System.out.println("Same");
                else
                    System.out.println("Not Same");
            }
            catch (NullPointerException e) {
                    System.out.println("String empty");
            }
    }

    public void iOException () {
        String path = "./input.txt";
                //"./src/input.txt";
        String currentLine;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            while ((currentLine = bufferedReader.readLine()) != null) {
                System.out.println(currentLine);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

