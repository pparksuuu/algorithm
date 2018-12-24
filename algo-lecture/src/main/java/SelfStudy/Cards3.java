package SelfStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Cards3 {

	static Scanner sc = new Scanner(System.in);
//	static int num; // 카드 갯수  
//	static BufferedReader bf;
//	static String[] input;
	static String[] arrays;
	static String[] temp;
	static String answer;
	/*
1
2
E O	 
	 */

	public static void main(String[] args) throws IOException {
		int t = sc.nextInt();
		for (int tc = 1; tc <= t; tc++) {
			Cards3 card = new Cards3();
			card.setting();
			card.solve();
			System.out.printf("#%d " + answer + "\n", tc);
		}
	}
	

	public void setting() throws IOException {
		System.out.println("이게뭐니");
		int num = sc.nextInt();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] input = bf.readLine().split(" ");

		
		arrays = new String[(int) Math.pow(2, input.length - 1)];
		temp = new String[(int) Math.pow(2, input.length - 1)];

		
		for (int i = 0; i < input.length; i++) { //input 카드만큼 뽑는 for문.
			
			if (i == 0)  { // 가장 처음 초기화.
				arrays[0] = input[i];
				temp = arrays.clone();
				continue;
			} 
			
			for (int j = 0; j < Math.pow(2, i - 1) /*i가 아니라 arrays 내부의 index만큼....*/; j++) { //2개씩 분기하고 clone하는 for문
				
				temp[j * 2] = arrays[j].concat(input[i]); // 오른쪽
				temp[(j * 2) + 1] = input[i].concat(arrays[j]); // 왼쪽
				
			}
			arrays = temp.clone();
			
		}
	}


	public void solve() { // 사전순으로 가장 느린 단어 출력
		for (int i = 0; i < arrays.length; i++) {
			boolean changed = false;
			
			for (int j = i + 1; j < arrays.length; j++) {
				if ((arrays[i].compareTo(arrays[j])) < 0) {
					String temp = arrays[j];
					arrays[j] = arrays[i];
					arrays[i] = temp;
					changed = true;
				}
			}
			
			
			
			if (!changed)
				break;
		}
		answer = arrays[0];
	}

}
