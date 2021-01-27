import java.util.LinkedList;

public class ProdCom {
    public static void main(String[] args) throws InterruptedException {

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

    