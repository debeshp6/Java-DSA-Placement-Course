/*

- String is a Non-Primitive Datatype.
- Scanner is also a Non-Primitive Datatype in Java.
- sc.next() for printing a single word.
- To print a whole line/sentence use sc.nextLine().
- Strings are Inmutable.
- If we create a String in the memory, we cannot change that String. Not even delete, add, modify.
- If we want to modify or make any changes, have to create a new String.

*/



import java.util.*;
public class Strings {
    public static void main(String[] args) {
        // String Declaration
        String name = "Aisha";
        String fullName = "Aisha Pogo";
        String sentence = "My name is Aisha Pogo.";
    }
}


import java.util.*;
public class Strings {
    public static void main(String[] args) {
        // Taking Input
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.print("Your name is: " + name);
    }
}



/* Concatenation: In Java, concatenation refers to the operation of combining two or more strings into a single string.
This process is used to create a new string by appending one or more strings to the end of another string. */

import java.util.*;
public class Strings {
    public static void main(String[] args) {
        // concatenation
        String firstName = "Aisha";
        String lastName = "Pogo";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
    }
}



/* String Length Method: The length() method returns the length of a specified string.
It is a public member method and can be accessed using the dot operator (.). */

import java.util.*;
public class Strings {
    public static void main(String[] args) {
        // concatenation
        String firstName = "Aisha";
        String lastName = "Pogo";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName.length());
    }
}



/* charAt: The charAt() method returns the character at the specified index in a string. */

import java.util.*;
public class Strings {
    public static void main(String[] args) {
        // concatenation
        String firstName = "Aisha";
        String lastName = "Pogo";
        String fullName = firstName + " " + lastName;
        // charAt
        for(int i=0; i<fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }
    }
}



/* compareTo: The compareTo() method compares two strings lexicographically. The comparison is based on the Unicode value of each character in the strings. */

import java.util.*;
public class Strings {
    public static void main(String[] args) {
        // compare
        String name1 = "Aisha";
        String name2 = "Aisha";
        // case 1 : s1 > s2 => +ve value
        // case 2 : s1 == s2 => 0
        // case 3 : s1 < s2  => -ve value
        if(name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.")
        }
    }
}



/* substring: A substring is a part of a larger string, extracted using the substring() method of the String class.
This method returns a new string that is a subset of the original string, starting from a specified index (inclusive) and ending at another specified index (exclusive). */

import java.util.*;
public class Strings {
    public static void main(String[] args) {
        // substring
        String sentence = "My name is Aisha";
        // substring(beg index, end index)
        String name = sentence.substring(11, sentence.length());
        System.out.println(name);
    }
}



/* Q1. Take an array of Strings input from the user & find the cumulative (combined) length of all those strings. */
import java.util.*;
public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        String array[] = new String[size];
        int totLength = 0;
        System.out.println("Enter inputs: ");
        for(int i=0; i<size; i++) {
            array[i] = sc.next();
            totLength += array[i].length();
        }
        System.out.print("Combined Length: " + totLength);
    }
}



/* Q2. Input a string from the user. Create a new string called ‘result’ in which you will replace the letter "e" in the original string with letter "i".    
    Example:   original = "eabcdef" ; result = "iabcdif"
               Original = "xyz" ; result = "xyz"
*/
import java.util.*;
public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String str = sc.next();
        String result = "";
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == 'e') {
                result += 'i';
            } else {
                result += str.charAt(i);
            }
        }
        System.out.println("Result: " + result);
    }
}



/* Q3. Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
    Example:
    email = "helloWorld123@gmail.com"; username = "helloWorld123"
*/
import java.util.*;
public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the email: ");
        String email = sc.next();
        String userName = "";
        for(int i=0; i<email.length(); i++) {
            if(email.charAt(i) == '@') {
                break;
            } else {
                userName += email.charAt(i);
            }
        }
        System.out.println("Username is: " + userName);
    }
}
