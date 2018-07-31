package lecs.lec01_recursion;

public class Exam05_xsquar {
    public static void main(String args[]) {
        double result = power(4, 3);
        System.out.println(result);
    }
    
    public static double power(double x, int n) {
        if (n == 0) 
            return 1;
        else {
            return x * power(x, n - 1); 
        }
            
    }
    
    // 무한루프에 빠지지 않으려면? (두 가지 요구사항!)
    // 1. 적어도 하나의 Base case가 존재 
    // 2. Recursive case가 base case로 수렴해야 한다.
}
