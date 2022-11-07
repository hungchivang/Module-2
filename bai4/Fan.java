package bai4;

public class Fan {
    int speed;
    double radius;
    String color;
    boolean off;

    public Fan(int speed, double radius, String color, boolean off) {
        this.speed = speed;
        this.radius = radius;
        this.color = color;
        this.off = off;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOff() {
        return off;
    }

    public void setOff(boolean off) {
        this.off = off;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private int slow() {
        return 1;
    }

    private int medium() {
        return 2;
    }

    private int fast() {
        return 3;
    }

    private boolean off() {
        return false;
    }

    private boolean on() {
        return true;
    }

    private double radius() {
        return 5;
    }

    private String color() {
        return "blue";
    }

    public Fan() {
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(3,10.0,"yellow",false);
        System.out.println("toc do la :"+ fan1.speed+ "ban kinh la : "+fan1.radius+ "mau sac :"+ fan1.color +" fan is on");
    }

}
