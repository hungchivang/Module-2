package bai18.baitapchanle;

public class TestThread {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();
        oddThread.start();
        try {
            oddThread.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        evenThread.start();

    }
}
