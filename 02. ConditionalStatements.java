/* Conditional Statements

  1. if, else
  2. else if
  3. switch
  4. break 
  
These are basically some Java Keywords */


//Adult Age Calculator
import java.util.*;
public class main {
    public static void main(String[] args) {
        System.out.print("Enter the age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not Adult");
        }
    }
}


//Even-Odd Number Calculator
import java.util.*;
public class main {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 2 == 0) {
            System.out.println("It's an even number.");
        } else {
            System.out.println("It's an odd number.");
        }
    }
}


//How to use if-else condition
import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        if(a == b) {
            System.out.println("a and b are equal.");
        }
        else if(a > b) {
            System.out.println("a is greater than b.");
        }
        else if(a < b) {
            System.out.println("a is lesser than b.");
        }
        else {
            System.out.println("NOT DEFINED!");
        }
    }
}


/*If there is only one single statement inside the if condition adding curly braces is fully optional. It's your choice, but if it has multiple statements then you must write them inside the curly braces.

if(condition)
  statement1: xyz;

if(condition) {
  statement1: xyz;
  statement2: abc;
  statement3: pqr;
} */


import java.util.*;
public class main {
    public static void main(String[] args) {
        //switch case
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch(button) {
            case 1: System.out.println("Hello!");
            break;
            case 2: System.out.println("Namaste!");
            break;
            case 3: System.out.println("Bonjour!");
            break;
            default: System.out.println("Invalid Button!");
        }
    }
}


//Simple Calculator
import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.print("Enter your choice [1) +, 2) -, 3) *, 4) /, 5) %]: ");
        int operator = sc.nextInt();
        
        /*
            1 -> + [a + b]
            2 -> - [a - b]
            3 -> * [a * b]
            4 -> / [a / b]
            5 -> % [a % b]
        */
        switch(operator) {
            case 1: System.out.println(a+b);
            break;
            case 2: System.out.println(a-b);
            break;
            case 3: System.out.println(a*b);
            break;
            case 4: System.out.println(a/b);
            break;
            case 5: System.out.println(a%b);
            break;
            default: System.out.println("INVALID");
        }
    }
}
