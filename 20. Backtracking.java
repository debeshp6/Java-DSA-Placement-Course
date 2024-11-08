/*

remember that detergent brand named 'Ghari'?
if you do, then surely you remember their famous tagline - "Pehle istemaal karein, fir vishwas karein"
if we simplify the term 'Backtracking', the meaning is same.

cool, right? B)

simple definition --> find all possible solutions & use the one you want.

example: arrange 3 kids in a single line. [permutation concept]
  1. kid A
  2. kid B
  3. kid C

total permutations = n! = 3! = 3 x 2 x 1 = 6

=> {ABC, ACB, BAC, BCA, CAB, CBA}

same these types of quesions when we try to solve with Recursion, we use the concept of Backtracking.

a recursion tree is a visual representation of a recursive algorithm, illustrating how the function calls itself repeatedly until it reaches a base case.
in java, recursion is a powerful technique for solving problems by breaking them down into smaller, more manageable sub-problems.

*/



/* Qs. Print all permutations. ["ABC"] */
import java.util.*;
public class Backtracking {
	//time complexity --> O(n*n!)
	public static void printPermutation(String str, String perm, int idx) {
		if(str.length() == 0) {
			System.out.println(perm);
			return;
		}
		for(int i=0; i<str.length(); i++) {
			char currChar = str.charAt(i);
			String newStr = str.substring(0, i) + str.substring(i+1);
			printPermutation(newStr, perm + currChar, idx+1);
		}
	}
	public static void main (String[] args) {
		String str = "ABC";
		printPermutation(str, "", 0);
	}
}




/* N - Queens Problem
i) N x N chessboard
ii) N Queens
iii) Print all solutions where queens are safe. */
import java.util.*;
public class Backtracking {
  //time complexity --> O(n^n)
	public static int size = 4;

	public static void printBoard(char[][] chessboard) {
		System.out.println();
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				System.out.print(chessboard[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static boolean isSafe(char[][] chessboard, int R, int C) {

		//column check
		for(int i=0; i<size; i++)
			if(chessboard[i][C] == 'Q')
				return false;

		//row check
		for(int i=0; i<size; i++) {
			if(chessboard[R][i] == 'Q')
				return false;
		}

		//diagonally check (both side)
		for(int i=R, j=C; i>=0 && j>=0; i--, j--)
			if(chessboard[i][j] == 'Q')
				return false;

		for(int i=R, j=C; i>=0 && j<size; i--, j++)
			if(chessboard[i][j] == 'Q')
				return false;

		return true;
	}

	public static void nQueenSolution(char[][] chessboard, int R) {
		if(R == size) {
			printBoard(chessboard);
		} else {
			for(int c=0; c<size; c++) {
				if(isSafe(chessboard, R, c)) {
					chessboard[R][c] = 'Q';
					nQueenSolution(chessboard, R+1);
					chessboard[R][c] = '*';
				}
			}
		}
	}

	public static void main (String[] args) {
		char[][] chessboard = new char[size][size];
		for(int i=0; i<size; i++) {
			Arrays.fill(chessboard[i], '*');
		}
		printBoard(chessboard);
		nQueenSolution(chessboard, 0);
	}
}




/* <------------------ LEETCODE PROBLEM ------------------> */

