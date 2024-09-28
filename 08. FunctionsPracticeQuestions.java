/*Q1. Enter 3 numbers from the user & make a function to print their average.*/
import java.util.*;
public class Average {
    public static int averageThree(int a, int b, int c) {
        int avg = (a + b + c) / 3 ;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first value: ");
        int a = sc.nextInt();
        System.out.print("Enter second value: ");
        int b = sc.nextInt();
        System.out.print("Enter third value: ");
        int c = sc.nextInt();
        System.out.print("Average of the numbers: " + averageThree(a,b,c));
    }
}


/*Q2. Write a function to print the sum of all odd numbers from 1 to n.*/
import java.util.*;
public class SumOfOdd {
    public static void sumOfOdd (int n) {
        int sum = 0;
        for(int i=1; i<=n; i++) {
            if(i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sumOfOdd(n);
    }
}


/*Q3. Write a function which takes in 2 numbers and returns the greater of those two.*/
import java.util.*;
public class GreaterNumber {
    public static void greaterNum(int a, int b) {
        if(a>b) {
            System.out.print(a + " is greater than " + b);
        } else {
            System.out.print(b + " is greater than " + a);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        greaterNum(a,b);
    }
}


/*Q4. Write a function that takes in the radius as input and returns the circumference of a circle.*/
import java.util.*;
public class CircleCircumference {
    public static void circleCircum(double n) {
        double circ = 2 * 3.14 * n;
        System.out.print("Circumference of the circle is: " + circ);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double n = sc.nextDouble();
        circleCircum(n);
    }
}


/*Q5. Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.*/
import java.util.*;
public class Vote {
    public static boolean isAdult(int n) {
        if(n>=18) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        if(isAdult(age)) {
            System.out.println("Eligible to vote.");
        } else {
            System.out.println("Not eligible to vote.");
        }
    }
}


/*Q6. Write an infinite loop using do while condition.*/
import java.util.*;
public class InfiniteLoop {
    public static void main(String[] args) {
        do {
        //operations
        } while(true);
    }
}


/*Q7. Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int positive = 0, negative = 0, zeros = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to continue & 0 to stop.");
        int input = sc.nextInt();
        while(input == 1) {
            System.out.print("Enter your number: ");
            int number = sc.nextInt();
            if(number>0) {
                positive++;
            } else if(number<0) {
                negative++;
            } else {
                zeros++;
            }
            System.out.println("Press 1 to continue & 0 to stop.");
            input = sc.nextInt();
        }
        System.out.println("Positives: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zeros: " + zeros);
    }
}


/*Q8. Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x^n.*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x = ");
        int x = sc.nextInt();
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();
        int res = 1;
        // check that n is not too large or else result will exceed the size of int
        for(int i=0; i<n; i++) {
            res = res * x;
        }
        System.out.println("x to the power n is = " + res);
    }
}


/*Q9. Write a function that calculates the Greatest Common Divisor of 2 numbers.*/
import java.util.*;
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first value: ");
        int x = sc.nextInt();
        System.out.print("Enter the second value: ");
        int y = sc.nextInt();
        while(x != y) {
            if(x>y) {
                x = x - y;
            } else {
                y = y - x;
            }
        }
        System.out.println("GCD is: " + y);
    }
}


/*Q10. Write a program to print Fibonacci series of n terms where n is input by user: 0 1 1 2 3 5 8 13 21.....
In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
*/
import java.util.*;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value: ");
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.print(a + " ");
        if(n>1) {
            // find nth term
            for(int i=2; i<=n; i++) {
                System.out.print(b + " ");
                // the concept below is known as swapping
                int temp = b;
                b = a + b;
                a = temp;
            }
            System.out.println();
        }
    }
}
