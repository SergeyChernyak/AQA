package oopClass;

public class Test {


    private String name;

    public Test(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void getClassName () {
        String className = Test.class.getName();
        System.out.println(className);
    }

}
