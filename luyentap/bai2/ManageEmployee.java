package luyentap.bai2;


import java.util.Scanner;

public class ManageEmployee {
    Scanner scanner = new Scanner(System.in);
    Employee[] employees = new Employee[0];

    public void show() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }
    }

    public Employee CreteEmployee(boolean isFUllTime) {
        System.out.println("nhap name :");
        String name = scanner.nextLine();
        System.out.println("nhap tuoi :");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap gioi tinh :");
        String gender = scanner.nextLine();
        if (isFUllTime) {
            System.out.println("nhap he so :");
            int heso = Integer.parseInt(scanner.nextLine());
            return new PartTIme(name, age, gender, heso);
        } else {
            System.out.println("nhap so buoi :");
            int sobuoi = Integer.parseInt(scanner.nextLine());
            return new PartTIme(name, age, gender, sobuoi);
        }

    }

    public void addEmployee(Employee employee) {
        Employee[] employeePart = new Employee[employees.length + 1];
        for (int i = 0; i < employees.length; i++) {
            employeePart[i] = employees[i];
        }
        employeePart[employeePart.length - 1] = employee;
        employees = employeePart;
    }


    public int find(String name) {
        for (int i = 0; i < employees.length; i++) {
            if (name.equals(employees[i].getName())) {
                return i;
            }
        }
        return -1;
    }

    public void delete(String name) {
        int index = find(name);
        Employee[] newArr = new Employee[employees.length - 1];

        if (index != -1) {
            for (int i = 0; i < newArr.length; i++) {
                if (i < index) {
                    newArr[i] = employees[i];
                } else {
                    newArr[i] = employees[i + 1];
                }
            }
            employees = newArr;
        }
    }

    public void Edit(String name) {
        int index = find(name);

        System.out.println("nhap so muon chuyen thanh");
        System.out.println("1. chuyen thanh Full time");
        System.out.println("2. chuyen thanh part time");
        int choice = Integer.parseInt(scanner.nextLine());
        if (choice == 1) {
            employees[index] = CreteEmployee(true);
        } else if (choice == 2) {
            employees[index] = CreteEmployee(false);
        }
    }

    public void tinhluong() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println("nhan vien co ten "+ employees[i].getName()+ "co luong la "+ employees[i].Salary());
        }
    }
}
