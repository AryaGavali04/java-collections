import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args){

//        SortedMap<String,Integer>map= new TreeMap<>((a, b) -> b.compareTo(a));
        SortedMap<String, Integer> map = new TreeMap<>(Comparator.reverseOrder());
        map.put("Naruto",99);
        map.put("Hinata",95);
        map.put("Baruto",79);
        map.put("Sasuke",98);

        System.out.println(map);

        SortedMap<Integer,String>map1= new TreeMap<>((a,b) -> b - a);
        map1.put(99,"Naruto");
        map1.put(95,"Hinata");
        map1.put(79,"Baruto");
        map1.put(98,"Sasuke");

        System.out.println(map);

    }
}

