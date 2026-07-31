import java.util.*;

public class LinkedHashMapDemo {
    public static void main(String[] args) {

        /*
           #LinkedHashMap is sub class of hashmap.
         * #order maintain in LinkedHashMap why?
               
         * #In LinkedHashMap there is Double link List is there that keeps all the
         * entries in the order you kept or insert
         * # LinkedHashMap becomes slow dut to the over head of the linklist
         */
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>( );
        linkedHashMap.put("maruto", 100);
        linkedHashMap.put("Hashira1", 3);
        linkedHashMap.put("Hashira2", 2);

        /* this is one way of iterating */
        // Set<Map.Entry<String,Integer>> list =linkedHashMap.entrySet();
        // for(Map.Entry<String,Integer>lists:list){
        // System.out.println(lists.getKey() + " :"+ lists.getValue());
        // }

        /* another way of iterating */
        for (Map.Entry<String, Integer> list : linkedHashMap.entrySet())
            System.out.println(list.getKey() + ": " + list.getValue());


        /*VIMP  Suppose We have hash map than we can convert in to linkedHashMap by passing hashmap name to LinkedHashMap Constructor */

        HashMap<String, Integer> hashmap = new HashMap<>();
         LinkedHashMap<String, Integer> linkedHashMap1 = new LinkedHashMap<>(hashmap);

        hashmap.put("Naruto",100);
        hashmap.put("Tobirama",10);
        hashmap.put("Obito",56);

        /*store the data  res*/
        Integer res =hashmap.getOrDefault("Tobirama",000);
        System.out.println(res);

         Integer res2 =hashmap.getOrDefault("Hinata",000);/*so hinata is not in list so it print default value ie 000 */
        System.out.println(res2);

        hashmap.putIfAbsent("Madara",60);
        System.out.println(hashmap);


                    /*if we reput the value */
        hashmap.put("Obito",60);
        System.out.println(hashmap);
    }
                    /*remove witn Key and Value Do it afterwords*/

    }
