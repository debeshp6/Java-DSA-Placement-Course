/* Qs. Print all permutations of a string. ["abc"] */
//permutations: all possible combinations of letters.
import java.util.*;
public class Recursion3 {
    //time complexity -> O(n!)
    public static void printPerm(String str, String permutation) {
        if(str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for(int i=0; i<str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPerm(newStr, permutation+currChar);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        printPerm(str, "");
    }
}


/* Qs. Count total paths in a maze to move from (0,0) to (n,m). [n = 3, m = 3] 
    
    i) right movement
    ii) downward movement
*/
//we are doing backtracking here
import java.util.*;
public class Recursion3 {
    //to calculate the time complexity of this code we need to know what's Dynamic Programming. but nothing to worry...  we're gonna learn it very soon!
    public static int countPaths(int i, int j, int n, int m) {
        if(i == n-1 && j == m-1) {
            return 1;
        }
        if(i == n || j == m) {
            return 0;
        }
        //move downwards
        int downPaths = countPaths(i+1, j, n, m);
        //move right
        int rightPaths = countPaths(i, j+1, n, m);
        return downPaths + rightPaths;
    }
    public static void main(String[] args) {
        int n = 3, m = 3;
        int totalPaths = countPaths(0, 0, n, m);
        System.out.println(totalPaths);
    }
}

/* NOTE: Backtracking is a problem-solving algorithmic technique used to systematically explore all possible solutions to a problem by incrementally
building a solution candidate and abandoning it as soon as it determines that the candidate cannot lead to a valid solution. This process continues until all possible solutions are found. */


/* Qs. Place Tiles of size 1xm in a floor of size nxm. [n = 4, m = 2] */
//hint: there will be total 5 ways to place the tiles of size 1x2 in a floor of size 4x2.
import java.util.*;
public class Recursion3 {
    //time complexity -> dynamic programming required!!!
    public static int placeTiles(int n, int m) {
        //base case
        if(n == m) {
            return 2;
        }
        if(n < m) {
            return 1;
        }
        //vertically
        int vertPlace = placeTiles(n-m, m);
        //horizontally
        int horPlace = placeTiles(n-1, m);
        return vertPlace + horPlace;
    }
    public static void main(String[] args) {
        int n = 4, m = 2;
        System.out.println(placeTiles(n, m));
    }
}


/* Qs. Find the number of ways in which you can invite n people to your party, single or in pairs. [n = 4] */
//hint: for 4 people (as per the question) there are total 10 ways to invite people in party, single or pairs.
import java.util.*;
public class Recursion3 {
    public static int callGuests(int n) {
        //base case
        if(n <= 1) {
            return 1;
        }
        //single invitation
        int ways1 = callGuests(n-1);
        //pair invitation
        int ways2 = (n-1) * callGuests(n-2);
        return ways1 + ways2;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(callGuests(n));
    }
}


/* Qs. Print all the subsets of a set of first n natural numbers. [n = 3] */
import java.util.*;
public class Recursion3 {
    //time complexity -> O(2^n)
    public static void printSubset(ArrayList<Integer> subset) {
        for(int i=0; i<subset.size(); i++) {
        System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }
    public static void findSubsets(int n, ArrayList<Integer> subset) {
        //base case
        if(n == 0) {
            printSubset(subset);
            return;
        }
        //add hoga
        subset.add(n);
        findSubsets(n-1, subset);
        //add nahi hoga
        subset.remove(subset.size()-1);
        findSubsets(n-1, subset);
    }
    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(n, subset);
    }
}



/* <------------------ bit of a grind, but solid work, MAJOR! ------------------> */
