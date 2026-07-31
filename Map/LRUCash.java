import java.util.*;

public class LRUCash<K, V> extends LinkedHashMap<K, V> {/* LinkedHashMap<K,V>:why this tit is in generic */

    /*
     * #we wnt to make lrucash to be Linked hash map kay value pair
     * #So we make LRUCash as a sub class extend Linked hash map
     * # there will be three entries when 4 entry will com than list resrntly used
     * will be rwmoved
     */

    private int capacity;

    public LRUCash(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity=capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {/*this method return true*/
        return size()>capacity;//size ki ek nai fild hoti he see afterwards
    }

    public static void main(String[] args) {
        LRUCash<String,Integer> studentMap= new LRUCash<>(3);/*capacity is compelsary to pass */
        studentMap.put("naruto",100);
          studentMap.put("Baruto",12);
            studentMap.put("hinata",101);
              studentMap.put("sakura",99);
              System.out.println(studentMap);/*Heere i can print as it is nothing happen of LRU mathod. we can do ti by overriding method from LinkList  */
    }
}
