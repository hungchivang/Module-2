package bai5;

public class TestStatic {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3","Skyactiv 3");
        System.out.println(Car.getNumberOfCar());
        Car car2 = new Car("Mazda 6","Skyactiv 6");
        System.out.println(Car.getNumberOfCar());
    }
}
