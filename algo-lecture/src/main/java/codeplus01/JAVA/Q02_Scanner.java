package codeplus01.JAVA;
// Scanner
// 입력을 편하게 받을 수 있다.
// "next자료형"을 이용해서 입력을 받을 수 있고
// "hasNext자료형"을 이용해서 입력받을 수 있는 자료형이 있는지 구할 수 있다.
// https://docs.oracle.com/javase/8/docs/api/
//
// https://www.acmicpc.net/problem/1000
// [문제 : 두 정수 A와 B를 입력받은 다음, A + B를 출력하는 프로그램을 작성하시오.]
// (0 < A, 0 < 10)
import java.util.*;

public class Q02_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // System.in을 이용하여 스캐너를 만든다.
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(a + b);
    }
}
