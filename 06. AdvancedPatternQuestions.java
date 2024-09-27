/* Q10. Print the pattern. [Butterfly Pattern]

    *      *
    **    **
    ***  ***
    ********
    ********
    ***  ***
    **    **
    *      *
*/

// Solution
import java.util.*;
public class ButterflyPattern {
    public static void main(String[] args) {
        
        int n = 4;
        
        //upper half
        for(int i=1; i<=n; i++) {
            //1st part
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            
            //spaces
            int spaces = 2 * (n-i);
            for(int j=1; j<=spaces; j++) {
                System.out.print(" ");
            }
            
            //2nd part
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        //lower half
        for(int i=n; i>=1; i--) {
            //1st part
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            
            //spaces
            int spaces = 2 * (n-i);
            for(int j=1; j<=spaces; j++) {
                System.out.print(" ");
            }
            
            //2nd part
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



/* Q11. Print the pattern. [Solid Rhombus]

        *****
       *****
      *****
     *****
    *****
*/

// Solution
import java.util.*;
public class SolidRhombus {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



/* Q12. Print the pattern. [Number Pyramid]

      1 
     2 2 
    3 3 3 
   4 4 4 4 
  5 5 5 5 5
*/

// Solution
import java.util.*;
public class NumberPyramid {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //numbers
            for(int j=1; j<=i; j++) {
                System.out.print(i+" "); //the space must be included for the exact pyramid shape
            }
            System.out.println();
        }
    }
}



/* Q13. Print the pattern. [Palindromic Pattern]

      1
     212
    32123
   4321234
  543212345
*/

// Solution
import java.util.*;
/*A palindrome is a word, sentence, verse, or even number that reads the same backward or forward.*/
public class PalindromicPattern {
    public static void main(String[] args) {
        
        int n = 5;
        
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            
            //1st half numbers
            for(int j=i; j>=1; j--) {
                System.out.print(j);
            }
            
            //2nd half numbers
            for(int j=2; j<=i; j++) {
                System.out.print(j);
            }
            
            System.out.println();
        }
    }
}



/* Q14. Print the pattern. [Diamond Pattern]

     *
    ***
   *****
  *******
  *******
   *****
    ***
     *
*/

// Solution
import java.util.*;
public class DiamondPattern {
    public static void main(String[] args) {
        
        int n = 4;
        
        //upper half
        for(int i=1; i<=4; i++) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        //lower half
        for(int i=n; i>=1; i--) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



/* Q15. Print a hollow butterfly.

    *      *
    **    **
    * *  * *
    *  **  *
    *  **  *
    * *  * *
    **    **
    *      *
*/

// Solution
import java.util.*;
public class HollowButterflyPattern {
    public static void main(String[] args) {
        
        int n = 4;
        
        //upper half
        for(int i=1; i<=n; i++) {
            //1st part
            for(int j=1; j<=i; j++) {
                if(j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            //spaces
            int spaces = 2 * n-2 * i;
            for(int j=1; j<=spaces; j++) {
                System.out.print(" ");
            }
            
            //2nd part
            for(int j=1; j<=i; j++) {
                if(j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
        
        //lower half
        for(int i=n; i>=1; i--) {
            //1st part
            for(int j=1; j<=i; j++) {
                if(j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            //spaces
            int spaces = 2 * n-2 * i;
            for(int j=1; j<=spaces; j++) {
                System.out.print(" ");
            }
            
            //2nd part
            for(int j=1; j<=i; j++) {
                if(j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
    }
}



/* Q16. Print a Hollow Rhombus.

        *****
       *   *
      *   *
     *   *
    *****
*/

// Solution
import java.util.*;
public class HollowRhombus {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=5; j++) {
                if(j == n || i == n || i == 1 || j == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}



/* Q17. Print Pascal’s Triangle.

      1 
     1 1 
    1 2 1 
   1 3 3 1 
  1 4 6 4 1
*/

// Solution
import java.util.*;
/*Pascal triangle in Java is a matrix of the binomial coefficients. The number of entries in every row increases by 1 starting from the first row having 1 entry and the second row having 2 entries and so on.*/
public class PascalTriangle {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0; i<n; i++) {
            int num = 1;
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++) {
                System.out.print(num + " ");
                num = num * (i-j) / (j+1); //formula
            }
            System.out.println();
        }
    }
}



/* Q18. Print Half Pyramid (Numbers).

      1 
     1 2 
    1 2 3 
   1 2 3 4 
  1 2 3 4 5
*/

// Solution
import java.util.*;
public class HalfPyramid {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0; i<n; i++) {
            int num = 1;
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}



/*Q19. Print Inverted Half Pyramid (Numbers).
    
    1 1 1 1 1
    2 2 2 2
    3 3 3
    4 4 
    5
*/

// Solution
import java.util.*;
public class InvertedHalfPyramid {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n; i++) {
            for(int j=n-i+1; j>=1; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}


///////////// HAPPY LEARNING! ///////////// 
