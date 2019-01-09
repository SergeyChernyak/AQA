package oopClass;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AccessToPrivateFieldWithReflection {
    private First first = new First();
    private Field field;
    private Method method;

    public void takeAllowPrivateField() {
        try {
            field = First.class.getDeclaredField("privateStr");
            field.setAccessible(true);
            String newStr = (String)field.get(first);
            System.out.println(newStr);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public void takeAllowPrivateMethod() {
        try {
            method = First.class.getDeclaredMethod("thirdMethod");
            method.setAccessible(true);
            System.out.println(method.invoke(first));
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}
