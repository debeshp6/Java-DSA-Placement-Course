/*

Prerequisites:
- Iteration / Loops
- Functions

Recursion makes the code simpler, rather than the code made using Iteration.

Recursion is a programming technique where a function calls itself repeatedly until it reaches a base case that stops the recursion.
In Java, recursion can be used to solve problems that have a recursive structure, such as tree traversals, factorial calculations, and Fibonacci sequences.

- Recursion can lead to concise and elegant code, especially for problems with a recursive structure.
- Recursion can be easier to implement than iterative solutions, especially for problems with complex logic.
- Recursion allows you to break down a problem into smaller sub-problems, solving each recursively until the base case is reached.

Recursion can lead to a StackOverflowError when the method calls itself too many times, exceeding the maximum stack size.

*/



/* Qs. Print Numbers from 5 to 1. */
public class Recursion {
    public static void printNum(int n) {
        if(n == 0) { //base case
            return;
        }
        System.out.println(n); //print
        printNum(n-1); //recursion
    }
    public static void main(String[] args) {
        int n = 5;
        printNum(n);
    }
}


/* Qs. Print Numbers from 1 to 5. */
public class Recursion {
    public static void printNum(int n) {
        if(n == 6) { //base case
            return;
        }
        System.out.println(n); //print
        printNum(n+1); //recursion
    }
    public static void main(String[] args) {
        int n = 1;
        printNum(n);
    }
}


/* Qs. Print sum of first n natural numbers. */
import java.util.*;
public class Recursion {
    public static void printSum(int n, int sum) {
        if(n == 0) {
            System.out.println(sum);
            return;
        }
        sum += n;
        printSum(n-1, sum);
    }
    public static void main(String[] args) {
        printSum(10, 0);
    }
}


/* Qs. Print Factorial of a number n. */
import java.util.*;
public class Recursion {
    public static int factNum(int n) {
       if(n == 1 || n == 0) {
           return 1;
       }
       int fact_nm1 = factNum(n-1);
       int fact_n = n * fact_nm1;
       return fact_n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Factorial is: " + factNum(n));
    }
}


/* Qs. Print the Fibonacci Sequence till nth term. */
import java.util.*;
public class Recursion {
    public static void printFib(int a, int b, int n) {
        if(n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        printFib(b, c, n-1);
    }
    public static void main(String[] args) {
        int a = 0, b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        printFib(a, b, n-2);
    }
}


/* Qs. Print x^n (stack height = n). */
import java.util.*;
public class Recursion {
    public static int calcPow(int x, int n) {
        if(n == 0) { //base case 1
            return 1;
        }
        if(x == 0) { //base case 2
            return 0;
        }
        int xPownm1 = calcPow(x, n-1);
        int xPow = x * xPownm1;
        return xPow;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value, x = ");
        int x = sc.nextInt();
        System.out.print("Enter the power, n = ");
        int n = sc.nextInt();
        System.out.println("Answer will be: " + calcPow(x, n));
    }
}


/* Qs. Print x^n (stack height = logn). */
import java.util.*;
public class Recursion {
    public static int calcPow(int x, int n) {
        if(n == 0) { //base case 1
            return 1;
        }
        if(x == 0) { //base case 2
            return 0;
        }
        // if n is even
        if(n % 2 == 0) {
            return calcPow(x, n/2) * calcPow(x, n/2);
        } else { // if n is odd
            return calcPow(x, n/2) * calcPow(x, n/2) * x;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value, x = ");
        int x = sc.nextInt();
        System.out.print("Enter the power, n = ");
        int n = sc.nextInt();
        System.out.println("Answer will be: " + calcPow(x, n));
    }
}
