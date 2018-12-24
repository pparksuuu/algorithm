package SelfStudy;

import java.io.IOException;
import java.util.Scanner;

public class Cards5 {

	static Scanner sc = new Scanner(System.in);
	static String[] arrays;
	static String[] temp;
	static String answer;

	public static void main(String[] args) throws IOException {
		int t = sc.nextInt();
		sc.nextLine();

		for (int tc = 1; tc <= t; tc++) {
			String num = sc.nextLine();
			String in = sc.nextLine();
			String[] input = in.split(" ");

			arrays = new String[2];
			temp = new String[2];


			for (int i = 0; i < input.length; i++) { //input 카드만큼 뽑는 for문.

				if (i == 0)  { // 가장 처음 초기화.
					arrays[0] = input[i];
					temp = arrays.clone();
					continue;
				} 


				for (int j = 0; j < 1 ; j++) { //2개씩 분기하고 clone하는 for문
					temp[0] = arrays[0].concat(input[i]); // 오른쪽
					temp[1] = input[i].concat(arrays[0]); // 왼쪽
					
					// temp[0]의 첫번째 문자 / temp[1]의 첫번째 문자 비교.
					for (int k = 0; k < temp.length; k++) {
						boolean changed = false;
						
						for (int m = k + 1; m < temp.length; m++) {
							if ((temp[k].compareTo(temp[m])) < 0) {
								String tempo = temp[m];
								temp[m] = temp[k];
								temp[k] = tempo;
								changed = true;
							}
						}
						if (!changed)
							break;
						
					}
					arrays[0] = temp[0];
					
					
				}
				answer = temp[0];
			}

			System.out.printf("#%d " + answer + "\n", tc);
		}
	}

}
