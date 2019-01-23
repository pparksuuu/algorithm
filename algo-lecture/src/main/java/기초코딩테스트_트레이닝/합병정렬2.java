package 기초코딩테스트_트레이닝;

public class 합병정렬2 {
	static int[] buff;
	
	public static void main(String[] args) {
		int[] arrs = {5, 6, 2, 8, 7, 23, 4, 1};
		mergeSort(arrs, 0, arrs.length - 1);
	}
	
	private static void mergeSort(int[] a, int left, int right) {
		if (left < right) {
			int center = (left + right) / 2;
			mergeSort(a, left, center);
			mergeSort(a, center + 1, right);
			a = merge(a, left, center, right);
		}
	}
	
	private static int[] merge(int[] data, int p, int q, int r) {
		int i = p, j = q + 1, k = p;
		int[] tmp = new int[data.length];
		while (i <= q && j <= r) {
			if (data[i] <= data[j]) 
				tmp[k++] = data[i++];
			else
				tmp[k++] = data[j++];
		}
		while (i <= q)
			tmp[k++] = data[i++];
		while (j <= r)
			tmp[k++] = data[j++];
		for (i = p; i <= r; i++) {
			data[i] =tmp[i];
		}
		return data;
	}
}
