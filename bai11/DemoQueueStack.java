package bai11;



import java.util.*;

public class DemoQueueStack {
//    public static void main(String[] args) {

    //Queue
//        Queue<String> queue = new ArrayDeque<>();
//        queue.add("A");
//        queue.add("b");
//        queue.add("c");
//        queue.add("D");
//        while (!queue.isEmpty()) {
//            System.out.println(queue.poll());
//            break;
//        }

    //Stack
//        Deque<Integer> stack = new ArrayDeque<>();
//        stack.addLast(2);
//        stack.addLast(5);
//        stack.addLast(6);
//        stack.addLast(-1);
//        stack.addLast(2);
//        while (!stack.isEmpty()){
//            System.out.println(stack.pollFirst());
//        }
//    }

    public static void main(String[] args) {

        //Interface Comparator
        List<Student> students = new ArrayList<>();
        students.add(new Student("hung", 15));
        students.add(new Student("kien", 54));
        students.add(new Student("an", 15));
        students.add(new Student("ganh", 17));
        students.add(new Student("anh", 17));
//        students.remove(2);
//        students.sort(new CompareByName());
        students.sort(new CompareByAge());


        System.out.println(students);
    }


    public static class CompareByName implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }
    
    public static class CompareByAge implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            if(o1.getAge() == o2.getAge()){
                return o1.getName().compareTo(o2.getName());
            }
            return o1.getAge() - o2.getAge();
        }
    }


    public static class Student {
        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
