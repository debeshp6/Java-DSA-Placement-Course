/*

an ArrayList in java is a resizable-array implementation of the list interface. it is a part of the Java Collections Framework (JCF)
and is widely used to store and manipulate collections of objects.

  - non continious.
  - size variable.
  - we can store objects only in ArrayList.
  - ArrayLists are stored inside the heap.

*/


import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        //add elements
        list.add(0);
        list.add(2);
        list.add(3);
        
        System.out.println(list);
        
        //get elements
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        
        //add elements in between
        list.add(2, 5);
        System.out.println(list);
        
        //set element
        list.set(0, 8);
        System.out.println(list);
        
        //delete element
        list.remove(3);
        System.out.println(list);
        
        //size 
        System.out.println(list.size());
        
        //loops
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();
        
        //sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
