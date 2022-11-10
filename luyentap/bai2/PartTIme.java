package luyentap.bai2;

public class PartTIme extends Employee {
    private double sobuoi;

    public PartTIme() {

    }

    public PartTIme(double sobuoi) {
        this.sobuoi = sobuoi;
    }

    public PartTIme(String name, int age, String gender, double salary, double sobuoi) {
        super(name, age, gender, salary);
        this.sobuoi = sobuoi;
    }

    public double getSobuoi() {
        return sobuoi;
    }

    public void setSobuoi(double sobuoi) {
        this.sobuoi = sobuoi;
    }

    @Override
    public double getSalary() {
        return sobuoi * 200000;
    }
}
