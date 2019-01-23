package SelfStudy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Escape_One_More_Try {

	static Scanner sc = new Scanner(System.in);

	static int N; // 톨게이를 통과한 차량의 수
	static int M; // 존재할 수 있는 차량의 색상 수
	static int answer; // firstIndex
	static Iterator<Integer> iterator;
	
	public void who() {
		System.out.println("끼리끼리");
	}

	public static void main(String[] args) {
		new Escape_One_More_Try().who();
		
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

			// hashMap에 <K,V> 저장하기
			HashMap map = new HashMap<Integer, Integer>();

			int criminals = 0;// 범죄자가 탄 차량 count
			for (int i = 0; i < M; i++) {
				if (Integer.parseInt(cars[i]) > 0) {
					map.put(i + 1, Integer.parseInt(cars[i]));
					criminals += Integer.parseInt(cars[i]);
				}
			}

			/* hashMap 출력해보기 */
			Iterator<Integer> iterator = map.keySet().iterator();
			while (iterator.hasNext()) {
				int key = iterator.next();
				System.out.println("key 는 : " + key + ", value는 : " + map.get(key));
			}


		}
		
	}
	

}
