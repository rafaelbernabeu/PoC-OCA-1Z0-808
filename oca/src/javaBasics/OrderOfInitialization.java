package javaBasics;

/**
 * 1- Super class
 * 2- Static fields and static instance initializer blocks in the order in witch they appear
 * 3- Fields and instance initializer blocks in the order in witch they appear
 * 4- The constructor
 *
 * */
public class OrderOfInitialization {

    {
        System.out.println("Instance initializer run on every instantiation of the object");
    }

    static {
        System.out.println("Run only the first time that the class is loaded");
    }

    public OrderOfInitialization() {
        System.out.println("The constructor run after all.");
    }

    public static void main(String[] args) {
        new OrderOfInitialization();
        new OrderOfInitialization();
    }

}
