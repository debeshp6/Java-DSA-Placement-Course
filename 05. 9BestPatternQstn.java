/* Q1. Print the pattern. [Solid Rectangle]

    *****
    *****
    *****
    *****
*/

// Solution
import java.util.*;
public class main {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        //outer loop
        for(int i=0; i<n; i++) {
            //inner loop
            for(int j=0; j<m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



/*Q2. Print the pattern. [Hollow Rectangle]
    
    *****
    *   *
    *   *
    *****
*/

// Solution
import java.util.*;
public class main {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        //outer loop
        for(int i=1; i<=n; i++) {
            //inner loop
            for(int j=1; j<=m; j++) {
                //cell -> (i,j)
                if(i == 1 || j == 1 || i == n || j == m) {
                System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}



/*Q3. Print the pattern. [Half Pyramid]
    
    *
    **
    ***
    ****
*/

// Solution
import java.util.*;
public class main {
    public static void main(String[] args) {
        int n = 4;
        //outer loop
        for(int i=1; i<=n; i++) {
            //inner loop
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



/*Q4. Print the pattern. [Inverted Half Pyramid]
    
    ****
    ***
    **
    *
*/

// Solution
import java.util.*;
public class main {
    public static void main(String[] args) {
        int n = 4;
        //outer loop
        for(int i=n; i>=1; i--) { // "--" is the decrement operator
            //inner loop
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



/*Q5. Print the pattern. [Inverted Half Pyramid]
    
       *
      **
     ***
    ****
*/

// Solution
import java.util.*;
public class main {
    public static void main(String[] args) {
        int n = 4;
        //outer loop
        for(int i=1; i<=n; i++) { 
            //inner loop -> space print
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //inner loop -> star print
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



/*Q6. Print the pattern. [Half Pyramid with Numbers]
    
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
*/

// Solution
import java.util.*;
public class main {
    public static void main(String[] args) {
        int n = 5;
        //outer loop
        for(int i=1; i<=n; i++) { 
            //inner loop
            for(int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}



/*Q7. Print the pattern. [Inverted Half Pyramid with Numbers]
    
    1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2 
    1
*/

// Solution
import java.util.*;
public class main {
    public static void main(String[] args) {
        int n = 5;
        //outer loop
        for(int i=n; i>=1; i--) { 
            //inner loop
            for(int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}



/*Q8. Print the pattern. [Floyd's Triangle]
    
    1
    2 3
    4 5 6
    7 8 9 10 
    11 12 13 14 15
*/

// Solution
import java.util.*;
public class main {
    public static void main(String[] args) {
        int n = 5;
        int num = 1;
        //outer loop
        for(int i=1; i<=n; i++) { 
            //inner loop
            for(int j=1; j<=i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}



/*Q9. Print the pattern. [0-1 Triangle]
    
    1
    0 1
    1 0 1
    0 1 0 1 
    1 0 1 0 1
*/

// Solution
import java.util.*;
public class main {
    public static void main(String[] args) {
        int n = 5;
        //outer loop
        for(int i=1; i<=n; i++) { 
            //inner loop
            for(int j=1; j<=i; j++) {
                int sum = i + j; 
                if(sum % 2 == 0) { //even
                    System.out.print("1 ");
                } else { //odd
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
