package codeplus01.JAVA;
// Scanner
// 서로 다른 자료형을 입력받아야 할 때,
// nextLine()을 이용하여 줄바꿈을 처리해줘야 한다.
import java.util.*;

public class Q02_Scanner3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        System.out.println(n + "\n" + s);
    }
}
