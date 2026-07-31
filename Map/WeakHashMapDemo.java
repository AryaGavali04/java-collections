import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

    public static void main(String[] args) {
        /*
         * keys are string literls
         * #img is stored in string pool as string lilteral
         */
        /* 1st */
        // WeakHashMap<String, Image> imageCache = new WeakHashMap<>();
        // imageCache.put("img1", new Image("Image 1"));
        // imageCache.put("img2", new Image("Image 2"));
        // System.out.println(imageCache + "\n");

        // System.gc();
        // simulateApplicationRunning();
        // System.out.println("Cache after (some entries will be removedor cleared):" + imageCache);

                            /*2nd */
        // WeakHashMap<String, Image> imageCache1 = new WeakHashMap<>();
        // imageCache.put("img1",new Image("Image 1"));
        // imageCache.put("img2",new Image("Image 2"));/*insted of this */
        /*
         * we can use object
         * 
         */
        //  String key1 = new String("img1");/*these are strong references */
        //  String key2 = new String("img2");
        //  imageCache1.put(key1, new Image("Image 1"));
        //  imageCache1.put(key2, new Image("Image 2"));
        // /* Before garbage collection we will make it null */
        //  key1 = null;
        //  key2 = null;

        //  System.gc();
        // simulateApplicationRunning();
        // System.out.println("Cache after (some entries will be removedor cleared):" + imageCache1);

        /*alternat way

        */
        // imageCache1.put(new String("img1"), new Image("Image 1"));/*this is variable :new String("img1"), */
        // imageCache1.put(new String("img2"), new Image("Image 2"));
        // System.out.println(imageCache1 + "\n");

        // System.gc();
        // simulateApplicationRunning();
        // System.out.println("Cache after (some entries will be removedor cleared):" + imageCache1);

                        /*alternet way
                        
                        if you want to keep variable keep it in  different method*/

        
            WeakHashMap<String, Image> imageCache2 = new WeakHashMap<>();
            loadCash(imageCache2);
            
        System.gc();
        simulateApplicationRunning();
        System.out.println("Cache after (some entries will be removedor cleared):" + imageCache2);
    }

     static void loadCash(Map<String,Image>imageCache2){
    String k1=new String("img1");
      String k2=new String("img2");
            imageCache2.put(k1, new Image("Image 1"));/*this is variable :new String("img1"), */
             imageCache2.put(k2, new Image("Image 2"));
/*otuput:Cache after (some entries will be removedor cleared):{}
although there is string reference then also we are getting '{}' empty because of scope
*/
    }

       private static void simulateApplicationRunning() {
        try {
            System.out.println("Simulatiog application running....");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Image {

    String name;

    public Image(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        // return "Image{" +
        // "name='" + name + '\'' +
        // '}';

        return name;
    }
}
