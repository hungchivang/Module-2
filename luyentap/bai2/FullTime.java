package luyentap.bai2;

public class FullTime extends Employee {
    private double heso;

    public FullTime() {

    }

    public FullTime(String name, int age, String gender, double salary, double heso) {
        super(name, age, gender, salary);
        this.heso = heso;
    }


    public double getHeso() {
        return heso;
    }

    public void setHeso(double heso) {
        this.heso = heso;
    }

    @Override
    public double getSalary() {
        return heso * 5000000;
    }
}
