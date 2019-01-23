package 기초코딩테스트_트레이닝;

public class 합병정렬3 {
	public static void main(String[] args) {
		int[] input = {5, 6, 2, 8, 7, 23, 4, 1};
		mergeSort(input, 0, input.length - 1);
		for (int a : input)
			System.out.print(a + " ");
	}
	
	private static void mergeSort(int[] a, int left, int right) {
		if (left < right) {
			int center = (left + right) / 2;
			mergeSort(a, left, center);
			mergeSort(a, center + 1, right);
			merge(a, left, center, right);
		}
	}
	
	private static void merge(int[] a, int p, int q, int r) {
		int i = p, j = q + 1, k = p;
		int[] tmp = new int[a.length];
		
		while (i <= q && j <= r) {
			if (a[i] <= a[j])
				tmp[k++] = a[i++];
			else
				tmp[k++] = a[j++];
		}
		
		while (i <= q)
			tmp[k++] = a[i++];
		while (j <= r) {
			tmp[k++] = a[j++];
		}
		
		for (i = p; i <= r; i++) {
			a[i] = tmp[i];
		}
	}
}
