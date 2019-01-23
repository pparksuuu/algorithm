package 기초코딩테스트_트레이닝;

import java.util.Scanner;

public class 하노이 {
	public static void main(String[] args) {
		int N;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		hanoi(N, 1, 2, 3);
	}
	
	public static void hanoi(int top, int from, int mid, int to) {
		if (top == 1) {
			System.out.println("원판 1이 기둥 " + from + "에서 기둥 " + to + "로 이동");
		} else {
			hanoi (top - 1, from, to, mid);
			System.out.println("원판" + top + "이 기둥" + from + "에서 기둥" + to + "로 이동");
			hanoi (top - 1, mid, from, to);
		}
	}
}
