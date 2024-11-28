/*

<<<<<< HASHMAP >>>>>>

a HashMap is a hash table-based implementation of the Map interface. it stores key-value pairs and allows
for efficient lookup, insertion, and deletion of elements.

- key should always be unique, values can be same means it can repeat.
- hashmap is an unordered map. (jumbled)
- there can be two cases in insertion: exist or doesn't exist. [.put(key, value)]
  if exist, then it will update the value.
  if doesn't exist then, new pair is inserted.
- there can be two cases in search: exist or doesn't exist. [.get(key)]
  if exist, then it will print the value.
  if doesn't exist then, it will print null.
- there can be two cases in search: exist or doesn't exist. [.containsKey(key)]
  if exist, then it return true.
  if doesn't exist then, it will return false.

*/

import java.util.*;

public class Hashing {
    
    public static void main (String[] args) {
        //country(key), population(value)
        HashMap<String, Integer> map = new HashMap<>();
        
        //insertion
        map.put("india", 390);
        map.put("usa", 120);
        map.put("china", 450);
        System.out.println(map);
        map.put("china", 600);
        System.out.println(map);
        
        //search
        if(map.containsKey("china")) {
            System.out.println("key is present in the map.");
        } else {
            System.out.println("key is not present in the map.");
        }
        
        System.out.println(map.get("china")); //key exists
        System.out.println(map.get("indonesia")); //key doesn't exist  
        
    }
}



/* 

let's talk about a new kind of 'for loop' :)
for(<<type>> val: collection)

*/

public class Hashing {
    public static void main (String[] args) {
      int[] arr = {12, 34, 45};
        for(int val : arr) {
            System.out.print(val + " ");
        }  
    }
}



/* <<<<<< iteration in HashMap >>>>>> */

import java.util.*;
public class Hashing {
    
    public static void main (String[] args) {
        //country(key), population(value)
        HashMap<String, Integer> map = new HashMap<>();
        
        //insertion
        map.put("india", 390);
        map.put("usa", 120);
        map.put("china", 450);
        System.out.println(map);
        
        //iteration
        for(Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
}



//iteration to print the keys only
import java.util.*;
public class Hashing {
    
    public static void main (String[] args) {
        //country(key), population(value)
        HashMap<String, Integer> map = new HashMap<>();
        
        //insertion
        map.put("india", 390);
        map.put("usa", 120);
        map.put("china", 450);
        System.out.println(map);
        
        //key iteration
        Set<String> keys = map.keySet();
        for(String key : keys);
        System.out.println(key + " " + map.get(key));
    }
}



//remove 
import java.util.*;
public class Hashing {
    
    public static void main (String[] args) {
        //country(key), population(value)
        HashMap<String, Integer> map = new HashMap<>();
        
        //insertion
        map.put("india", 390);
        map.put("usa", 120);
        map.put("china", 450);
        System.out.println(map);
        
        map.remove("china");
        System.out.println(map);
    }
}



//BYEEEEEEEEEE :)
