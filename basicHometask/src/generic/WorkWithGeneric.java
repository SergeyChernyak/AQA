package generic;

public class WorkWithGeneric {
    public void showTypeAndValueFromInputVariable() {
        Generic<Integer> objI = new Generic<>(123);
        objI.showType();
        int valueI = objI.getObjT();
        System.out.println("Value = " + valueI);
    }


}
