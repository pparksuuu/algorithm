package 기초코딩테스트;

import java.util.Scanner;

public class Sort_04_Quick {
	public static void main(String[] args) {
		int[] arrs = {5, 6, 2, 8, 7, 23, 4, 1};
		quickSort(arrs, 0, arrs.length - 1);
		
		for (int i : arrs) {
			System.out.print(i + " ");
		}
	}
	
	// 배열 요수 a[idx1]과 a[idx2]의 값을 바꿉니다.
	static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}
	
	private static void quickSort(int[] a, int left, int right) {
		int pl = left;
		int pr = right;
		int x = a[(pl + pr) / 2];
		
		do {
			while (a[pl] < x) pl++;
			while (a[pr] > x) pr--;
			if (pl <= pr) // 아직 교차하지 않았음.
				swap(a, pl++, pr--); // 바꾸고 피봇들은 전진
		} while (pl <= pr); // 교차할 때까지 반복
		
		if (left < pr) quickSort(a, left, pr);
		if (pl < right) quickSort(a, pl, right);
	}
}
