package SelfStudy;

import java.util.Arrays;
import java.util.Scanner;

public class Escape_Last_Try {

	static Scanner sc = new Scanner(System.in);
	static int N; // 통과한 차량 수
	static int M; // 차량 색상 수

	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		
		int t = sc.nextInt();
		sc.nextLine();

		for (int tc = 1; tc <= t; tc++) {
			N = sc.nextInt();
			M = sc.nextInt();

			// 죄수가 탄 차량 배열 만들기 -> 이거로 비교할거임
			int[] criminalsArray = new int[M];
			int criminals = 0;

			for (int i = 0; i < M; i++) {
				criminalsArray[i] = sc.nextInt();
				criminals += criminalsArray[i];
			}

			// 톨게이트 지나간 차량
			int[] tollGate = new int[N];
			for (int i = 0; i < N; i++) {
				tollGate[i] = sc.nextInt();
			}


			// 끊어서 test할 배열
			int[] testArray = new int[M];

			// 비교 for문
			int answer = -1;

			// criminal 값만큼 잘라서 비교
			for (int i = 0; i <= tollGate.length - (criminals); i++) {
				for (int j = i; j < i + (criminals);j++) {
					testArray[(tollGate[j] - 1)] += 1;
				}

				// criminalArray와 비교 + 없으면 testArray 다 초기화
				if (Arrays.equals(criminalsArray, testArray)) {
					answer = i; 
					break;
				} else {
					testArray = new int[M];
				}
			}

			System.out.printf("#%d %d\n", tc, answer + 1);
		}
		
		long end = System.currentTimeMillis();
		System.out.println("실행 시간 : " + (end - start)/1000.0);
	}
}
