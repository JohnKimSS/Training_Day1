import java.util.LinkedList;

public static class ProdCon {
    LinkedList<Integer> list = new LinkedList<>();
    int size = 10;

    public void produce() throws InterruptedException {
        int val = 0;
        
        synchronized (this) {
            // Producer waits while list is full
            while (list.size() == size) {
                wait();

                System.out.println("Produced "+val);
                // Adding val to the list here e.g. producing
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
                // removing first item from list e.g. consuming (FIFO)
                int value = list.removeFirst();

                System.out.println("Consumed "+ value);

                notify();

                Thread.sleep(1000);
            }
        }
    }
}
