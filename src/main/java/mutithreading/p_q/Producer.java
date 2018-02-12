package mutithreading.p_q;

public class Producer implements Runnable{

    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            Item item = new Item(i);
            buffer.produce(item);
            System.out.println("Producer produced - " + item.id);

//            try {
//                Thread.sleep((long) (Math.random() * 1000));
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}
