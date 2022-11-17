package bai12.thuchanh3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student>list = new ArrayList<>();

        list.add(new Student("hung",20,"nam dinh"));
        list.add(new Student("an",20,"bac nin"));
        list.add(new Student("kien",55,"hanoi"));
        list.add(new Student("Hùng",30,"nam dinh"));
        list.sort(new CompareByAge());
        list.sort(new CompareByName());
        System.out.println(list);
    }


    public static class CompareByName implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public static class CompareByAge implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            if(o1.getAge() == o2.getAge()) return o1.getName().compareTo(o2.getName());
            return o1.getAge()- o2.getAge();
        }
    }
}

