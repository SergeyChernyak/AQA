import basicTask.Task;
import collection.Collection;
import constructor.Constructor;
import exception.Exception;
import generic.WorkWithGeneric;
import oopClass.Dog;
import oopClass.DogChild;
import oopClass.Test;

public class Main{

    static Task task = new Task();
    static Test testNameFirst = new Test("Name1");
    static Test testNameSecond = new Test("Name2");
    static Dog dog = new Dog();
    static DogChild dogChild = new DogChild();
    static Collection collection = new Collection();
    static Exception exception = new Exception();
    static WorkWithGeneric workWithGeneric = new WorkWithGeneric();
    static Constructor constructor = new Constructor(Constructor.class.getSimpleName(),"Sergey");

    public static void main(String[] args) {
        /*
        //fist part task

        task.hello();
        System.out.println("Average array = " + task.averageMas());
        System.out.println("Factorial = " + task.factorialValue());
        task.printPrice();
        task.checkValue();
        task.arrayToStrAndStrToArray();
        task.addHelloToArray();
        task.arrayToBool();
        task.whereToGo();
        task.cycleBefore();
        task.cycleAfter();
        task.printValueOfArray();

        //end fist part
        */


        /*
        //Class and object

        System.out.println("First Name of Class: " + testNameFirst.getName());
        System.out.println("Second Name of Class: " + testNameSecond.getName());
        */

        /*
        //collection

        collection.collHash();
        collection.collSet();

        //end collection
        */

         /*
        //exception

        //exception.divideZeroWithCatch();
        //exception.divideZeroWithoutCatch();
        //exception.nullPointer();
        //exception.iOException();

        //end fist part
        */

        //workWithGeneric.showTypeAndValueFromInputVariable();

        /* constructor
        System.out.println("Class name: " + constructor.getClassName());
        System.out.println("Class author: " + constructor.getAuhtorClass());
     */

        /*
        for (int i = 0; i < 2; i++) {
            MyFirstThread myFirstThread = new MyFirstThread();
            myFirstThread.start();
        }

        for (int i = 0; i < 10; i++) {
            MySecondThread mySecondThread = new MySecondThread("Thread");
            mySecondThread.start();
            System.out.println("Started Thread:" + i);
        }
*/

    }
}
