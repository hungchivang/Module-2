package luyentap.bai2;

import luyentap.bai1.Product;

import java.util.Scanner;

public class ManageEmployee {
    Employee[] employees = new Employee[0];

    public PartTIme CreteEmployeePartTime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap name :");
        String name = scanner.nextLine();
        System.out.println("nhap tuoi :");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap gioi tinh :");
        String gender = scanner.nextLine();
        System.out.println("nhap so buoi :");
        int sobuoi = Integer.parseInt(scanner.nextLine());
        PartTIme employeePartTime = new PartTIme(name, age, gender, sobuoi * 200000, sobuoi);
        return employeePartTime;
    }

    public void addPartTime(PartTIme partTIme) {
        Employee[] employeePart = new Employee[employees.length + 1];
        for (int i = 0; i < employeePart.length; i++) {
            employeePart[i] = employees[i];
        }
        employeePart[employeePart.length - 1] = partTIme;
        employees = employeePart;
    }

    public FullTime CreteEmployeeFullTime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap name :");
        String name = scanner.nextLine();
        System.out.println("nhap tuoi :");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("nhap gioi tinh :");
        String gender = scanner.nextLine();
        System.out.println("nhap he so :");
        int heso = Integer.parseInt(scanner.nextLine());
        FullTime employeeFullTime = new FullTime(name, age, gender,heso*5000000, heso);
        return employeeFullTime;
    }

    public void addFullTime(FullTime fullTime) {
        Employee[] employeeFull = new Employee[employees.length + 1];
        for (int i = 0; i < employeeFull.length; i++) {
            employeeFull[i] = employees[i];
            employeeFull[employeeFull.length - 1] = fullTime;
        }
        employees = employeeFull;
    }


    public void delete(int index) {
        if (index >= 0 && index < employees.length) {
            Employee[] newArr = new Employee[employees.length - 1];
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


    public void displaySalary() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getSalary());
        }
    }

    public void displayName() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getName());
        }
    }


}
