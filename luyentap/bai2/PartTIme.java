package luyentap.bai2;

public class PartTIme extends Employee {
    private double sobuoi;

    public PartTIme() {

    }

    public PartTIme(String name, int age, String gender,double sobuoi) {
        super(name, age, gender);
        this.sobuoi = sobuoi;
    }

    public double getSobuoi() {
        return sobuoi;
    }

    public void setSobuoi(double sobuoi) {
        this.sobuoi = sobuoi;
    }

    @Override
    public double Salary() {
        return sobuoi * 200000;
    }

    @Override
    public String toString() {
        return "PartTIme{" +
                "sobuoi=" + sobuoi +
                '}' + super.toString();
    }
}
