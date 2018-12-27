package constructor;

public class Constructor {

    String className;
    String auhtorClass;

    /*
    public Constructor(String className) {
        this.className = className;
    }*/

    public Constructor(String className, String authorClass) {
        this.className = className;
        this.auhtorClass = authorClass;
    }

    public String getClassName() {
        return className;
    }

    public String getAuhtorClass() {
        return auhtorClass;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setAuhtorClass(String auhtorClass) {
        this.auhtorClass = auhtorClass;
    }
}
