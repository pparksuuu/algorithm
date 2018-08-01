// 순차 탐색(Sequantial Search)
package practice.lec01_recursion;

public class Exam14 {
    public static void main(String args[]) {
        int[] data = {1,5,205,602,4,6506,27,10};
        
        System.out.println(findMax(data, 0, data.length - 1));
        System.out.println(findMax(data, 2, data.length - 4));
        
        System.out.println(findMaxMiddle(data, 0, data.length - 1));
        System.out.println(findMaxMiddle(data, 2, data.length - 4));
    }
    
    // 이 함수의 미션은 data[begin] ~ data[end] 사이에서 최대값을 찾아 반환한다.
    // begin <= end라 가정한다.
    public static int findMax(int[] data, int begin, int end) {
        if (begin == end)
            return data[begin];
        else
            return Math.max(data[begin], findMax(data, begin + 1, end));
    }
    
    public static int findMaxMiddle(int[] data, int begin, int end) {
        if (begin == end)
            return data[begin];
        else {
            int middle = (begin + end) / 2;
            int max1 = findMaxMiddle(data, begin, middle);
            int max2 = findMaxMiddle(data, middle + 1, end);
            return Math.max(max1, max2);
        }
    }
}