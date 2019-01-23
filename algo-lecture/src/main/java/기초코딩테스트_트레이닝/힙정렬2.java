package 기초코딩테스트_트레이닝;

public class 힙정렬2 {
	public static void main(String[] args) {
		int[] input = {5, 6, 2, 8, 7, 23, 4, 1};
		heapSort(input, input.length);
		for (int a : input) {
			System.out.print(a + " ");
		}
	}
	
	public static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}
	
	public static void heapify (int a[], int n, int i) {
		int p = i; // 부모 인덱스
		int l = i * 2 + 1; // 왼쪽 자식 인덱스
		int r = i * 2 + 2; // 오른쪽 자식 인덱스
		
		if (l < n && a[p] < a[l]) { // 부모가 왼쪽 자식보다 작다?
			p = l; // 더 큰 아이를 부모 인덱스로
		}
		
		if (r < n && a[p] < a[r]) { // 부모가 오른쪽 자식보다 작다?
			p = r; //더 큰 아이를 부모인덱스로
		}
		if (i != p) { // 부모가 될 아이가 바뀜.
			swap(a, p, i); // 부모와 자식 바꾸고! (최대힙)
			heapify(a, n, p); // 새로운 부모로 다시 트리 check.
		}
	}
	
	private static void heapSort(int[] input, int n) {
		for (int i = n / 2 - 1; i >= 0; i--) {
			heapify(input, n, i);
		}
		
		for (int i = n - 1; i > 0; i--) {
			swap(input, 0, i);
			heapify(input, i, 0);
		}
	}
}
