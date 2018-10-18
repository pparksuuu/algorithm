package codeplus05.JAVA.DynamicProgramming;

import java.util.Scanner;

// Top-down 방식
public class Q01_1로만들기_1463_TopDown {
    public static int[] m; // Memoization
    public static int go(int X) {
        if (X == 1) {
            return 0;
        }
        if (m[X] > 0) {
            return m[X];
        }
        m[X] =  go(X - 1) + 1;
        if (X % 2 == 0) {
            int temp = go(X / 2) + 1;
            if (m[X] > temp) {
                m[X] = temp;
            }
        }
        if (X % 3 == 0) {
            int temp = go(X / 3) + 1;
            if (m[X] > temp) {
                m[X] = temp;
            }
        }
        return m[X];
    }
    
    public static void main(String[] args) {
        // 1. X를 받아오자.
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        
        // 정수 X에 사용할 수 있는 연산은 3가지
        // 1. X가 3으로 나.떨 -> 3으로 나눈다.
        // 2. X가 2로 나.떨 -> 2로 나눈다.
        // 3. 1을 뺀다.
        // 이 세 연산을 사용해 1을 만든다. 연산 사용의 최소 값?
        m = new int[X + 1];
        System.out.println(go(X));
    }
}
