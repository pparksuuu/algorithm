package Sorting;

public class MergeSort_JAVA {
    
    public static void main(String[] args) {
        int[] test = {21, 10, 12, 20, 25, 13, 15, 22};

        System.out.println("소팅 전");
        for (int data : test) {
            System.out.print(data + ", "); 
        }

        mergeSort(test, 0, test.length - 1);

        System.out.println("\n소팅 후");
        for (int data : test) {
            System.out.print(data + ", "); 
        }
    }
    
    // i : 정렬된 왼쪽 리스트에 대한 인덱스
    // j : 정렬된 오른쪽 리스트에 대한 인덱스
    // k : 정렬될 리스트에 대한 인덱스
    /* 2개의 인접한 배열 list[left...mid]와 list[mid+1...right}의 합병 과정 */
    /* (실제로 숫자들이 정렬되는 과정) */
    public static void merge(int list[], int left, int mid, int right) {
        int [] sorted = new int[8];
        
        int i, j, k, l;
        i = left;
        j = mid + 1;
        k = left;
        
        /* 분할 정렬된 list의 합병 */
        while(i <= mid && j <= right) {
            if (list[i] <= list[j])
                sorted[k++] = list[i++];
            else
                sorted[k++] = list[j++];
        }
        
        // 남아 있는 값들을 일괄 복사
        if (i > mid) {
            for (l = j; l <= right; l++)
                sorted[k++] = list[l];
        } else { // 남아 있는 값들을 일괄 복사
            for (l = i; l <= mid; l++) 
                sorted[k++] = list[l];
        }
        
        //배열 sorted[](임시 배열)의 리스트를 배열 list[]로 재복사
        for (l = left; l <= right; l++) {
            list[l] = sorted[l];
        }
    }
    
    public static void mergeSort(int[] list, int left, int right) {
        int mid;
        
        if (left < right) {
            mid = (left + right) / 2; // 중간 위치를 계산하여 리스트를 균등 분할 - 분할(Divide)
            mergeSort(list, left, mid); // 앞쪽 부분 리스트를 정렬 - 정복(Conquer)
            mergeSort(list, mid + 1, right); // 뒤쪽 리스트를 정렬(Conquer)
            merge(list, left, mid, right);
        }
        
    }
}
