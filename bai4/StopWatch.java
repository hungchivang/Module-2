package bai4;

import java.sql.SQLOutput;
import java.util.Date;
import java.util.Scanner;

public class StopWatch {
    Date startTime, stoptime;
    long start, stop;

    public StopWatch() {
        this.startTime = new Date(System.currentTimeMillis());
        this.stoptime = new Date(System.currentTimeMillis());
        this.start = System.currentTimeMillis();
        this.stop = System.currentTimeMillis();
    }

    public void start() {
        this.startTime = new Date(System.currentTimeMillis());
        this.start = System.currentTimeMillis();
        System.out.println("thoi gian start la" + this.startTime);
    }

    public void stop() {
        this.stoptime = new Date(System.currentTimeMillis());
        this.stop = System.currentTimeMillis();
        System.out.println("thoi gian dung lai la" + this.stoptime);
    }

    public void displayMiliseconds() {
        System.out.println("thoi gian da troi qua la" + (this.stop - this.start) + "milisecond");
    }

    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao 1 de bat dau, 2 khi muon dung lai");
        int number = scanner.nextInt();
        do {

            if (number == 1) {
                watch.start();
                number = scanner.nextInt();
            }
            if (number == 2) {
                watch.stop();
                watch.displayMiliseconds();
                break;
            }
        }
        while (number==2);

    }
}

