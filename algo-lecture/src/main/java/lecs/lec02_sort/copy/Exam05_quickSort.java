package lecs.lec02_sort.copy;

public class Exam05_quickSort {
    public static void main(String args[]) {
        int[] A = {25, 13, 27, 4, 2, 97, 33, 22};
        quickSort(A, 0, A.length -1);
        for (int i : A) {
            System.out.println(i);
        }
    }
    
    public static int[] quickSort(int[] A, int p, int r) {
        if (p < r) {
            int q = partition(A, p, r);
            quickSort(A, p, q - 1); // 왼쪽 부분배열 정렬
            quickSort(A, q + 1, r); // 오른쪽 부분배열 정렬
        }
        return A;
    }
    
    public static int partition(int A[], int p, int r) {
        int x = A[r]; // x는 pivot
        int i = p-1; // 작은 쪽 기준 pivot
        for (int j = p; j <= r-1; j++) {
            if (A[j] <= x) {
                int temp = A[++i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        A[i + 1] = A[r];
        return i + 1;
    }
}
