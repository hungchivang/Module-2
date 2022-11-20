package luyentap.nhanvien;

import java.util.Comparator;

public class Compare implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}


class CompareBySalary implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getSalary() == o2.getSalary()){
            return o1.getId()- o2.getId();
        }
        return (int) (o1.getSalary()-o2.getSalary());
    }
}
