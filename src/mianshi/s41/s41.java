package mianshi.s41;

/**
 * 拼多多3
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class s41{
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(10));
        students.add(new Student(18));
        students.add(new Student(15));
        Collections.sort(students);
        System.out.print(students.get(1).age);
    }
}
class Student implements Comparable<Student> {
    Integer age;
    public Student(Integer age) {
        this.age = age;
    }
    @Override
    public int compareTo(Student s) {
        return s.age.compareTo(this.age);
    }
}

