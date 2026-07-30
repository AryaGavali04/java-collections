import java.util.*;

public class HashMapDemo {
    public static void main(String[] args){

//        Hashmap implements Map HashMap is one of the implementation classes
                //new HashMap<>(17,0.5f) this is initial size and load factor
        HashMap<Integer,String> map = new HashMap<>();
        map.put(3,"piya");
        map.put(1,"neha");
        map.put(2,"akshit");
        map.put(4,"piya");
        System.out.println(map);

        String stud = map.get(3);
        System.out.println(stud);
        String stud1 = map.get(99);
        System.out.println(stud);//null as key is not present

        boolean exist=  map.containsKey(2);
        System.out.println(exist);
                //or
        System.out.println( map.containsKey(2));

        System.out.println( map.containsValue("neha"));


                //if we want to apply loop
//        method1
        Set<Integer> keys = map.keySet();
        for(int i: keys){
            System.out.println(map.get(i));
        }
//        method2
        //Set<Integer> keys = map.keySet();we dont need this
        for(int i: map.keySet() ) {
            System.out.println(map.get(i));
        }



    Set<Map.Entry<Integer,String>> entries = map.entrySet();
                        // this is the one of the type of appling loop
        for(Map.Entry<Integer,String> entry : entries){//so we want key and value
                        //we can do entry.set
            System.out.println(entry.getKey() + " :"+ entry.getValue());
        }


                    //To make it in Uppercase

        Set<Map.Entry<Integer,String>> maps = map.entrySet();
        for(Map.Entry<Integer,String>list:maps){
          /*1*/  System.out.println(list.getValue().toUpperCase());
            /*2*/list.setValue(list.getValue().toUpperCase());
        }
            /*2nd and than print*/System.out.println(map);


            //map.remove
        map.remove(2);
        System.out.println(map);


        boolean res =map.remove(3,"hi");
       System.out.println("Removed :"+res);
        System.out.println(map);

    List<Integer> lists = Arrays.asList(1,2,3,4,5,6);
        boolean exis=  lists.contains(6);
        System.out.println(exis);


    }
}
