import java.util.*;
public class main {
    public static void main(String[] args) {
        //variables
        String name = "Debesh Paul";
        int age = 20;
        double price = 25.25;
        int a = 25;
        int b = 10;
        int sum = a + b;
        System.out.println(sum);
        int diff = a - b;
        System.out.println(diff);
        int mul = a * b;
        System.out.println(mul);
    }
}

/* Java is a typed language. There are tow types of Data Types in Java:

1. Primitive: byte, short, char, boolean, int, long, float, double
2. Non-Primitive: String, Array, Class, Object, Interface

Primitive Datatypes are predefined, but Non-Primitive Datatypes can be customized.*/


import java.util.*;
public class main {
    public static void main(String[] args) {
        //Input1
        Scanner sc = new Scanner(System.in);
        String name = sc.next(); // next() function takes only single word
        System.out.println(name);
    }
}

import java.util.*;
public class main {
    public static void main(String[] args) {
        //Input2
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine(); //nextLine() function takes the whole line as input
        System.out.println(name);
    }
}
        


//Qs. Take 2 variables 'a' & 'b' and print their sum.

import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum =  a + b;
        System.out.println(sum);
    }
}
