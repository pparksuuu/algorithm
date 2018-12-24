package SelfStudy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Escape_Partial {
	
	static Scanner sc = new Scanner(System.in);
	
	static int N; // 톨게이를 통과한 차량의 수
	static int M; // 존재할 수 있는 차량의 색상 수
//	static HashMap map;
	
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
			
			// hashMap에 <K,V> 저장하기
			HashMap map = new HashMap<Integer, Integer>();
			
			int criminals = 0;// 범죄자가 탄 차량 count
			for (int i = 0; i < M; i++) {
				if (Integer.parseInt(cars[i]) > 0) {
					map.put(i + 1, Integer.parseInt(cars[i]));
					criminals += Integer.parseInt(cars[i]);
				}
			}
			
			// 범죄자가 아무도 없을 경우
			if (criminals == 0) {
				System.out.println("범죄자가  0명");
				continue;
			}
			
			/* hashMap 출력해보기 */
			Iterator<Integer> iterator = map.keySet().iterator();
			while (iterator.hasNext()) {
				int key = iterator.next();
				System.out.println("key 는 : " + key + ", value는 : " + map.get(key));
			}
			
			// 1. tollGate를 탐색. 
			// - map에 있는 아이와 비교. 존재하면? criminals 만큼 더해서 끝도 비교.
			// - 존재하면? 중앙값 비교.
			//
			int firstIndex = 0; // 일치하는 첫 index.
			for (int i = 0; i < tollGate.length - (criminals - 1); i++) {
				if (map.containsKey(Integer.parseInt(tollGate[i])) 
						 && map.containsKey(Integer.parseInt(tollGate[(i + criminals) / 2]))
						 && map.containsKey(Integer.parseInt(tollGate[i + (criminals - 1)])) ) {
					System.out.println(i);
					firstIndex = i;
					System.out.println("들어왔니");
				}
			}
			
			// 2. 그제서야 전체 다 비교해보기.
			// - criminal 수가 0이 될때까지 먼저 비교할까? 그러고 0이 되면 또 비교.
			// - 아니면 아싸리 여기서 비교, map의 value값을 전부 --했을 때,
			//   나중에 다 꺼냈을 때 0이면 처음 인덱스 돌려주기(기억해야됨)
			//   0이 아니면 continue.
			//
			// 3. 답 출력할 때 firstIndex + 1 해줘야 함.
			
			
		}
	}
}
