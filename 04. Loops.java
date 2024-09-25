/*
  A loop is a sequence of instruction s that is continually repeated until a certain condition is reached.

    1. for Loop
    2. while Loop
    3. do while Loop

  for(initialisation; condition; updation) {
    //do something
    }

  while(condition) {
  //do something
  }

  do {
  //do something
  } while(condition);

  In the case of do-while Loop condition is checked later whether the condition is true or false. If false atleast one operation will be done, because usually in do-while loop condition is checked later. But in other loops (eg. for Loop, while Loop) condition is always checked first then the operation is done.
*/


/*-----------<for Loop>-----------*/

import java.util.*;
public class main {
    public static void main(String[] args) {
        //print hello world 100 times
        for(int i=0; i<100; i++) {
            System.out.println("Hello World.");
        }
    }
}

import java.util.*;
public class main {
    public static void main(String[] args) {
        //infinite loop
        for(int i=0; i<100; i++) {
            System.out.println("Hello World.");
        }
    }
}

import java.util.*;
public class main {
    public static void main(String[] args) {
        //print from 0 to 10
        for(int i=0; i<11; i++) {
            System.out.println(i);
        }
    }
}


/*-----------<while Loop>-----------*/

import java.util.*;
public class main {
    public static void main(String[] args) {
        //print from 0 to 10
        int i = 0;
        while(i < 11) {
            System.out.println(i);
            i++;
        }
    }
}


/*-----------<do-while Loop>-----------*/

import java.util.*;
public class main {
    public static void main(String[] args) {
        //print from 0 to 10
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while(i < 11); 
    }
}



//Qs. Print the Sum of First n Natural Numbers. [n = 4]
import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0; i<=n; i++) {
            sum = sum + i;
        }
        System.out.print("Answer is: "+sum);
    }
}


//Qs. Print the table of a number input by the user. [n = 2]
import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        for (int i=1; i<=10; i++) {
            int mul = n*i;
            System.out.println(n+"x"+i+" = "+mul);
        }
    }
}
