/*

Merge Sort: Merge Sort is a popular sorting algorithm that uses the divide-and-conquer technique to sort an array of elements.
It is a comparison-based algorithm, meaning it compares elements to determine their order. Merge Sort has a time complexity of
O(n log n) and a space complexity of O(n), making it suitable for large datasets.

In the context of Merge Sort, Divide and Conquer is a problem-solving strategy used to sort an array of elements.
It involves three primary steps:

  => Divide: Recursively divide the array into two halves until each subarray contains only one element (base case).
  => Conquer: Sort each subarray recursively using the same Merge Sort algorithm. This step solves the problem for each individual subarray.
  => Combine: Merge the sorted subarrays into a single, fully sorted array. This step combines the solutions from each subproblem to solve the original problem.

*/



//merge sort
import java.util.*;
public class MergeSort {
    //time complexity --> O(nlogn)
	public static void conquer(int[] arr, int start, int mid, int end) {
		int merged[] = new int[end - start + 1];
		int idx1 = start;
		int idx2 = mid + 1;
		int x = 0;

		while(idx1 <= mid && idx2 <= end) {
			if(arr[idx1] <= arr[idx2]) {
				merged[x++] = arr[idx1++];
			} else {
				merged[x++] = arr[idx2++];
			}
		}

		while(idx1 <= mid) {
			merged[x++] = arr[idx1++];
		}

		while(idx2 <= end) {
			merged[x++] = arr[idx2++];
		}

		for(int i=0, j=start; i<merged.length; i++, j++) {
			arr[j] = merged[i];
		}
	}

	public static void divide(int[] arr, int start, int end) {
		if(start >= end) {
			return;
		}
		int mid = start + (end - start) / 2; // (start + end) / 2
		divide(arr, start, mid);
		divide(arr, mid+1, end);
		conquer(arr, start, mid, end);
	}

	public static void main(String[] args) {
		int arr[] = {6, 3, 9, 5, 2, 8};
		int n = arr.length;
		divide(arr, 0, n-1);

		//print
		System.out.print("{");
		for(int i =0; i<n; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.print("}");
		System.out.println();
	}
}
