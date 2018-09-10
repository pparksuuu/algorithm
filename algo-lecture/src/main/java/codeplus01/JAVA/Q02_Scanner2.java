package codeplus01.JAVA;
// Scanner 
//
// "hasNext자료형"을 이용해서 입력받을 수 있는 자료형이 있는지 구할 수 있다.
// https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html
//
import java.util.*;

public class Q02_Scanner2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (sc.hasNext()) {
            sum += sc.nextInt();
        }
        System.out.println(sum);
    }
}
