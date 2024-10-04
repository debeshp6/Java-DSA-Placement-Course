/*

2D Arrays: In Java, a 2D array is a data structure that represents a matrix or a table with rows and columns. It is an array of arrays, where each element is an array of a specified data type.
A 2D array is declared by specifying the data type followed by two sets of square brackets [][].

It is similar to 2D matrices that we studied in 11th and 12th class.

  -> Rows and Columns: A 2D array has multiple rows and columns, just like a table or matrix.
  -> Array of Arrays: Each element in the 2D array is an array of the specified data type.
  -> Indexing: 2D arrays are indexed using two integers, row and column, separated by a comma. The first index refers to the row, and the second index refers to the column. Indexing starts from 0.
  -> Accessing Elements: To access an element in a 2D array, you use the syntax array_name[row][column].
  

Declaration:

  type[][] arrayName = new type[rows][columns];
  int[][] numbers = new int[3][5];


Outer Loop --> Controls the Rows << for(int i=0 to n) >>
Inner Loop --> Controls the Columns << for(int j=0 to m) >>
  
*/



/* Qs. Taking a matrix as an input and printing its elements. */
import java.util.*;
public class TwoDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row size: ");
        int rows = sc.nextInt();
        System.out.print("Enter column size: ");
        int cols = sc.nextInt();
        int[][] numbers = new int[rows][cols];
        
        // input
        System.out.println("Enter the elements:");
        for(int i=0; i<rows; i++) { // outer loop --> rows
            for(int j=0; j<cols; j++) { // inner loop --> cols
                numbers[i][j] = sc.nextInt();
            }
        }
        
        // output
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}



/* Qs. Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs. */
import java.util.*;
public class TwoDArrayProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row number: ");
        int rows = sc.nextInt(); // row input
        System.out.print("Enter colum size: ");
        int cols = sc.nextInt(); // cols input
        int[][] numbers = new int[rows][cols];
        
        // input 
        System.out.println("Enter the elements:");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        
        System.out.print("We will search: ");
        int x = sc.nextInt();
        
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                // compare with x
                if(numbers[i][j] == x) {
                    System.out.println("x found at location: [" + i + ", " + j + "]");
                }
            }
        }
    }
}



/* Qs. Print the spiral order matrix as output for a given matrix of numbers. [Difficult for Beginners] */
import java.util.*;
public class ArraySpiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("The Spiral Order Matrix is: ");
        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = m-1;
        
        // to print spiral order matrix
        while(rowStart <= rowEnd && colStart <= colEnd) {
            // 1
            for(int col=colStart; col<=colEnd; col++) {
                System.out.print(matrix[rowStart][col] + " ");
            }
            rowStart++;
            // 2
            for(int row=rowStart; row<=rowEnd; row++) {
                System.out.print(matrix[row][colEnd] + " ");
            }
            colEnd--;
            // 3
            for(int col=colEnd; col>=colStart; col--) {
                System.out.print(matrix[rowEnd][col] + " ");
            }
            rowEnd--;
            // 4
            for(int row=rowEnd; row>=rowStart; row--) {
                System.out.print(matrix[row][colStart] + " ");
            }
            colStart++;
            
            System.out.println();
        }
    }
}



/* Qs. For a given matrix of N x M, print its transpose. */
import java.util.*;
public class TransposeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row size: ");
        int rows = sc.nextInt();
        System.out.print("Enter column size: ");
        int cols = sc.nextInt();
        int numbers[][] = new int[rows][cols];
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("The transpose is: ");
        // to print transpose
        for(int j=0; j<cols; j++) {
            for(int i=0; i<rows; i++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
