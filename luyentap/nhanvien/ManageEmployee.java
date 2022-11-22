package luyentap.nhanvien;

import javax.naming.PartialResultException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

import static java.lang.Integer.parseInt;

public class ManageEmployee {
    Scanner scanner = new Scanner(System.in);
    List<Employee> listEmployee = new ArrayList<>();

    public void show() {
        for (Employee employee : listEmployee) {
            System.out.println(employee.toString());
        }
    }

    public Employee CreateEmployee() {
        System.out.println("Nhap ten");
        String name = scanner.nextLine();
        System.out.println("Nhap tuoi");
        int age = validateAge();
        System.out.println("Nhap luong co ban");
        double salary = validateInt();
        System.out.println("nhap ngay sinh");
        int date = validateInt();
        System.out.println("nhap thang sinh");
        int month = validateMonth();
        System.out.println("nhap nam sinh");
        int year = validateInt();

        do {
            try {
                if (date > numberDate(month, year))
                    System.out.println("ngay chua chinh xac");
                break;
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("phai nhap so");
            }
        } while (true);

        LocalDate birthday = LocalDate.of(year, month, date);

        System.out.println("nhap gioi tinh");
        String gender = validateGender();
        return new Employee(name, age, salary, birthday, gender);
    }

    public void add() {
        listEmployee.add(CreateEmployee());
    }

    public int CheckID(int id) {
        for (int i = 0; i < listEmployee.size(); i++) {
            if (listEmployee.get(i).getId() == id) return i;
        }
        return -1;
    }

    public void Edit(int id) {
        int index = CheckID(id);
        if (index >= 0) {
            while (true) {
                System.out.println("thong tin muon sua :");
                System.out.println("1. Sua ten\n" +
                        "2. Sua tuoi\n" +
                        "3. Sua Luong co ban\n" +
                        "4. Sua ngay sinh\n" +
                        "5. Sua gioi tinh\n" +
                        "6. OK");
                System.out.println("Chon muc");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Nhap ten can sua");
                        String name = scanner.nextLine();
                        listEmployee.set(index, new Employee(id, name, listEmployee.get(index).getAge(), listEmployee.get(index).getSalary(), listEmployee.get(index).getBirthday(), listEmployee.get(index).getGender()));
                        break;
                    case 2:
                        int age = validateInt();
                        listEmployee.set(index, new Employee(id, listEmployee.get(index).getName(), age, listEmployee.get(index).getSalary(), listEmployee.get(index).getBirthday(), listEmployee.get(index).getGender()));
                        break;
                    case 3:
                        double salary = validateInt();
                        listEmployee.set(index, new Employee(id, listEmployee.get(index).getName(), listEmployee.get(index).getAge(), salary, listEmployee.get(index).getBirthday(), listEmployee.get(index).getGender()));
                        break;
                    case 4:
                        System.out.println("nhap ngay sinh can sua");
                        int date = validateInt();
                        System.out.println("nhap thang sinh can sua");
                        int month = validateInt();
                        System.out.println("nhap nam sinh can sua");
                        int year = validateInt();
                        LocalDate birthday = LocalDate.of(year, month, date);
                        listEmployee.set(index, new Employee(id, listEmployee.get(index).getName(), listEmployee.get(index).getAge(), listEmployee.get(index).getSalary(), birthday, listEmployee.get(index).getGender()));
                        break;
                    case 5:
                        System.out.println("Nhap gioi tinh can sua");
                        String gender = scanner.nextLine();
                        listEmployee.set(index, new Employee(id, listEmployee.get(index).getName(), listEmployee.get(index).getAge(), listEmployee.get(index).getSalary(), listEmployee.get(index).getBirthday(), gender));
                        break;
                    case 6:
                        return;
                }
                System.out.println("da sua thong tin nhan vien nay");
            }
        } else {
            System.out.println("khong co id cua nhan vien nay");
        }
    }

    public void Delete(int id) {
        int index = CheckID(id);
        if (index >= 0) {
            listEmployee.remove(index);
            System.out.println("da xoa nhan vien nay");
        } else {
            System.out.println("khong co id cua nhan vien nay");
        }
    }

    public void CompareByName() {
        listEmployee.sort(new Compare());
        System.out.println(listEmployee);
    }

    public int CheckName(String name) {
        for (int i = 0; i < listEmployee.size(); i++) {
            if (name.equals(listEmployee.get(i).getName())) return i;
        }
        return -1;
    }

    public void SearchName(String name) {
        int index = CheckName(name);
        if (index >= 0) {
            System.out.println(listEmployee.get(index).toString());
        } else {
            System.out.println("khong co ten nhan vien nay ");
        }
    }

    public void SearchBySalary() {
        if (listEmployee.size() < 3) {
            System.out.println("khong du 3 nhan vien");
        } else {
            listEmployee.sort(new CompareBySalary().reversed());
            System.out.println(listEmployee);
            System.out.println("3 nhan vien co luong cao nhat :");
            System.out.println(listEmployee.get(0).toString());
            System.out.println(listEmployee.get(1).toString());
            System.out.println(listEmployee.get(2).toString());
        }
    }


//    public int findMonthOfBirth() throws Exception {
//        Calendar calendar = Calendar.getInstance();
//        for (int i = 0; i < listEmployee.size(); i++) {
//            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(listEmployee.get(i).getBirthday());
//            if (date.getMonth() == calendar.get(Calendar.MONTH)) {
//                return i;
//            }
//        }
//        return -1;
//    }

    public int findMonthOfBirth() {
        for (int i = 0; i < listEmployee.size(); i++) {
            if (listEmployee.get(i).getBirthday().getMonthValue() == LocalDate.now().getMonthValue()) return i;
        }
        return -1;
    }

    public void SearchBirthDay() {
        int index = findMonthOfBirth();
        if (index >= 0) {
            System.out.println("nhan vien co sinh nhat trong thang la :");
            System.out.println(listEmployee.get(index).toString());
        } else {
            System.out.println("khong co ai sinh nhat trong thang nay");
        }
    }

    // Validate
    public boolean yearPrime(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }

    public int numberDate(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (yearPrime(year)) {
                    return 29;
                }
                return 28;
        }
        return -1;
    }

    public int validateBirthday() {
        System.out.println("nhap ngay sinh");
        int date = Integer.parseInt(scanner.nextLine());
        try {
            if (date > 0 && date <= numberDate(validateMonth(), CreateEmployee().getBirthday().getYear()))
                return date;
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Phai nhap dung ngay");
            return validateBirthday();
        }
    }

    public int validateMonth() {
        try {
            int month = Integer.parseInt(scanner.nextLine());
            if (month > 0 && month <= 12) return month;
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Phai nhap thang ( 1 -> 12 )");
            return validateMonth();
        }
    }

    public String validateGender() {
        try {
            String gender = scanner.nextLine();
            if (Objects.equals(gender, "nam") || Objects.equals(gender, "nu")) return gender;
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Phai nhap :nam or nu");
            return validateGender();
        }
    }

    public int validateAge() {
        try {
            int age = Integer.parseInt(scanner.nextLine());
            if (age >= 18 && age <= 65) return age;
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Phai nhap do tuoi ( 18 -> 65 )");
            return validateAge();
        }
    }

    public int validateInt() {
        try {
            int number = Integer.parseInt(scanner.nextLine());
            if (number > 0) return number;
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Phai nhap so ( > 0)");
            return validateInt();
        }
    }
}



