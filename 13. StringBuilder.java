/*

Strings in Java are Immutable.
For any kind of modification in String we use String Builder.
Objects are created inside the Heap, and normal variables are created in stack.

StringBuilder: StringBuilder in Java is a mutable sequence of characters. It is a class that allows you to build a string by appending characters, strings, or other sequences of characters.
Unlike the String class, which is immutable, StringBuilder is designed for use as a drop-in replacement for StringBuffer in places where the latter is being used by a single thread (as is generally the case).

- StringBuilder objects can be modified after creation, whereas String objects are immutable.
- StringBuilder is not designed to be used in a multi-threaded environment. If you need thread safety, use StringBuffer instead.
- StringBuilder is faster and more memory-efficient than concatenating strings using the + operator, especially when building long strings or performing multiple concatenations.
- StringBuilder provides methods like append(), insert(), replace(), and delete() to modify the string sequence.
- StringBuilder implements the Serializable interface, making it possible to serialize and deserialize its contents.

*/



import java.util.*;
public class StringBuilders {
    public static void main(String[] args) {
        // declaration
        StringBuilder sb = new StringBuilder("Aisha");
        System.out.println(sb);
    }
}


import java.util.*;
public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Aisha");
        System.out.println(sb);
        // character at index 0
        System.out.println(sb.charAt(0));
    }
}


import java.util.*;
public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Aisha");
        System.out.println(sb);
        // set character at index 0
        sb.setCharAt(0, 'P');
        System.out.println(sb);
    }
}


import java.util.*;
public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Aisha");
        System.out.println(sb);
        // insert a character at some index
        sb.insert(0, 'P'); 
        System.out.println(sb);  
    }
}


import java.util.*;
public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Aisha");
        System.out.println(sb);
        // insert a character at some index
        sb.insert(2, 'i');
        System.out.println(sb);
        // delete the extra 'i'
        sb.delete(2, 3);
        System.out.println(sb);
    }
}


import java.util.*;
public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("A");
        // append
        sb.append("i");
        sb.append("s");
        sb.append("h");
        sb.append("a");
        System.out.println(sb);
    }
}


/* Qs. Reverse a String (using StringBuilder class) */
import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("aisha");
        System.out.println("Before reverse: " + sb);
        for(int i=0; i<sb.length()/2; i++) {
            int front = i;
            int back = sb.length()-1-i; // 5-1-0 = 4
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println("After reverse: " + sb);
    }
}
