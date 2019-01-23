package 기초코딩테스트;

public class Sort_06_Heap {
	public static void main(String[] args) {
		int[] array = { 230, 10, 60, 550, 40, 220, 20 };
		
		heapSort(array);
		
		for (int a : array) {
			System.out.print(a + " ");
		}
	}
	
	public static void swap(int[] array, int a, int b) {
	    int temp = array[a];
	    array[a] = array[b];
	    array[b] = temp;
	}
	
	public static void heapify(int array[], int n, int i) {
	    int p = i;
	    int l = i * 2 + 1;
	    int r = i * 2 + 2;
	 
	    if (l < n && array[p] < array[l]) {
	        p = l;
	    }
	 
	    if (r < n && array[p] < array[r]) {
	        p = r;
	    }
	 
	    if (i != p) {
	        swap(array, p, i);
	        heapify(array, n, p);
	    }
	}
	 
	public static void heapSort(int[] array) {
	    int n = array.length;
	 
	    // init, max heap
	    for (int i = n / 2 - 1; i >= 0; i--) {
	        heapify(array, n, i);
	    }
	 
	    // for extract max element from heap
	    for (int i = n - 1; i > 0; i--) {
	        swap(array, 0, i); // 가장 큰 요소와 아직 정렬되지 않은 부분의 마지막 요소를 교환
	        heapify(array, i, 0); // a[0] ~ a[i - 1]을 힙으로 만든다 
	    }
	}
	 
}
