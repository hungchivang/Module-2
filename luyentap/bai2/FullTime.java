package luyentap.bai2;

public class FullTime extends Employee {
    private double heso;

    public FullTime() {

    }

    public FullTime(String name, int age, String gender,double heso) {
        super(name, age, gender);
        this.heso = heso;
    }


    public double getHeso() {
        return heso;
    }

    public void setHeso(double heso) {
        this.heso = heso;
    }

    @Override
    public double Salary() {
        return heso * 5000000;
    }

    @Override
    public String toString() {
        return "FullTime{" +
                "heso=" + heso +
                '}' + super.toString();
    }
}
