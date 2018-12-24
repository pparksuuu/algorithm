package SelfStudy;

import java.util.Scanner;

public class Escape {
	
	static Scanner sc = new Scanner(System.in);
	
	static int N; // 톨게이를 통과한 차량의 수
	static int M; // 존재할 수 있는 차량의 색상 수
	
	public static void main(String[] args) {
		int t = sc.nextInt();
		sc.nextLine();
		
		for (int tc = 1; tc <= t; tc++) {
			System.out.println("================");
			// N M
			String NM = sc.nextLine();
			N = Integer.parseInt(NM.split(" ")[0]);
			M = Integer.parseInt(NM.split(" ")[1]);
			
			// 색상별 죄수들이 탄 차량 
			String[] cars = sc.nextLine().split(" ");
			
			// 톨게이트 통과하는 차량들
			String[] tollGate = sc.nextLine().split(" ");
			
		}
	}
}
