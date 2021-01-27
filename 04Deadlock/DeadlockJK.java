public class Deadlock {
    
    public static void main(String[] args) {
        Deadlock dl = new Deadlock();
        dl.returnArgs(args);

        Pets p1 = new Pets(2, "tabby", 8.0d);
        Pets p2 = new Pets(1, "labrador", 7.7d);

        System.out.println("program is starting");
        Runnable t1 = new Runnable() {

            @Override
            public void run() {
                try {
                    synchronized(p1) {
                        Thread.sleep(10);
                        synchronized(p2) {
                            System.out.println("Thread 1 is running");
                        }
                    }
                } catch (Exception err) {
                    err.printStackTrace();
                }
                
            } 

        }
    }

}
