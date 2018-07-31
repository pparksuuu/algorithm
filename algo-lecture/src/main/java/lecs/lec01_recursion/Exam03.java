package lecs.lec01_recursion;

public class Exam03 {
    public static void main(String args[]) {
        int result = func(4);
        System.out.println(result);
    }
    
    public static int func(int n) {
        if (n == 0) 
            return 0;
        else {
            System.out.println("Hello... : " + n);
            return n + func(n - 1); 
        }
            
    }
    
    // 무한루프에 빠지지 않으려면? (두 가지 요구사항!)
    // 1. 적어도 하나의 Base case가 존재 
    // 2. Recursive case가 base case로 수렴해야 한다.
}
