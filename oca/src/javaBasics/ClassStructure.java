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
        System.out.println(this.getInstanceVariable());  // instance initializer
    }

    static {
        System.out.println(ClassStructure.classVariable);  // static initializer
    }

    private static final String IDENTIFIERS = "must begin with letters or $ or _   subsequent chars can be numbers.";
    private static String classVariable = "Rafael"; // static field
    private String instanceVariable = classVariable; // field

    /* multiple
     * line comment
     */
    public ClassStructure() {}  // no-args constructor

    public static void main(String[] args) {  //method main
        String localVariable = "Hello";
        System.out.println("Hello " + new ClassStructure().getInstanceVariable());
    }

    public String getInstanceVariable() {
        return instanceVariable;
    } // getter method

    public void setInstanceVariable(String instanceVariable) {
        this.instanceVariable = instanceVariable;
    } // setter method
}