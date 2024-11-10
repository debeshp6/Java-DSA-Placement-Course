/*

Quick Sort: As the name suggests, Quicksort is one of the fastest sorting algorithms. The Quicksort algorithm takes an array of values, chooses one of the values as
the 'pivot' element, and moves the other values so that lower values are on the left of the pivot element, and higher values are on the right of it.

How it works:

  1. Choose a value in the array to be the pivot element.
  2. Order the rest of the array so that lower values than the pivot element are on the left, and higher values are on the right.
  3. Swap the pivot element with the first element of the higher values so that the pivot element lands in between the
  lower and higher values.
  4. Do the same operations (recursively) for the sub-arrays on the left and right side of the pivot element.

*/



//quick sort
//tip: last element is the pivot in first case. compare the elements with pivot.
//smaller element before pivot and the bigger one after pivot (last element).

import java.util.*;
public class QuickSort {

	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low-1;

		for(int j=low; j<high; j++) {
			if(arr[j] < pivot) {
				i++;
				//swap
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++;
		int temp = arr[i];
		arr[i] = arr[high];
		arr[high] = temp;
		return i; //pivot index
	}

	public static void quickSort(int[] arr, int low, int high) {
		if(low < high) {
			int pivotIdx = partition(arr, low, high);
			quickSort(arr, low, pivotIdx-1);
			quickSort(arr, pivotIdx+1, high);
		}
	}

	public static void main(String[] args) {
		int[] arr = {6, 3, 9, 5, 2, 8};
		int n  = arr.length;
		quickSort(arr, 0, n-1);
		//print
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}


/*

Time Complexity:

- worst case: O(n^2)
- average case: O(nlogn)

*/
