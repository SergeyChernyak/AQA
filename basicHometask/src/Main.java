import basicTask.Task;
import collection.Collection;
import constructor.Constructor;
import exception.Exception;
import generic.WorkWithGeneric;
import oopClass.AccessToPrivateFieldWithReflection;
import oopClass.Dog;
import oopClass.DogChild;
import oopClass.Test;

public class Main{

    static private Task task = new Task();
    static private Test testNameFirst = new Test("Name1");
    static private Test testNameSecond = new Test("Name2");
    static private Dog dog = new Dog();
    static private DogChild dogChild = new DogChild();
    static private Collection collection = new Collection();
    static private Exception exception = new Exception();
    static private WorkWithGeneric workWithGeneric = new WorkWithGeneric();
    static private Constructor constructor = new Constructor(Constructor.class.getSimpleName(),"Sergey");
    static private AccessToPrivateFieldWithReflection accessToPrivateFieldWithReflection = new AccessToPrivateFieldWithReflection();

    public static void main(String[] args) {

        accessToPrivateFieldWithReflection.takeAllowPrivateField();
        accessToPrivateFieldWithReflection.takeAllowPrivateMethod();
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
        System.out.println("Class author: " + constructor.getAuthorClass());
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
