/*

The syntax for function declaration is:

    returnType functionName(type arg1, type arg2...) {
        //operations
    }

   
Why are functions used?

    1. If some functionality is performed at multiple places in software, then rather than writing the same code, again and again, we create a function and call it everywhere. This helps reduce code redundancy. 
    2. Functions make maintenance of code easy as we have to change at one place if we make future changes to the functionality. 
    3. Functions make the code more readable and easy to understand. 


A function is a block of code that performs a specific task. It takes an input and gives output after an operation.

- returnType can be int, float, String etc.
- void -> no return.
- If a returnType of a function is void, it means that function returns nothing.
- functionName can be anything except Java Keywords.
- arg1, arg2 -> these are basically inputs.
- we can pass multiple (it can be different types too, like int, float, String etc.) arguments in a function.


The main function is a special function as the computer starts running the code from the beginning of the main function. Main function serves as the entry point for the program.

*/


/*1. Print a given name in a function.*/
import java.util.*;
public class Functions {
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        
        printMyName(name); //we called the function here
    }
}


/*2. Make a function to add 2 numbers and return the sum.*/
import java.util.*;
public class SumOfTwo {
    public static int sumOfTwo(int a, int b) {
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first value, a = ");
        int a = sc.nextInt();
        System.out.print("Enter second value, b = ");
        int b = sc.nextInt();
        
        int sum = sumOfTwo(a, b);
        System.out.print("Sum of the numbers = "+ sum);
    }
}


/*3. Make a function to multiply 2 numbers and return the product.*/
import java.util.*;
public class MultiplyOfTwo {
    public static int mulOfTwo(int a, int b) {
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first value, a = ");
        int a = sc.nextInt();
        System.out.print("Enter second value, b = ");
        int b = sc.nextInt();
        System.out.print("Product of the numbers = "+ mulOfTwo(a, b));
    }
}


/*4. Find the factorial of a number.*/
import java.util.*;
public class Factorial {
    public static int fact(int n) {
        int factorial = 1;
        for(int i=n; i>=1; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Factorial of the number is: " + fact(n));
    }
}
