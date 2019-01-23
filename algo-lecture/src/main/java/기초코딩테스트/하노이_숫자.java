package 기초코딩테스트;

import java.util.Scanner;

public class 하노이_숫자 {
	public static void main(String[] args) {
		int N;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		hanoi(N, 1, 2, 3);
	}
	
	public static void hanoi(int i, int from, int mid, int to) {
		if (i == 1) {
			System.out.println(from + " " + to);
		} else {
			hanoi(i - 1, from, to, mid);
			System.out.println(from + " " + to);
			hanoi(i - 1, mid, from, to);
		}
	}
}
