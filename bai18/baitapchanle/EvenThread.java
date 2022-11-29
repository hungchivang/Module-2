package bai18.baitapchanle;

public class EvenThread extends Thread{
    @Override
    public void run() {
        try{
            for (int i = 0; i <=10 ; i+=2) {
                System.out.println("so chan :" + i);
                Thread.sleep(15);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Thread exiting");
    }


}
