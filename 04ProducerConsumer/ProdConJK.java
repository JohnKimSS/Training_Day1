import java.util.LinkedList;

public class ProdCom {
    public static void main(String[] args) throws InterruptedException {
        final ProdCom pc = new ProdCom();
        // Consumer Thread
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException err) {
                    err.printStackTrace();
                }
            }
        });
        // Producer Thread
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException err) {
                    err.printStackTrace();
                }
        });
        // Starting the threads
        t1.start();
        t2.start();
        // using 'join' so that current thread invokes method other thread
        t1.join();
        t2.join();
    }
}

public static class ProdCom {
    LinkedList<Integer> list = new LinkedList<>();
    int size = 10;

    public void produce() throws InterruptedException {
        int val = 0;
        
        synchronized (this) {
            // Producer waits while list is full
            while (list.size() == size) {
                wait();

                System.out.println("Produced "+val);

                list.add(val++);
                // Notifies consumer thread to start consuming
                notify();

                Thread.sleep(1000);
            }
        }
        
    }
    
    public void consume() throws InterruptedException {
        
        synchronized(this) {
            while (list.size() == 0) {
                wait();

                int value = list.removeFirst();

                System.out.println("Consumed "+ value);

                notify();

                Thread.sleep(1000)
            }
        }
    }
}

    