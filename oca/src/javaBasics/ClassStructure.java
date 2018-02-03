// comment until end of line

package javaBasics; // package declaration

import java.io.Serializable; // imports declarations
import java.lang.*;


/**
 * Javadoc multiple-line comment
 * @author Rafael.Bernabeu
 */
public class ClassStructure extends Object implements Serializable, Cloneable { // class declaration

    {
        System.out.println(this.getName());  // instance initializer
    }

    static {
        System.out.println(ClassStructure.staticName);  // static initializer
    }

    private static String staticName = "Rafael"; // static field
    private String name = staticName; // field

    /* multiple
     * line comment
     */
    public ClassStructure() {}  // no-args constructor

    public static void main(String[] args) {  //method main
        System.out.println("Hello " + new ClassStructure().getName());
    }

    public String getName() {
        return name;
    } // getter method

    public void setName(String name) {
        this.name = name;
    } // setter method
}