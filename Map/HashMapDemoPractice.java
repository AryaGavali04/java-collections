import java.util.*;

public class HashMapDemoPractice {
    public static void main(String[] args) {

        // HashMap<String, Integer> map = new HashMap<>();
        // map.put("bob", 1);
        // map.put("doremon", 2);
        // map.put("jack", 3);
        // map.put("nobita", 4);
        // map.put("naruto", 5);
        // System.out.println(map);

        // System.out.println("hi1");

        // /* this will writen only one kay */
        // Integer cartoon = map.get("bob");
        // System.out.println(cartoon);

        // System.out.println("hi2");
        // /* loops 1st */
        // Set<String> ListOfKeyValue = map.keySet();
        // for (String i : ListOfKeyValue) {
        //     System.out.println(map.get(i));
        // }

        // System.out.println("hi3");

        /* key Integer */

        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "bob");
        map1.put(2, "doremon");
        map1.put(3, "jack");
        map1.put(4, "nobita");
        map1.put(5, "naruto");
        System.out.println(map1);

        /* this will writen only one kay */
        String cartoon1 = map1.get(5);
        System.out.println(cartoon1);

        /* loops 1st */
        Set<Integer> ListOfKeyValue1 = map1.keySet();
        for (int i : ListOfKeyValue1) {
            System.out.println(map1.get(i));
        }

    }

}
