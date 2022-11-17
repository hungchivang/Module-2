package bai12.thuchanh2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("nam" ,20,"nam dinh");
        Student student2 = new Student("hung" ,28,"ha noi");
        Student student3 = new Student("thu" ,24,"nam dinh");

        Map<Integer,Student> hashmap = new HashMap<>();
        hashmap.put(1,student1);
        hashmap.put(2,student2);
        hashmap.put(3,student3);
        hashmap.put(4,student1);
        System.out.println(hashmap);

        Set<Student> hashset = new HashSet<>();
        hashset.add(student1);
        hashset.add(student2);
        hashset.add(student3);
        hashset.add(student1);
        System.out.println(hashset);

    }
}
