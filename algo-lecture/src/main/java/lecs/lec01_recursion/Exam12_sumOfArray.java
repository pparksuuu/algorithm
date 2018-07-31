package lecs.lec01_recursion;

public class Exam12_sumOfArray { // data[0] 에서 data[n-1] 까지의 합을 구하여 반환한다.
    public static void main(String args[]) {
        int[] data = {1,2,3,4,5,6,7,8};
        System.out.println(sumOfArray(3, data)); 
    }
    
    public static int sumOfArray(int n, int[] data) {
        if (n == 0)
            return 0;
        else 
            return sumOfArray(n - 1, data) + data[n - 1];
    }
    // 무한루프에 빠지지 않으려면? (두 가지 요구사항!)
    // 1. 적어도 하나의 Base case가 존재 
    // 2. Recursive case가 base case로 수렴해야 한다.
}
