package mutithreading.p_q;

public class Buffer {

    private int index = 0;
    private Item[] storage = new Item[6];

    // Function called by producer thread (生产方法)
    public synchronized void produce(Item item) {
        // producer thread waits while list is full
        while (index == storage.length) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        storage[index] = item;
        index++;

        //通知正在这个对象上wait的线程，让它继续执行
        // notifies the consumer thread that now it can start consuming
        notify();

    }

    // Function called by consumer thread (消费方法)
    public synchronized Item consume() {
        // consumer thread waits while list is empty
        while (index == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        index--;

        // Wake up producer thread
        notify();

        return storage[index];
    }

}
