package bai18.thuchanh1;

public class RunnableDemo implements Runnable{
    private Thread t;
    private final String threadName;

    RunnableDemo(String name){
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Runnig " + threadName);
        try{
            for (int i = 4; i >0 ; i--) {
                System.out.println("Thread:"+threadName + "," + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread "+ threadName+ "interrupted");
        }
        System.out.println("THread "+ threadName + "exiting");
    }

    public void start() {
        System.out.println("staring " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }

    public static void main(String[] args) {
        System.out.println("main thred running...");
        RunnableDemo runnableDemo1 = new RunnableDemo("thread-1-HR-database");
        runnableDemo1.start();
        RunnableDemo runnableDemo2 = new RunnableDemo("thread-2-send-email");
        runnableDemo2.start();

        System.out.println("main thread stooped");

    }
}
