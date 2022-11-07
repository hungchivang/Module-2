package bai5;

public class Student {
    final private int roll;
    final private String name;
    private static String college = "BB";

    Student(int r, String n) {
        roll = r;
        name = n;
    }
    static   void change(){
        college = "CODEGYM";
    }
    void display() {
        System.out.println(roll + " " + name + " " + college);
    }
}
