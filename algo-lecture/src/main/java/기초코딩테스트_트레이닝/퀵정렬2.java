package 기초코딩테스트_트레이닝;

public class 퀵정렬2 {
	public static void main(String[] args) {
		int[] arrs = {5, 6, 2, 8, 7, 23, 4, 1};
		quickSort(arrs, 0, arrs.length - 1);
		for (int a : arrs) {
			System.out.print(a + " ");
		}
	}
	
	private static void swap(int[] a, int idx1, int idx2) {
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
			if (pl <= pr)
				swap(a, pl++, pr--);
		} while (pl <= pr);
		
		if (left < pr) quickSort(a, left, pr);
		if (pl < right) quickSort(a, pl , right);
	}
}
