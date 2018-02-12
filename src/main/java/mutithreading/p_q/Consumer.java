package mutithreading.p_q;

public class Consumer implements Runnable{

    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            Item item = buffer.consume();
            System.out.println("Consumer consumed - " + item.id);

//            try {
//                Thread.sleep((long) (Math.random() * 1000));
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}


