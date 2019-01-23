package 기초코딩테스트_트레이닝;

public class 버블소트 {
	public static void main(String[] args) {
		int[] input = {5, 6, 2, 8, 7, 23, 4, 1};
		int[] input2 = {5, 6, 2, 8, 7, 23, 4, 1};
		
		bubbleSort(input, input.length);
		for (int a : input) {
			System.out.print(a + " ");
		}
		
		System.out.println();
		bubbleSort2(input2, input2.length);
		for (int a : input2) {
			System.out.print(a + " ");
		}
	}

	private static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}
	
	// 앞에서부터 고고!
	private static void bubbleSort(int[] a, int n) {
		for (int i = n - 1; i > 0; i--)
			for (int j = 0; j < i; j++) {
				if (a[j + 1] < a[j])
					swap(a, j, j + 1);
			}
	}
	
	// 뒤에서부터 고고
	private static void bubbleSort2(int[] a, int n) {
		for (int i = 0; i < n - 1; i++)
			for (int j = n - 1; j > i; j--) {
				if (a[j] < a[j - 1])
					swap(a, j, j - 1);
			}
	}
}
