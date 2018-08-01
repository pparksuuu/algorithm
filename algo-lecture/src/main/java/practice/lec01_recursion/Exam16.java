// 순차 탐색(Sequantial Search)
package practice.lec01_recursion;

public class Exam16 {
    public static void main(String args[]) {
        String[] data = {"Hi","show","sleepy","cool"};
        System.out.println(binarySearch(data, "cool", 0,  data.length - 1));
    }
    
    public static int binarySearch(String[] items, String target, int begin, int end) {
        if (begin > end)
            return -1;
        else {
            int middle = (begin + end) / 2;
            int compResult = target.compareTo(items[middle]);
            if (compResult == 0)
                return middle;
            else if (compResult < 0)
                return binarySearch(items, target, begin, middle - 1);
            else
                return binarySearch(items, target, middle + 1, end);
            
        }
    }
    
}

