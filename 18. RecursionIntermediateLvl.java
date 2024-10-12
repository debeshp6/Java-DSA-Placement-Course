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


