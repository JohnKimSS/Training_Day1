public class Threads {
    public static void main(String[] args) throws InterruptedException {
        final ProdCon pc = new ProdCon();
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