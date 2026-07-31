import java.lang.ref.WeakReference;

import java.lang.ref.WeakReference;


                /*this is garbage collection demo */
public class GC {
    public static void main(String[] args){
                    /*Here we have allocated an object in heap mamory */
                    /*phone is pointer or strong referance
                           with referance we can access  object  
                    */

        Phone phone = new Phone("Apple","16 pro max");
        System.out.println(phone);

        /*printed null but 
             new Phone("Apple","16 pro max");   ///this is memory
             that is in the heap 

             But jvm will notice it has on corrosponding referance so it will destory it 
             so other can use that
        */


        //  phone=null;
        // System.gc();/* it will suggest jvm to do garbage collection */
        // //on one can use this after above line the it is in heap memory*/

        // System.out.println(phone);




            
/*   there is two things strong referance and weak refrance        */
    /*there is class called weakRefrance     */

    WeakReference<Phone> phoneweakReference = new WeakReference<>(new Phone("Apple","16 pro max"));
    System.out.println(phoneweakReference.get());  /*  .get Will get object*/
        System.gc();
        try{
            Thread.sleep(10000);
        }catch(Exception e){

        }
        System.out.println(phoneweakReference.get());




    }
 
}


class Phone{

    String brand;
    String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "phone{" +
                "brand='" + brand + '\'' +
                ", model=" + model +
                '}';
    }
}