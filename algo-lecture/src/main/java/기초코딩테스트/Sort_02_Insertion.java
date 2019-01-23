package 기초코딩테스트;

//https://limkydev.tistory.com/109

public class Sort_02_Insertion {
	private static int[] input = {5, 6, 2, 8, 7, 23, 4, 1, 44};

	public static void main(String[] args) {
		insertionSort(input, input.length);
		for (int a : input) {
			System.out.print(a + " ");
		}
	}

	private static void insertionSort(int[] input, int length) {
		int temp = 0;
		int j = 0;
		for (int i = 1; i < length; i++) {
			temp = input[i];
			for (j = i; j > 0 && input[j - 1] > temp; j--) {
				input[j] = input[j - 1];
			}
			input[j] = temp;
		}
	}
}
