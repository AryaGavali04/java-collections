import java.util.*;

public class ComparatorMain1 {
    private String name;
    private double gpa;

    public ComparatorMain1(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }


}

class MyMainmethod {         
    public static void main(String[] args) {

        List<ComparatorMain1> students = new ArrayList<>();
        students.add(new ComparatorMain1("ram",7.8));
        students.add(new ComparatorMain1("lav",7.6));
        students.add(new ComparatorMain1("ram",7.7));
        students.add(new ComparatorMain1("aram",7.6));

//        students.sort((o1,o2) ->(int)(o2.getGpa()- o1.getGpa()));  //this will not work here so
        // inssted of doing this in java 8 notes there is mathod comparator
        //cpomparing is static method gives function
//
        //(ComparatorMain1::getGpa) :-   ' :: ' this is called dubble colen operator method ref operator
        //method 2
//        Comparator<ComparatorMain1>comparing=Comparator.comparing(ComparatorMain1::getGpa).reversed().thenComparing(ComparatorMain1::getName);
//        students.sort(comparing);//this or
//        Collections.sort(students,comparing);//this
//        for(ComparatorMain1 s: students){
//            System.out.println(s.getName() + ": " + s.getGpa());
//        }
//
        //method 1
//        students.sort((o1,o2) ->{
//            if(o2.getGpa()-o1.getGpa()>0){
//                return 1;
//            } else if (o2.getGpa()-o1.getGpa()<0) {
//                return -1;
//            }else{
//
//                //so for gpa having same but want alphabeticaly than
//                //insted of raturn 0;
////                return 0;
//                return o1.getName().compareTo(o2.getName());
//            }
//
//        });
//                for(ComparatorMain1 s: students){
//            System.out.println(s.getName() + ": " + s.getGpa());
//        }



        System.out.println("hi");
    }
}