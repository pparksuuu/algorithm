package codeplus01.JAVA;
// StringTokenizer
// 문자열을 토큰(공백, 콤마 ...)으로 잘라야할 때 사용하면 편하다.
// https://docs.oracle.com/javase/8/docs/api/java/util/StringTokenizer.html
//
// [문제 : 더하기 3]
// https://www.acmicpc.net/problem/11023
// 
import java.io.*; // BufferedReader
import java.util.*; // StringTokenizer

public class Q04_StringTockenizer {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line = bf.readLine();
        StringTokenizer st = new StringTokenizer(line);
        int sum = 0;
        while (st.hasMoreTokens()) {
            sum += Integer.valueOf(st.nextToken());
        }
        System.out.println(sum);
    }
}
