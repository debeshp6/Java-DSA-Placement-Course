/* Qs. Tower of Hanoi. 

Rule No. 1: Only one disk transferred in 1 step.
Rule No. 2: Smaller disks are always kept on top of larger disks.

The Tower of Hanoi is a classic mathematical puzzle that can be solved using recursion in Java.
The problem involves moving a stack of disks from one peg to another. */

 import java.util.*;
 public class Recursion2 {
     //time complexity -> O(2^n-1) = O(2^n)
     public static void towerOfHanoi(int n, String src, String helper, String dest) {
         if(n == 1) {
             System.out.println("Transfer Disk " + n + " from " + src + " to " + dest);
             return;
         }
         towerOfHanoi(n-1, src, dest, helper);
         System.out.println("Transfer Disk " + n + " from " + src + " to " + dest);
         towerOfHanoi(n-1, helper, src, dest);
     }
     public static void main(String[] args) {
         int n = 3;
         towerOfHanoi(n, "S", "H", "D");
     }
 }


/* Qs. Print a string in reverse. ["abcd"] */
import java.util.*;
public class Recursion2 {
    //time complexity -> O(n)
    //here n represents the length of string
    public static void printRev(String str, int idx) {
        if(idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printRev(str, idx-1);
    }
    public static void main(String[] args) {
        String str = "abcd";
        printRev(str, str.length()-1);
    }
}


/* Qs. Find the 1st & last occurance of an element in string. ["abaacdaefaah"] */
import java.util.*;
public class Recursion2 {
    //time complexity -> O(n)
    //here n represents the length of string
    public static int first = -1;
    public static int last = -1;
    public static void findOccurance(String str, int idx, char element) {
        if(idx == str.length()) {
            System.out.println("first occurance: " + first);
            System.out.println("last occurance: " + last);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == element) {
            if(first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        findOccurance(str, idx+1, element);
    }
    public static void main(String[] args) {
        String str = "abaacdaefaah";
        findOccurance(str, 0, 'a');
    }
}


/* Qs. Check if an array is sorted. (Strictly Increasing)
    
    {1,2,3,4,5}
*/
import java.util.*;
public class Recursion2 {
    //time complexity -> O(n)
    //here n represents the length of string
    public static boolean isSorted(int arr[], int idx) {
        if(idx == arr.length-1) {
            return true;
        }
        if(arr[idx] < arr[idx+1]) {
            //array is sorted till now
            return isSorted(arr, idx+1);
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(isSorted(arr, 0));
    }
}


/* Move all 'x' to the end of the string. ["axbcxxd"] */
import java.util.*;
public class Recursion2 {
    //time complexity -> O(n+n) = O(2n) -> O(n)
    //here n represents the length of string
    public static void moveAllX(String str, int idx, int count, String newString) {
        if(idx == str.length()) {
            for(int i=0; i<count; i++) {
            newString += 'x';
        }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == 'x') {
            count++;
            moveAllX(str, idx+1, count, newString);
        } else {
            newString += currChar; //newString = newString + currChar
            moveAllX(str, idx+1, count, newString);
        }
    }
    public static void main(String[] args) {
        String str = "axbcxxd";
        moveAllX(str, 0, 0, "");
    }
}


/* Remove duplicates in a string. ["abbccda"] */
import java.util.*;
public class Recursion2 {
    //time complexity -> O(n)
    //here n represents the length of string
    public static boolean[] map = new boolean[26];
    public static void removeDuplicates(String str, int idx, String newStr) {
        if(idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true) {
            removeDuplicates(str, idx+1, newStr);
        } else {
            newStr += currChar;
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx+1, newStr);
        }
    }
    public static void main(String[] args) {
        String str = "abbccda";
        removeDuplicates(str, 0, "");
    }
}


/* Print all the subsequences of a string. ["abc"] */
import java.util.*;
public class Recursion2 {
    //time complexity -> O(2^n)
    public static void subSeq(String str, int idx, String newStr) {
        if(idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        //to be
        subSeq(str, idx+1, newStr+currChar);
        //or not to be
        subSeq(str, idx+1, newStr);
    }
    public static void main(String[] args) {
        String str = "abc";
        subSeq(str, 0, "");
    }
}


/* A HashSet in Java is a collection that implements the Set interface, backed by a hash table (actually a HashMap).
It stores unique elements, and the order of elements is not guaranteed. */

/* Print all the unique subsequences of a string. ["aaa"] */
import java.util.HashSet;
public class Recursion2 {
    //time complexity -> O(2^n)
    public static void subSeq(String str, int idx, String newStr, HashSet<String> set) {
        if(idx == str.length()) {
            if(set.contains(newStr)) {
                return;
            } else {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char currChar = str.charAt(idx);
        //to be
        subSeq(str, idx+1, newStr+currChar, set);
        //or not to be
        subSeq(str, idx+1, newStr, set);
    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subSeq(str, 0, "", set);
    }
}


/* Print keypad combination.
    0 -> .
    1 -> abc
    2 -> def
    3 -> ghi
    4 -> jkl
    5 -> mno
    6 -> pqrs
    7 -> tu
    8 -> vwx
    9 -> yz
*/
import java.util.HashSet;
public class Recursion2 {
    //time complexity -> O(4^n)
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void printComb(String str, int idx, String combination) {
        if(idx == str.length()) {
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];
        for(int i=0; i<mapping.length(); i++) {
            printComb(str, idx+1, combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "4";
        printComb(str, 0, "");
    }
}
