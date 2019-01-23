package 기초코딩테스트_트레이닝;

// https://mygumi.tistory.com/310
// O(nlogn)
// 불안정 정렬
// 최대 힙 구성!

public class 힙정렬 {
	public static void main(String[] args) {
		int[] input = {5, 6, 2, 8, 7, 23, 4, 1};
		heapSort(input, input.length);
		for (int a : input) {
			System.out.print(a + " ");
		}
	}
	
	private static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}
	
	private static void heapify(int a[], int n, int i) {
		int p = i; // 부모 인덱스
		int l = i * 2 + 1; // 왼쪽 자식 인덱스
		int r = i * 2 + 2; // 오른쪽 자식 인덱스
		
		if (l < n && a[p] < a[l]) { // 부모가 왼쪽 자식보다 작다?
			p = l; // 더 큰 아이를 부모 인덱스로
		}
		
		if (r < n && a[p] < a[r]) { // 부모가 오른쪽 자식보다 작다?
			p = r; //더 큰 아이를 부모인덱스로
		}
		
		if (i != p) { // 부모가 될 아이가 바뀌었어 !
			swap(a, p, i); // 노드 바꾸고
			heapify(a, n, p); // 새로운 부모로 다시 트리가 정렬 잘 됐는지 check.
		}
	}
	
	private static void heapSort(int[] input, int n) {
		// init, max heap
		// 단순히 일반 배열을 힙으로 구성, 그 과정에서 자식 노드로부터 부모 노드를 비교
		// n / 2 - 1부터 0까지 인덱스가 도는 이유는 부모 노드의 인덱스를 기준으로
		// 왼쪽 자식노드 (i * 2 + 1), 오른쪽 자식노드 (i * 2 + 2) 이기 때문.
		for (int i = n / 2 - 1; i >= 0; i--) { 
			heapify(input, n, i);
		}
		
		// 요소가 하나 제거된 수 다시 최대 힙을 구성하기 위함.
		// for extract max element from heap
		for (int i = n - 1; i > 0; i--) {
			swap(input, 0, i);
			heapify(input, i, 0);
		}
	}
}
