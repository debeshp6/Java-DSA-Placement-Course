/*

Bit Manipulation, a fundamental operation in the realm of Data Structures and Algorithms (DSA),
offers a way to manipulate individual bits within binary representations of data. 

Bit masking is a technique used to manipulate individual bits within a binary number or a byte.

-------------------------------------------------------------------------------------------------

Get Bit:

Get the 3rd bit (position = 2) of a number n. (n = 0101)
Bit Mask: 1 << i (position)
Operation: AND

(i) 1 << 2 
    0001 << 2
    0100
(ii) 0100 & 0101 = 0100

As it has a 1 in it, so it's a non-zero bit. So, the bit will be 1.

-------------------------------------------------------------------------------------------------

Set Bit:

Set the 2nd bit (position = 1) of a number n. (n = 0101)
Bit Mask: 1 << i
Operation: OR

(i) 1 << 1
    0001 << 1
    0010
(ii) 0010 | 0101 = 0111 = 7

-------------------------------------------------------------------------------------------------

Clear Bit:

Clear the 3rd bit (position = 2) of a number n. (n = 0101)
Bit Mask: 1 << i
Operation: AND with NOT

(i) 1 << 2
    0001 << 2
    0100
(ii) ~ (0100) => 1011
(iii) 1011 & 0101 = 0001 = 1

-------------------------------------------------------------------------------------------------

Update Bit:

Update the 2nd bit (position = 1) of a number n to 1. (n = 0101)
For 0 --> Bit Mask: 1 << i
          Operarion: AND with NOT
For 1 --> Bit Mask: 1 << i
          Operarion: OR

For 0 do the Clear Bit and for 1 do the Set Bit.

*/


// Get Bit
import java.util.*;
public class GetBit {
    public static void main(String[] args) {
        int n = 5; //0101
        int pos = 3;
        int bitMask = 1 << pos;
        if((bitMask & n) == 0) {
            System.out.println("bit was zero.");
        } else {
            System.out.println("bit was one.");
        }
    }
}


// Set Bit
import java.util.*;
public class GetBit {
    public static void main(String[] args) {
        int n = 5; //0101
        int pos = 1;
        int bitMask = 1 << pos;
        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }
}


// Clear Bit
import java.util.*;
public class GetBit {
    public static void main(String[] args) {
        int n = 5; //0101
        int pos = 2;
        int bitMask = 1 << pos;
        int newBitmask = ~ (bitMask);
        int newNumber = newBitmask & n;
        System.out.println(newNumber);
    }
}


// Update Bit
import java.util.*;
public class GetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        // oper = 1 : set | oper = 0 : clear
        int n = 5; //0101
        int pos = 1;
        int bitMask = 1 << pos;
        if(oper == 1) {
            // set
            int newNumber1 = bitMask | n;
            System.out.println(newNumber1);
        } else {
            int newBitMask = ~ (bitMask);
            int newNumber2 = newBitMask & n;
            System.out.println(newNumber2);
        }
    }
}



/*Q1. Write a program to find if a number is a power of 2 or not. */
import java.util.*;
public class PowerOfTwo {
    public static boolean powerOfTwo(int n) {
        while(n % 2 == 0) {
            n = n/2;
        } if (n == 1) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(n + " is the power of 2: " + powerOfTwo(n));
    }
}
