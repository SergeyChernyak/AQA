import basicTask.Task;
import collection.Collection;
import constructor.Constructor;
import exception.Exception;
import generic.WorkWithGeneric;
import oopClass.Dog;
import oopClass.DogChild;
import oopClass.Test;

public class Main{

    public static void main(String[] args) {

        Task task = new Task();
        Test test = new Test();
        Dog dog = new Dog();
        DogChild dogChild = new DogChild();
        Collection collection = new Collection();
        Exception exception = new Exception();
        WorkWithGeneric workWithGeneric = new WorkWithGeneric();
        Constructor constructor = new Constructor(Constructor.class.getSimpleName(),"Sergey");


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
        test.getClassName();

        //end fist part
        */

         /*
        //collection

        //collection.collHash();
        //collection.collSet();

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

    }
}
