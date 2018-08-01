// 순차 탐색(Sequantial Search)
package lecs.lec01_recursion;

public class Exam16_BinarySearch { 
    
    public static void main(String args[]) {
        String[] data = {"Hi","show","sleepy","cool",};
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


// 미로찾기는 여러 해법이 있지만 recursion이 가장 간단.
//
// Recursion 문제를 풀 때 중요한 것
// => 이 코드가 무한 루프에 빠지지 않는가? (Recursion은 무한 루프에 빠지기 딱 좋은 구조 - 재귀이기 때문)
// => Recursion의 두 가지 조건을 보장해야만 한다.
//
//
// Recursive Thinking (내가 풀어야하는 문제 안에 또 내가 풀어야하는 문제가 있다.)
//
// 현재 위치에서 (이미 가본 곳을 다시 지나지 않고) 출구까지 가는 경로가 있으려면
// 1. 현재 위치가 출구이거나
// 2. 이웃한 셀들 중 하나에서 (이미 가본 곳을 다시 지나지 않고) 출구까지 가는 경로가 있거나
//
// Decision Problem(답이 yes or no인 문제)
//