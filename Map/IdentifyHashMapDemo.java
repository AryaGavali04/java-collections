import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentifyHashMapDemo {
    public static void main(String[] args) {

        /* both address string kay1 &kay2 will be different */
        // String key1 = new String("key");
        // String key2 = new String("key");
        // Map<String, Integer> map = new HashMap<>();
        // System.out.println("hi1");
        // map.put(key1, 1);
        // map.put(key2, 2);
        // System.out.println(key1.equals(key2));/* boolean */
        // System.out.println(map);
        /*
         * true
         * {key=2}
         */

        /* Now Ideentity Hash Map */
        String key1 = new String("key");
        String key2 = new String("key");
        Map<String, Integer> map = new IdentityHashMap<>();
        System.out.println("hi1");
        System.out.println(System.identityHashCode(key1));
        System.out.println(System.identityHashCode(key2));

        System.out.println(key1.hashCode());
        System.out.println(key2.hashCode());

        map.put(key1, 1);
        map.put(key2, 2);
        System.out.println(key1.equals(key2));/* boolean */
        System.out.println(map);
        /*
         * hi1
         * true
         * {key=2, key=1}
         */

    }
}
