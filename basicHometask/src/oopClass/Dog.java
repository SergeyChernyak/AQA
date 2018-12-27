package oopClass;

import oopInterface.Animal;

public class Dog implements Animal {
    @Override
    public double growth() {
        System.out.print("Dog height = ");
        return 50;
    }

    @Override
    public double weight() {
        System.out.print("Dog weight = ");
        return 10;
    }

    @Override
    public double motion() {
        System.out.print("Dog run with speed = ");
        return 15;
    }

    @Override
    public double eat() {
        System.out.print("Dog eat = ");
        return 3;
    }

}
