package javaBasics;

/**
 * 1- Super class
 * 2- Static fields and static instance initializer blocks in the order in witch they appear
 * 3- Fields and instance initializer blocks in the order in witch they appear
 * 4- The constructor
 *
 * */
public class OrderOfInitializationFather {

    static {
//        System.out.println("var primitive static = " + varPrimitiveStaticInitialized); usage of a variable not declared yet.
//        System.out.println("var class static = " + varClassStaticInitialized); usage of a variable not declared yet.
    }

    {
//        System.out.println(varPrimitiveInitialized);  usage of a variable not declared yet.
//        System.out.println(varPrimitiveStaticInitialized);  usage of a variable not declared yet.
        System.out.println(varPrimitiveStaticInitialized);
        System.out.println(varClassStaticInitialized);
    }

    private int varPrimitiveInitialized = 9;
    private static int varPrimitiveStaticInitialized = 9;
    private String varClass;
    private String varClassInitialized = "9";
    private static String varClassStaticInitialized = "9";


    {
        System.out.println("var primitive static = " + varPrimitiveStaticInitialized);
        System.out.println("var class static = " + varClassStaticInitialized);
        System.out.println("var primitive = " + varPrimitiveInitialized);
        System.out.println("var class init = " + varClassInitialized);
        System.out.println("var class = " + varClass);

        varPrimitiveInitialized = 2;
        varPrimitiveStaticInitialized = 2;
        varClassInitialized = "2";
        varClassStaticInitialized = "2";
        varClass = "2";


        System.out.println("Instance initializer run on every instantiation of the object");
        System.out.println("var primitive static = " + varPrimitiveStaticInitialized);
        System.out.println("var primitive = " + varPrimitiveInitialized);
        System.out.println("var class static = " + varClassStaticInitialized);
        System.out.println("var class init = " + varClassInitialized);
        System.out.println("var class = " + varClass);
    }

    static {
        System.out.println("Run only the first time that the class is loaded");

        System.out.println("var primitive static = " + varPrimitiveStaticInitialized);
        System.out.println("var class static = " + varClassStaticInitialized);

        varPrimitiveStaticInitialized = 1;
        varClassStaticInitialized = "1";

        System.out.println("Instance initializer run on every instantiation of the object");
        System.out.println("var primitive static = " + varPrimitiveStaticInitialized);
        System.out.println("var class static = " + varClassStaticInitialized);
    }

    public OrderOfInitializationFather() {
        super();
        System.out.println("The constructor run after all.");

        System.out.println("var primitive static = " + varPrimitiveStaticInitialized);
        System.out.println("var primitive = " + varPrimitiveInitialized);
        System.out.println("var class static = " + varClassStaticInitialized);
        System.out.println("var class init = " + varClassInitialized);
        System.out.println("var class = " + varClass);

        varPrimitiveInitialized = 3;
        varPrimitiveStaticInitialized = 3;
        varClassInitialized = "3";
        varClassStaticInitialized = "3";
        varClass = "3";

        System.out.println("var primitive static = " + varPrimitiveStaticInitialized);
        System.out.println("var primitive = " + varPrimitiveInitialized);
        System.out.println("var class static = " + varClassStaticInitialized);
        System.out.println("var class init = " + varClassInitialized);
        System.out.println("var class = " + varClass);

    }

    public static void main(String[] args) {
        new OrderOfInitializationFather();
        new OrderOfInitializationFather(); //static initializer don't run twice.
    }

}
