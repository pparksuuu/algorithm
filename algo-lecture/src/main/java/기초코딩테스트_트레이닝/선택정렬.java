package 기초코딩테스트_트레이닝;

// 가장 작은 요소부터 선택해 알맞은 위치로 옮겨서 순서대로 정렬하는 알고리즘.

public class 선택정렬 {
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
			for (int j = i + 1; j < n; j++) {
				if (input[j] < input[min])
					min = j; // 최솟값이 있는 인덱스 저장.
			}
			swap(input, i, min); // 맨 앞에 있는 아이(고정시킬 아이)와 최솟값 교환
		}
	}
}
