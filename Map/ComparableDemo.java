package Map;

import java.util.ArrayList;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args){
        List<Student> student = new ArrayList<>();
        student.add(new Student("Naruto",4.5));
        student.add(new Student("Baruto",2.3));
        student.add(new Student("Madara",5));
        student.add(new Student("Itachi",4));
        student.sort(null); /*here we dident give the comparator so it dosent know how to do natural  (null) means natural oriding*/
//                                         /*When to give comparator when we have to rite costum logic. No natural oriding*/
                                            /*We have to natural oriding than we have to implement "comparable interface " */
        System.out.println(student);

//        List<Integer> student1 = new ArrayList<>();
//        student1.add(4);
//        student1.add(6);
//        student1.add(2);
//        student1.add(5);
//        student1.sort(null);/*natural oriding will work*/
//        System.out.println(student1);

    }
}

class Student implements Comparable<Student> {
    private String name;

    private double gpa;

    Student(String name, double gpa){
        this.name=name;
        this.gpa=gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", gpa=" + gpa + "}\n"; }

    @Override
    public int compareTo(Student o) {
        return Double.compare(o.getGpa(),this.getGpa());
    }
}