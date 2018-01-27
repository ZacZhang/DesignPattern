package mutithreading;

public class TestThread {
    public static void main(String args[]) {

//        Thread thread = new Thread(new Runnable() {
//            public void run() {
//                for (int i = 0; i < 100; i++) {
//                    System.out.println("Runner: " + i);
//                }
//            }
//        });
//
//        thread.start();

//        Runner r = new Runner();
//        Thread t = new Thread(r);
//        t.start();

        Runner r = new Runner();
        r.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("Main Thread: ------" + i);
        }
    }
}
