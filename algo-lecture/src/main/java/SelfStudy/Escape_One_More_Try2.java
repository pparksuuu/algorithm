package SelfStudy;

import java.util.Arrays;
import java.util.Scanner;

public class Escape_One_More_Try2 {

	static Scanner sc = new Scanner(System.in);
	static int N; // 톨게이트 통과한 차량 수
	static int M; // 차량의 색상 수
	static int answer = -1;
	
	public void perm(String tollGate, int[] arr, int depth, int n, int k) {
		if (depth == k) {
			checkPerm(tollGate, arr);
			return;
		}
		
		for (int i = depth; i < n; i++) {
			swap(arr, i, depth);
			perm(tollGate, arr, depth + 1, n, k);
			swap(arr, i, depth);
		}
		
	}
	
	public void checkPerm(String tollGate, int[] arr) {
		
//		StringBuilder sb = new StringBuilder();
		String sb = "initialization";
		
		int[] temp = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			sb += (arr[i] + "");
//			temp[i] = arr[i];
		}
		
		
		sb = sb.replace("initialization", "");
		
		// tollGate에 일치하는거 있는지 확인!
		/*
		if (tollGate.contains(sb)) {
			System.out.println("잡았다 요놈! 인덱스는 몇이냐!" + tollGate.indexOf(sb));
		}
		*/
		
		if (tollGate.indexOf(sb) > -1) {
//			System.out.println("잡았다 요놈!" + tollGate.indexOf(sb));
			answer = tollGate.indexOf(sb);
		} 
		
	}
	
	public void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void main(String[] args) {

		// 1. 일단 받아서 조합을 다 만든다. 1000개이기 때문에 ... 엥?
		// 조합이 1000!이면 너무 큰데..? -> 저장하지 않고 그냥 만들면서 바로 바로 check.
		// 다 check했을 때 답이 없다면? 0, 있으면 indexOf + 1해서 return
		
		/*
		String criminals = "2314";
		String test = "1204928231486049";
		
		if (test.indexOf(criminals) > -1) {
			System.out.println(test.indexOf(criminals));
		}
		*/
		
		int t = sc.nextInt();
		sc.nextLine();
		
		for (int tc = 1; tc <= t; tc++) {
			answer = -1;
			/*
			int[] arr = {1,2,3};
//			new Escape_One_More_Try2().perm(arr, 0, 3, 3);
			 */
			
			String NM = sc.nextLine();
			N = Integer.parseInt(NM.split(" ")[0]);
			M = Integer.parseInt(NM.split(" ")[1]);
			
			// 색상별 죄수들이 탄 차량 
			String[] cars = sc.nextLine().split(" ");
			
			// 배열에 넣을 것이다. (permutation할 배열임)
			int criminals = 0;
			for (int i = 0; i < M; i++) {
				if(Integer.parseInt(cars[i]) > 0) {
//					int carCount = Integer.parseInt(cars[i]);
					criminals += Integer.parseInt(cars[i]);
				}
			}
//			System.out.println(criminals);

			
			// 배열 안에 String[]의 값들을 int[]로 담음. ->permutation 해야겠지?
			int[] carInt = new int[criminals];
			int arrayCount = 0;
			for (int i = 0; i < M; i++) {
				if (Integer.parseInt(cars[i]) > 0) {
					for (int j = 0; j < Integer.parseInt(cars[i]); j++) {
						carInt[arrayCount++] = (i + 1);
					}
				}
			}
			

			
			/*
			for (int i = 0; i < criminals; i++) {
				System.out.println(i + "번째 값은 : " + carInt[i]);
			}
			*/
			
			// 톨게이트 통과하는 차량들
			String tollGate = sc.nextLine().replace(" ", "");
//			System.out.println(tollGate);
			
			// 테스팅
			new Escape_One_More_Try2().perm(tollGate, carInt, 0, criminals, criminals);
//			System.out.printf("#" + tc + "는" + answer);
			System.out.printf("#%d %d\n", tc, answer + 1);
		}
		
		
	}
}
