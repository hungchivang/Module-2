package bai18.baitapchanle;

public class OddThread extends Thread{

    @Override
    public void run() {
        try{
            for (int i = 1; i <=10 ; i+=2) {
                System.out.println("so le :" + i);
                Thread.sleep(10);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Thread exiting");
    }



}
