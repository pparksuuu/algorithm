package practice.lec01_recursion;

public class Exam02 {
    public static void main(String args[]) {
        func(4);
    }
    
    public static void func(int n) {
        if (n <= 0) // Base case :  적어도 하나의 recursion에 빠지지 않는 경우가 존재
            return; // return : 자기 자신을 호출한 문장으로 돌아가 다음 문장을 실행
        else {
            System.out.println("Hello.. : " + n);
            func(n - 1); // Recursive case : recursion을 반복하다보면 결국 base case로 수혐해야 한다.
        }
    }
}

// 무한루프에 빠지지 않으려면?
// 1. 적어도 하나의 base case가 존재
// 2. Recursive case가 base case로 수렴해야 한다.
