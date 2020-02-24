import java.util.*;

class ThreadLifeCycle {
    public static void main(String[] args) throws Exception {
        AnimalRunnable p1 = new AnimalRunnable();
        Thread cat = new Thread(p1);
        cat.setName("cat");
        Thread dog = new Thread(p1);
        cat.setName("Dog");
        Thread cow = new Thread(p1);
        cat.setName("COW");
        System.out.println("Thread state of cat before calling start: " +

                cat.getState());
        cat.start();
        dog.start();
        cow.start();
        System.out.println("Thread state of cat before calling sleep: " +

                cat.getState());

        System.out.println("Thread state of cat before calling sleep: " +

                dog.getState());

        System.out.println("Thread state of cat before calling sleep: " +

                cow.getState());

        Thread.sleep(1000);
        System.out.println("Thread state of cat after calling sleep: " +

                cat.getState());

        System.out.println("Thread state of cat after calling sleep: " +

                dog.getState());

        System.out.println("Thread state of cat after calling sleep: " +

                cow.getState());
    }
}

class AnimalRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Run by: " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (Exception ex)

            {
                System.out.println(ex);
            }
        }
        System.out
                .println("Thread state: " + Thread.currentThread().getName() + " " + Thread.currentThread().getState());

        System.out.println("Exit of Thread: " + Thread.currentThread().getName());
    }
}