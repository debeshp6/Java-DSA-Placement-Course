/*

Arrays: List of Items of the same type.

  type[] arrayName = new type[size]; // new is a Java keyword, it is used to take new space in the memory

english = 90
maths = 95
science = 78

  // method 1 to create an array
  int[] marks = new int[3];
  marks[0] = 90; // indexing starts from 0 in Java Language. 0 is denoted as the 1st position of the array.
  marks[1] = 95; // 2nd position
  marks[2] = 78; // 3rd position

  // method 2 to create an array
  type[] arrayName = {1, 2, 3, 4, 5, 6};
  
  
*/


import java.util.*;
public class Arrays {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 94; // english
        marks[1] = 91; // maths
        marks[2] = 89; // science
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
    }
}


import java.util.*;
public class Arrays {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 94; // english
        marks[1] = 91; // maths
        marks[2] = 89; // science
        // trick to print everything in short
        for(int i=0; i<3; i++) {
            System.out.println(marks[i]);
        }
    }
}


/* Memory has small spaces inside of it, each space has different adess. Datas are basically stored into these spaces/boxes.
To read or write datas or to perform any kind of operations our Operating System has to know the exact data's location or adress.
Memory adresses are defined in Hexadecimal. */


import java.util.*;
public class Arrays {
    public static void main(String[] args) {
        // defining array in another way
        int[] marks = {94, 91, 89};
        for(int i=0; i<3; i++) {
            System.out.println(marks[i]);
        }
    }
}


/* Here in this code Java will print '0's as per the size.
When you create a variable in Java, it takes a space inside the memory.
Stores a null value in that space (by default). 

  int ---> 0
  float ---> 0.0
  boolean ---> false
  String ---> " "

Here in this code we declared the array but did not initialize (storing value) it. That is why, by default/automatically it stores a null value and prints that null value or '0'. */
import java.util.*;
public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbers = new int[size];
        for(int i=0; i<size; i++) {
            System.out.println(numbers[i]);
        }
    }
}


import java.util.*;
public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbers = new int[size];
        
        // input
        for(int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }
        // output
        for(int i=0; i<size; i++) {
            System.out.println(numbers[i]);
        }
    }
}



// arrayName.length => size of that array


/* Qs. Take an array as input from user. Search for a given number x and print the index at which it occurs. */
// Linear Search
import java.util.*;
public class SearchArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        // input
        for(int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.print("Element to be searched: ");
        int x = sc.nextInt();
        // output
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] == x) {
                System.out.println("x found at index: " + i);
            }
        }
    }
}



/* Q1. Take an array of names as input from the user and print them on the screen. */
import java.util.*;
public class ArraysProb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        String names[] = new String[size];
        //input
        System.out.println("Enter the names: ");
        for(int i=0; i<size; i++) {
            names[i] = sc.next();
        }
        //output
        for(int i=0; i<names.length; i++) {
            System.out.println("Name no. " + (i+1) + " is: " + names[i]);
        }
    }
}


/*

1. Integer.MAX_VALUE: Integer.MAX_VALUE is a constant in the Integer class of java.lang package that specifies that stores the maximum possible value for any integer variable in Java.

    The actual value of this is: 2^31-1 = 2147483647
    
--------------------------------------------------------------------------------------------------------------------------------
    
2. Integer.MIN_VALUE: Integer.MIN_VALUE is a constant in the Integer class of java.lang package that specifies that stores the minimum possible value for any integer variable in Java. 

    The actual value of this is: -2^31 = -2147483648

*/


/* Q2. Find the maximum & minimum number in an array of integers. */
import java.util.*;
public class ArrayMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        // input
        for(int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] < min) {
                min = numbers[i];
            }
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Largest number is: " + max);
        System.out.println("Smallest number is: " + min);
    }
}


/* Q3. Take an array of numbers as input and check if it is an array sorted in ascending order.
    Eg : { 1, 2, 4, 7 } is sorted in ascending order.
         { 3, 4, 6, 2 } is not sorted in ascending order. */
import java.util.*;
public class AscendingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        
        // input
        System.out.println("Enter the elements:");
        for(int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }
        
        boolean isAscending = true;
        for(int i=0; i<numbers.length-1; i++) {
            if(numbers[i] > numbers[i+1]) {
                isAscending = false;
            }
        }
        
        if(isAscending) {
            System.out.println("The array is sorted in Ascending Order.");
        } else {
            System.out.println("The array is not sorted in Ascending Order.");
        }
    }
}
