/*

<<<< HASHSET >>>>

let's get back to our is-cool dayz, okay :D
do you rememder the term 'SET'???
it was in maths right??

i'm glad u still remember it :)

a set in mathematics is a collection of distinct objects, known as elements or members.
all the elements inside set should be unique, no duplicates allowed.

and when all these we want to implement in java, so we use HashSet data structure.

when we want very less time complexity in our code, or we want a very efficient program then we use Hashing.

let's discuss moreeeee!


=> HashSet in Java:

  - insert / add - O(1)
  - search / contains - O(1)
  - delete / remove - O(1)

0(1) means constant time complexity, which is very efficient.

having constant tc in all 3 operation is not really a cup of tea...
HashSet is the most efficient ds, that's why it is my most fav ds too B)

<<<< ITERATOR >>>>
in a HashSet, next() and hasNext() methods are used to iterate over the elements in a random order:

hasNext() -> returns a boolean value indicating whether there are more elements to iterate over.
if the iterator has reached the end of the set, it returns false. if there are more elements to iterate over, it returns true.

next() -> returns the next element in the iteration, or throws a NoSuchElementException if there are no more elements.
the order of elements is not guaranteed, as HashSet uses a hash table for storage and retrieval.

enough theory broda. let's start cookin!

*/

import java.util.HashSet;
import java.util.Iterator;
public class Hashing {
    
    public static void main (String[] args) {
        
        //creation
        HashSet<Integer> set = new HashSet<>();
        
        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1); //it doesn't store duplicate elements
        
        //size 
        System.out.println("size of set is: " + set.size());
        
        //print all elements
        System.out.println(set);
        
        //search - contains
        if(set.contains(1)) {
            System.out.println("set contains 1.");
        }
        if(!set.contains(6)) {
            System.out.println("does not contain.");
        }
        
        //delete
        set.remove(1);
        if(!set.contains(1)) {
            System.out.println("does not contain 1 - we deleted 1.");
        }
        
        //iterator
        Iterator it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        
    }
}
