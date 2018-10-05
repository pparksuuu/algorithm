package SortingPractice;

// 선택정렬(
public class SelectionSort {
    public static void main(String[] args) {
        int test[] = {10, 2, 89, 7, 10};
        
        System.out.println("선택정렬 전");
        for (int data : test) {
            System.out.print(data + ", ");
        }
        
        selectionSorting(test, test.length);
        
        System.out.println("\n선택정렬 후");
        for (int data : test) {
            System.out.print(data + ", ");
        }
    }
    
    public static void selectionSorting(int[] list, int n) {
        int i, j, least, tmp;
        for (i = 0; i < n - 1; i++) { // 마지막 원소는 자동정렬되므로 n - 1번만!
            least = i;
            
            for (j = i + 1; j < n; j++) {
                if (list[j] < list[least]) {
                    least = j; // 가장 작은 값을 가진 인덱스를 기억한다.
                }
            }
            
            if (i != least) { // 자리 바꿈!
                tmp = list[i];
                list[i] = list[least];
                list[least] = tmp;
            }
        }
    }
}
