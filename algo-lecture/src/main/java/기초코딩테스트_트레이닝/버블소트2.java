package 기초코딩테스트_트레이닝;

public class 버블소트2 {
	public static void main(String[] args) {
		int[] input = {5, 6, 2, 8, 7, 23, 4, 1};
		bubbleSort(input, input.length);
		for (int a : input) {
			System.out.print(a + " ");
		}
	}
	
	private static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}
	
	private static void bubbleSort(int[] a, int n) {
		for (int i = n - 1; i > 0; i--)
			for (int j = 0; j < i; j++) {
				if (a[j + 1] < a[j])
					swap(a, j, j + 1);
			}
	}
}
