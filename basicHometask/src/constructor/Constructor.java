package constructor;

import collection.Collection;
import javafx.print.Collation;

public class Constructor {

    private String className;
    private String authorClass;

    /*
    public Constructor(String className) {
        this.className = className;
    }*/

    public Constructor(String className, String authorClass) {
        this.className = className;
        this.authorClass = authorClass;
    }

    public String getClassName() {
        return className;
    }

    public String getAuthorClass() {
        return authorClass;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setAuthorClass(String authorClass) {
        this.authorClass = authorClass;
    }
}
