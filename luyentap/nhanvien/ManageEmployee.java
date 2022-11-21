package luyentap.nhanvien;

import java.text.SimpleDateFormat;
import java.util.*;

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
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap luong co ban");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap ngay sinh");
        String birthday = scanner.nextLine();
        System.out.println("Nhap gioi tinh");
        String gender = scanner.nextLine();

        return new Employee(name, age, salary, birthday, gender);
    }

    public void add() {
        listEmployee.add(CreateEmployee());
    }

        public int CheckID (int id){
            for (int i = 0; i < listEmployee.size(); i++) {
                if (listEmployee.get(i).getId() == id) return i;
            }
            return -1;
        }

        public void Edit( int id){
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
                            listEmployee.set(index, new Employee(id,name, listEmployee.get(index).getAge(), listEmployee.get(index).getSalary(), listEmployee.get(index).getBirthday(), listEmployee.get(index).getGender()));
                            break;
                        case 2:
                            System.out.println("Nhap tuoi can sua");
                            int age = Integer.parseInt(scanner.nextLine());
                            listEmployee.set(index, new Employee(id,listEmployee.get(index).getName(), age, listEmployee.get(index).getSalary(), listEmployee.get(index).getBirthday(), listEmployee.get(index).getGender()));
                            break;
                        case 3:
                            System.out.println("Nhap luong can sua");
                            double salary = Double.parseDouble(scanner.nextLine());
                            listEmployee.set(index, new Employee(id,listEmployee.get(index).getName(), listEmployee.get(index).getAge(), salary, listEmployee.get(index).getBirthday(), listEmployee.get(index).getGender()));
                            break;
                        case 4:
                            System.out.println("Nhap ngay sinh can sua");
                            String birthday = scanner.nextLine();
                            listEmployee.set(index, new Employee(id,listEmployee.get(index).getName(), listEmployee.get(index).getAge(), listEmployee.get(index).getSalary(), birthday, listEmployee.get(index).getGender()));
                            break;
                        case 5:
                            System.out.println("Nhap gioi tinh can sua");
                            String gender = scanner.nextLine();
                            listEmployee.set(index, new Employee(id,listEmployee.get(index).getName(), listEmployee.get(index).getAge(), listEmployee.get(index).getSalary(), listEmployee.get(index).getBirthday(), gender));
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

        public void Delete(int id){
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

        public int CheckName(String name){
            for (int i = 0; i < listEmployee.size(); i++) {
                if (name.equals(listEmployee.get(i).getName())) return i;
            }
            return -1;
        }

        public void SearchName (String name){
            int index = CheckName(name);
            if (index >= 0) {
                System.out.println(listEmployee.get(index).toString());
            } else {
                System.out.println("khong co ten nhan vien nay ");
            }
        }

        public void SearchBySalary () {
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


        public int findMonthOfBirth () throws Exception {
            Calendar calendar = Calendar.getInstance();
            for (int i = 0; i < listEmployee.size(); i++) {
                Date date = new SimpleDateFormat("dd/MM/yyyy").parse(listEmployee.get(i).getBirthday());
                if (date.getMonth() == calendar.get(Calendar.MONTH)) {
                    return i;
                }
            }
            return -1;
        }

        public void SearchBirthDay() throws Exception {
            int index = findMonthOfBirth();
            if (index >= 0) {
                System.out.println("nhan vien co sinh nhat trong thang la :");
                System.out.println(listEmployee.get(index).toString());
            } else {
                System.out.println("khong co ai sinh nhat trong thang nay");
            }
        }
    }



