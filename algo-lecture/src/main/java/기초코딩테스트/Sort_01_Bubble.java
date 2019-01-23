package 기초코딩테스트;

public class Sort_01_Bubble {
//	private static int[] input = {5, 6, 2, 8, 7, 23, 4, 1};
//	private static int[] input2 = {5, 6, 2, 8, 7, 23, 4, 1};
	
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
	
	// 앞에서부터 버블정렬
	private static void bubbleSort(int[] input, int length) {
		for (int i = length - 1; i > 0; i--)
			for (int j = 0; j < i; j++) {
				if (input[j] > input[j + 1]) {
					swap(input, j + 1, j);
			  
				}
			}
	}
	
	// 뒤에서부터 버블정렬
	private static void bubbleSort2(int[] input, int length) {
		for (int i = 0; i < length - 1; i++) {
			for (int j = length - 1; j > i; j--) {
				if (input[j - 1] > input[j]) {
					swap(input, j - 1, j);
				}
			}
		}
	}
}
