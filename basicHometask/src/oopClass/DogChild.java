package oopClass;

import java.util.Scanner;

public class DogChild extends Dog {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public double growth() {
            System.out.print("Dog`s child height = ");
            return 45;
    }

    @Override
    public double weight() {
        System.out.print("Dog`s child weight = ");
        return 8;
    }

    @Override
    public double motion() {
        System.out.print("Dog`s child run with speed = ");
        return 10;
    }

    @Override
    public double eat() {
        System.out.print("Dog`s child eat = ");
        return 2;
    }

    public void growth(double height) {
        System.out.print("Enter height of Dog (in sm.) = ");
        height = scanner.nextDouble();
        if (height > 50) {
            System.out.println("Build a booth height = 150 sm.");
        } else if (height < 50) {
            System.out.println("Build a booth height = 100 sm.");
        } else
            System.out.println("The dog lives in the aviary");
    }

    public void weight(double weight) {
        System.out.print("Enter weight of Dog (in kg.) = ");
        weight = scanner.nextDouble();
        if (weight <= 5) {
            System.out.println("Feed the dog");
        } else if (weight > 6 & weight < 10) {
            System.out.println("Stop feeding, go for a walk");
        } else
            System.out.println("Do not feed, and so big");
    }

    public void motion(double speed) {
       System.out.print("Enter dog speed = ");
       speed = scanner.nextDouble();
       if (speed >= 20 ) {
           System.out.println("goes to the competition");
       } else
           System.out.println("Learn to run");
    }

}
