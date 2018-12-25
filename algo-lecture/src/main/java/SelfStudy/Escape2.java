package SelfStudy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Escape2 {
	
	static Scanner sc = new Scanner(System.in);
	
	static int N; // 톨게이를 통과한 차량의 수
	static int M; // 존재할 수 있는 차량의 색상 수
	static int answer; // firstIndex
	static Iterator<Integer> iterator;
	
	public static void main(String[] args) {
		int t = sc.nextInt();
		sc.nextLine();
		
		for (int tc = 1; tc <= t; tc++) {
			answer = -10;
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
			HashMap testMap = new HashMap<Integer, Integer>();
			
			int criminals = 0;// 범죄자가 탄 차량 count
			for (int i = 0; i < M; i++) {
				if (Integer.parseInt(cars[i]) > 0) {
					map.put(i + 1, Integer.parseInt(cars[i]));
					criminals += Integer.parseInt(cars[i]);
				}
			}
			
			// --하면서 테스트할 맵 셋팅. 후에 한 번 더 써야함
			testMap = (HashMap) map.clone();
			
			// 범죄자가 아무도 없을 경우
			if (criminals == 0) {
				continue;
			}
			
			
			int firstIndex = 0; // 일치하는 첫 index.
			for (int i = 0; i < tollGate.length - (criminals - 1); i++) {
				if (map.containsKey(Integer.parseInt(tollGate[i])) 
						 && map.containsKey(Integer.parseInt(tollGate[(i + criminals) / 2]))
						 && map.containsKey(Integer.parseInt(tollGate[i + (criminals - 1)])) ) {
					firstIndex = i;
					
					// 2. 그제서야 비교 - testMap
					for (int j = i; j < i + criminals; j++ ) {
						
						int key = Integer.parseInt(tollGate[j]);
						
						// 맵에 있는 애들 하나씩 감소시키기.
						if (testMap.containsKey(key) && (int) testMap.get(key) != -1) {
							// 하나씩 감소시키기.
							int updateValue = (int)testMap.get(key) - 1;
							testMap.replace(key, updateValue);
							
						} else {
							break;
						}
					}
					boolean checker = true;
					iterator = testMap.keySet().iterator();
					while (iterator.hasNext()) {
						int keyIterator = iterator.next();
						if ((int) testMap.get(keyIterator) != 0) {
							checker = false;
							break;
						}
					}
					
					if (checker) {
						answer = firstIndex;
						break;
					} else {
						testMap = (HashMap) map.clone();
					}
				}
			}
			// 답 출력
			if (answer != -10) {
				System.out.printf("#" + tc + " " + (answer + 1) + "\n");
			} else {
				System.out.printf("#" + tc + " " + 0);
			}
		}
	}
}
