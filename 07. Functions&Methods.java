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


/*5. Make a function to check if a number is prime or not.*/
import java.util.*;
public class PrimeNumber {
    public static boolean isPrime(int num) {
        if(num <= 1) {
            return false;
        }
       for(int i=2; i<=num/2; i++) {
           if((num % i) == 0)
               return false;
       }
       return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        if(isPrime(n)) {
            System.out.println(n + " is a Prime Number.");
        } else {
            System.out.println(n + " is not a Prime Number.");
        }
    }
}


/*6. Make a function to check if a given number n is even or not.*/
import java.util.*;
public class EvenNumber {
    public static void checkEven(int n) {
        if(n % 2 == 0) {
            System.out.println(n + " is an Even Number.");
        } else {
            System.out.println(n + " is not an Even Number.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        checkEven(n);
    }
}


/*7. Make a function to print the table of a given number n.*/
import java.util.*;
public class Table {
    public static void tableOfNum(int n) {
        for(int i=1; i<=10; i++) {
            System.out.println(n + " x " + i + " = " + (n*i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        tableOfNum(n);
    }
}
