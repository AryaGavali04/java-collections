import java.util.*;

class StringLengthComparator implements Comparator<String>{   // wethout this <String> gives warning
    @Override
    public int compare(String o1 ,String o2){
        //logic
        return o2.length()-o1.length();

    }
}

class IntegerLengthComparator implements Comparator<Integer>{   // wethout this <String> gives warning
    @Override
    public int compare(Integer o1 ,Integer o2){
        //logic
//        return 0;
//        return o1 - o2;
            return o2-o1;

    }
}

public class ComparatorMain {
    public static void main(String args[]){
//
//        // List<Integer>list1=Arrays.asList();
//        List<Integer>list1=new ArrayList<>();
//                list1.add(3);
//                list1.add(5);
//                list1.add(7);
//                list1.add(4);
//        System.out.println(list1);
//          list1.sort(null);
//
////        list1.sort(new IntegerLengthComparator());
////        list1.sort((a,b)->b-a);   //this is lamda experation
//        System.out.println(list1);



                        //      String      //
////        List<String>words=new ArrayList<>();
//        List<String>words=Arrays.asList("mango","banana","gava");
//        System.out.println(words);
//
////        Collections.sort(words);
////        Collections.sort(new StringLengthComparator()); this is not alloud
////        words.sort(null); // also can be done
//
//          words.sort(null);
//        System.out.println(words);
//
////        words.sort(new StringLengthComparator());
//
//        System.out.println(words);
//
//        List<Integer>myint=Arrays.asList(1,2,3,4,5);

    }
}



