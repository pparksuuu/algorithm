package SelfStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Permutation {

	public static Iterator<int[]> myIterator; 
	public static ArrayList<String> hello;
	public static HashSet<String> arrays;
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		perm(arr, 0);
	}
	
	
	public static void perm(int[] arr, int pivot) {
		if (pivot == arr.length) {
			int[] newArr = perArr(arr);
			
			String str = Arrays.toString(newArr);
			arrays = new HashSet<String>();
			arrays.add(str);
//			hello.add(str);
			System.out.println(str);
			return;
		}
		
		for (int i = pivot; i < arr.length; i++) {
			swap(arr, i, pivot);
			perm(arr, pivot + 1);
			swap(arr, i, pivot);
		}
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static int[] perArr(int[] arr) {
		int[] perArr = new int[arr.length];
		
		
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1)
				perArr[i] = arr[i];
//				System.out.println(arr[i]);
			else
				perArr[i] = arr[i];
//				System.out.print(arr[i] + ",");
		}
		
		return perArr;
	}
	
}
