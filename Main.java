import java.util.*;

public class Main{
    public static void main(String args[]){
        
// Overview
        List<String>list=new ArrayList<>();
         System.out.println(list.getClass().getName());//java.util.ArrayList

         List<String> List2= Arrays.asList("tiger","lion");
        //  System.out.println(List2);
        System.out.println(List2.getClass().getName());//java.util.Arrays$ArrayList this is nested static private class

        String[] array={"apple","banana","papaya"};
        List<String> list1 = Arrays.asList(array);
        // System.out.println("hi");
        // System.out.println(list1);
        System.out.println(list1.getClass().getName());//java.util.Arrays$ArrayList

//in new versions we can create by list.of
        // List<Integer> list3 = new ArrayList<>();

        List<Integer> list3 = List.of(1,2,3,4);
        System.out.println(list3);



        // ArrayList<Integer>list=new ArrayList<>();

        // list.add(10);
        //  list.add(20);
        //   list.add(30);
        //    list.add(40);
        //     list.add(50);
        //      list.add(60);
        //       list.add(70);
        //        list.add(80);


            //    to save overhead initilized the capacity so we set 1000
            // System.out.println(list.size());
            //  System.out.println(list.get(0)); 


    //            System.out.println("Elements in ArryaList:"+list);
    //            System.out.println(list.size());

    //            for(int i=0; i<list.size();i++)
    //             System.out.println(list.get(i));
    //         //we can iterate collection it self
    //  System.out.println("Another way \n");
    //         for(int x:list){
    //             System.out.println(x);
    //         }
    //          System.out.println(list.contains(909));
    }
}