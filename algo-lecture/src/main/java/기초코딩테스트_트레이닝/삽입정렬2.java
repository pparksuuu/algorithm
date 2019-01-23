package 기초코딩테스트_트레이닝;

public class 삽입정렬2 {
	public static void main(String[] args) {
		int[] input = {5, 6, 2, 8, 7, 23, 4, 1, 44};
		insertionSort(input, input.length);
		for (int a : input) {
			System.out.print(a + " ");
		}
	}
	
	private static void insertionSort(int[] a, int n) {
		int temp = 0;
		int j = 0;
		for (int i = 1; i < n - 1; i++) {
			temp = a[i];
			for (j = i; j > 0 && a[j - 1] > temp ;j--)
				a[j] = a[j - 1];
			a[j] = temp;
		}
	}
	
}
