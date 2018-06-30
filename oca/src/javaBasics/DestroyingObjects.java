package javaBasics;

public class DestroyingObjects {

    private static int objFinalized = 0;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            DestroyingObjects obj = new DestroyingObjects();
            obj = new DestroyingObjects();
        }
        System.gc(); // Java is free to ignore, is not guaranteed to run.
        Thread.sleep(1000L); //time to print the number of finalized objects
    }

    /**
     * might not get called and definitely won't be called twice
     */
    @Override
    protected void finalize() {
        System.out.println(++objFinalized);
    }

}
