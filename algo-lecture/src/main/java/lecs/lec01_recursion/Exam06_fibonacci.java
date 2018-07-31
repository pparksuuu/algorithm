package lecs.lec01_recursion;

public class Exam06_fibonacci {
    public static void main(String args[]) {
        int result = fibonacci(7);
        System.out.println(result);
    }
    
    public static int fibonacci(int n) {
        if (n < 2) 
            return n;
        else {
            return fibonacci(n - 1) + fibonacci(n - 2); 
        }
            
    }
    
    // 무한루프에 빠지지 않으려면? (두 가지 요구사항!)
    // 1. 적어도 하나의 Base case가 존재 
    // 2. Recursive case가 base case로 수렴해야 한다.
}
