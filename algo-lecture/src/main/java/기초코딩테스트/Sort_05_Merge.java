package 기초코딩테스트;

public class Sort_05_Merge {
	public static void main(String[] args) {
		char[] A = {'A', 'R', 'G', 'C', 'T', 'Y', 'B', 'W'};
		A = mergeSort(A, 0, A.length - 1);
		System.out.println(A);
	}

	public static char[] mergeSort(char[] A, int p, int r) {
		if (p < r) {
			int q = (p + r) / 2;
			mergeSort(A, p, q);
			mergeSort(A, q+1, r);
			A = merge(A, p, q, r);
		}
		return A;
	}

	public static char[] merge(char[] data, int p, int q, int r) {
		int i = p, j = q + 1, k = p;
		char[] tmp = new char[data.length];
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
			data[i] = tmp[i];
		}
		return data;
	}
}
