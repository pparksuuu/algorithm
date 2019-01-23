package 기초코딩테스트;

public class Sort_03_Selection {
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

	private static void selectionSort(int[] input, int n) {
		int min;
		for (int i = 0; i < n - 1; i++) {
			min = i;
			for (int j = i + 1; j < n; j++) { // 가장 작은 걸 찾는다.
				if (input[j] < input[min])
					min = j;
			}
			swap(input, i, min);
		}
	}
}
