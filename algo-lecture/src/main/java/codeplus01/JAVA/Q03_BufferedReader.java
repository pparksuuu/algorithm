package codeplus01.JAVA;
// BufferedReader
//
// Scanner는 느린 경우가 많기 때문에, 입력이 많은 경우에는 BufferedReader를 사용하는 것이 좋다.
// https://docs.oracle.com/javase/8/docs/api/java/io/BufferedReader.html
//
// [문제 : 네 수]
// https://www.acmicpc.net/problem/10824
// 네 자연수 A, B, C, D가 주어진다. 이 때, A와 B를 붙인 수와 C와 D를 붙인 수의 합을 구하는 프로그램을 작성하시오.
// 두 수 A와 B를 합치는 것은 A의 뒤에 B를 붙이는 것을 의미한다. 즉, 20과 30을 붙이면 2030이 된다.
// 첫째 줄에 네 자연수 A, B, C, D가 주어진다. (1 ≤ A, B, C, D ≤ 1,000,000)
// 
import java.io.*; //BufferedReader는 여기에 들어가있음

public class Q03_BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] line = bf.readLine().split(" ");
        String a = line[0] + line[1];
        String b = line[2] + line[3];
        long ans = Long.valueOf(a) + Long.valueOf(b); // 14자리 이상이면 int 범위를 넘어감.
        System.out.println(ans);
    }
}
