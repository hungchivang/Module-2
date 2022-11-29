package bai18.thuchanh1;

public class Count implements Runnable{
    private final Thread myThread;

    public Count(){
        myThread = new Thread(this,"my runnable thread");
        System.out.println("my thread created"+ myThread);
        myThread.start();
    }

    public Thread getMyThread(){
        return myThread;
    }

    @Override
    public void run() {
        try{
            for (int i = 0; i < 10; i++) {
                System.out.println("printing the count" + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("my thread interrupted");
        }
        System.out.println("my thread is over");
    }

    public static void main(String[] args) {
        Count count = new Count();
        try{
            while (count.getMyThread().isAlive()){
                System.out.println("main thread will be alive");
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread run is over" );
    }
}
