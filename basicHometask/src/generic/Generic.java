package generic;


public class Generic<T> {

    T objT;

    public Generic(T obj) {
        this.objT = obj;
    }

    public T getObjT() {
        return objT;
    }

    void showType () {
        System.out.println("Type of T: " + objT.getClass().getName());
    }

}
