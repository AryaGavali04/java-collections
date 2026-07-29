import java.util.concurrent.CopyOnWriteArrayList;

import java.util.*;
public class CopyOnWriteDemo{
    public static void main(String[] args){

//
////example 1
//        CopyOnWriteArrayList<Integer>list=new CopyOnWriteArrayList<>();
//
//        // ArrayList<String>shoppinglist=new ArrayList<>();//referance should be of parent class i think so
//        // List<String>shoppinglist=new ArrayList<>();//here reference is not correct so:
//        List<String>shoppinglist=new CopyOnWriteArrayList<>();
//        shoppinglist.add("milk");
//        shoppinglist.add("eggs");
//        shoppinglist.add("bread");
//        System.out.println("Initial ShoppingList is :"+shoppinglist);
//
//
//        //we are appling loop on stable snapshot
//        for (String item:shoppinglist){ //this is runing in our original list
//
//            System.out.println(item);//read is happning on snapshot
//
//                if(item.equals("eggs")){
//                    shoppinglist.add("Butter");//write is happened on another coppy
////                    System.out.println("Mobified List is with Butter : "+shoppinglist);
//
//                }
//        }
//        //wehen loop will end than only shoping list reference will refer new maodified list through java
//        System.out.println("Mobified List is with Butter : "+shoppinglist);

//        List<String> sharedList = new ArrayList<>(); //Arrya List is mot suporting this thing inserting ie reading and writing at same time

        List<String> sharedList = new CopyOnWriteArrayList<>();//So CopyOnWriteArrayList can do that ArrayList cant
        sharedList.add("Item1");
        sharedList.add("Item2");
        sharedList.add("Item2");
        Thread readerThread = new Thread(() ->{
            try{
                while (true){
                    for (String item:sharedList){
                        System.out.println("Reading item: "+item);
                        Thread.sleep(100);
                    }
                }
            }catch (Exception e){
                System.out.println("Execption in reader thread: "+e);
            }
        });

        Thread writeThread = new Thread(() ->{
            try {
                Thread.sleep(500);
                sharedList.add("Item4");
                System.out.println("Add Item4 to the list");

                Thread.sleep(500);
                sharedList.remove("Item1");
                System.out.println("Removed Item1 from list");
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        });
readerThread.start();
writeThread.start();
    }
}
