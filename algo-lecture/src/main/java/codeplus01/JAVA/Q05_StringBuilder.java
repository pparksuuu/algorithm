package codeplus01.JAVA;
// StringBuilder
// 출력해야 하는 것이 많은 경우에는
// StringBuilder를 이용해 문자열을 만들고, 출력하는 것이 좋다.
//
// [문제 : N찍기]
// https://www.acmicpc.net/problem/2741
import java.util.*; 

public class Q05_StringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i <=n; i++) {
            System.out.println(i);
        }
    }
}
