package stack;
import java.util.*;
public class StackDemo {
    public static void main(String[] srgs){
        //last in first out (lifo)
        Stack<Integer>stack=new Stack<>();
        stack.push(1);
        stack.push(5);
        stack.push(4);
        stack.push(2);
        System.out.println(stack);
      
        // stack.pop(2);//we cant do this chat gpt why
       
        Integer removeElement=stack.pop();
        System.out.println(removeElement);//or
         System.out.println(stack);//to see entire sstack
      
         Integer peek = stack.peek();
        System.out.println(peek);

        System.out.println(stack.isEmpty());

        System.out.println(stack.size());

        stack.add(0,10);//because stack extends vector  we can use vectors method
        System.out.println(stack);

        System.out.println("hi");
        int search = stack.search(10);//one based indixing
        System.out.println(search);

        //we can use linkList as stack
        LinkedList<Integer> linkedlist=new LinkedList<>();

        linkedlist.addLast(1);
         linkedlist.addLast(2);
          linkedlist.addLast(3);
           linkedlist.addLast(4);

            linkedlist.removeLast(); //equvalent to peek

             linkedlist.size();
               System.out.println(linkedlist ); 
              linkedlist.isEmpty();
                System.out.println(linkedlist);
               linkedlist.indexOf(1);
                System.out.println(linkedlist);


              //  ArryaList as stack
              ArrayList<Integer>arraylist=new ArrayList<>();
              arraylist.add(1);
              arraylist.add(2);
              arraylist.add(3);
              arraylist.add(4);

                    //thise are not dedicated mathod 
              arraylist.get(arraylist.size() -1);
               arraylist.remove(arraylist.size() -1);

    }
}
