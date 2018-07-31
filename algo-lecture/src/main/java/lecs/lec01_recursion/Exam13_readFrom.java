package lecs.lec01_recursion;

import java.util.Scanner;

// 데이터 파일로부터 n개의 정수를 읽어오기
public class Exam13_readFrom { // data[0] 에서 data[n-1] 까지의 합을 구하여 반환한다.
    public static void main(String args[]) {
    }

    // Scanner in 이 참조하는 파일로부터 n개의 정수를 입력받아 
    // 배열 data의 data[0],...,data[n-1]에 저장한다.
    public static void readFrom(int n, int[] data, Scanner in) {
        if (n == 0)
            return;
        else {
            readFrom(n - 1, data, in);
            data[n - 1] = in.nextInt();
        }
    }
    // 무한루프에 빠지지 않으려면? (두 가지 요구사항!)
    // 1. 적어도 하나의 Base case가 존재 
    // 2. Recursive case가 base case로 수렴해야 한다.
}
