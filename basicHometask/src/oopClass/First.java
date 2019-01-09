package oopClass;

public class First {

    private String privateStr = "I am a private string";

    public void firstMethod() {
        System.out.println("First");
    }

    protected void secondMethod () {
        System.out.println("Second");
    }

    private void thirdMethod () {
        System.out.println("Third private method");
    }

    public static void pMethod () {
        System.out.println("PS Method");
    }
}
