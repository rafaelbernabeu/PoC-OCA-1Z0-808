package javaBasics;

public class DestroyingObjects {

    public static void main(String[] args) {
        Object obj = new Object();
        obj = null;

        System.gc(); // Java is free to ignore, is not guaranteed to run.
    }

    @Override
    protected void finalize() {
        System.out.println("might not get called and definitely won't be called twice");
    }

}
