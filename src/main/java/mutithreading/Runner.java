package mutithreading;

//public class Runner implements Runnable{
//    public void run() {
//        for (int i = 0; i < 100; i++) {
//            System.out.println("Runner: " + i);
//        }
//    }
//}

public class Runner extends Thread{
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Runner: " + i);
        }
    }
}
