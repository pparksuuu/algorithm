package 기초코딩테스트_트레이닝;

import java.util.Scanner;

public class 하노이_숫자 {
	public static void main(String[] args) {
		int N;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		hanoi(N, 1, 2, 3);
	}
	
	private static void hanoi(int top, int from, int mid, int to) {
		if (top == 1) {
			System.out.println(from + " " + to);
		} else {
			hanoi(top - 1, from, to, mid);
			System.out.println(from + " " + to);
			hanoi(top - 1, mid, from, to);
		}
	}
}
