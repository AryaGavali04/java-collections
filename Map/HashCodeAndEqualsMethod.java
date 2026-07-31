import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
            //when ever you make costun class make shoure to  make hashcode method and equals method
public class HashCodeAndEqualsMethod {
    public static void main(String[] args){
        //creating person as key and desigation
        HashMap<Person,String> map=new HashMap<>();
        Person p1 = new Person("Alice",1);
        Person p2 = new Person("Bob",2);
        Person p3 = new Person("Alice",1);
        //putting in map     //tc O(1)
        map.put(p1,"Engineer");//hashcode1 --> index1  -->this will have diff hashcode fron p3 and will be in diff index
        map.put(p2,"Designear");//hashcode 2--> index2
        map.put(p3,"Manager");//hashcode3 --> index3  //index is diff because of objects


        System.out.println("HashMap size: " +map.size());
        System.out.println("Value HashMap size: " + map.get(p1));
        System.out.println("Value HashMap size: " + map.get(p3));
        System.out.println(p1);//will print memory type something











                            //another example
        Map<String,Integer> map1=new HashMap<>();
       map1.put("Shubham",90);//hashcode1--> index1   //String class ke andar hoga koi hash code vo genarate hoga
        map1.put("Neha",92);//hashcode2--> index2 will be there
        map1.put("Shubham",99);//hashcode1--> index1-->equals method -->replace

    }
}

//person class exdends objects karti he
//object ke aander ka hashcode
class Person{
    private String name;

    private int id;

    public Person(String name, int id){
        this.name=name;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
//        return super.hashCode(); //default while generating

                  //n    one more method in Objects class
        return Objects.hash(name,id);
    }

    @Override
    public String toString() {


//                     //n   toString() is for print
//        return super.toString();//super means object
        //n   by default print will run toString method
        return "id "+ id + "name :"+ name;


    }

    @Override
    public boolean equals(Object obj) {

        //n while checking equality check  id & name simultenesly
//        return super.equals(obj);

        if (this == obj){
            return true;
        }
        if(obj == null){return false;}
        //getClss()  method in object
        if (getClass() != obj.getClass()){return false;}

        Person other = (Person) obj;
                    ///*1*/ Objects is utility class
        /// *2nd */ to avoid null pointer exception we do   Objects.equals(name,other.getName());
//        return id == other.getId() && name.equals();  //insted of this systex is wrong
        return id == other.getId() && Objects.equals(name,other.getName());

    }
}