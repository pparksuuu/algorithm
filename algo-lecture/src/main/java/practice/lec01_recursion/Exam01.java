package practice.lec01_recursion;

public class Exam01 {
    public static void main(String args[]) {
        func();
    }
    
    public static void func() {
        System.out.println("Hello...");
        func();
    }
}

// 무한 루프에 빠진다 !
// Recursion의 두 가지 조건
// 1. base case (끝나는 조건)
// 2. recursive case (반복되는 구조) => 단, recursive case는 base case에 수렴해야 한다.