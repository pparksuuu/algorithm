package 기초코딩테스트_트레이닝;

public class 선택정렬3 { // 가장 작은 아이를 골라 앞에서부터 채운다.
	public static void main(String[] args) {
		int[] input = {5, 6, 2, 8, 7, 23, 4, 1};
		selectionSort(input, input.length);
		for (int a : input) {
			System.out.print(a + " ");
		}
	}

	private static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}

	private static void selectionSort(int[] a, int n) {
		int min;
		for (int i = 0; i < n - 1; i++) {
			min = i;
			for (int j = i; j < n; j++) {
				if (a[j] < a[min])
					min = j;
			}
			swap(a, i, min);
		}
	}
}
