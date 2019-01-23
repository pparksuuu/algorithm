package SelfStudy;

import java.util.Scanner;

public class Test {
	static Scanner sc = new Scanner(System.in);
	static String[] arrays;
	static String[] temp;
	static String answer;

	public static void main(String args[]) {
		int t = sc.nextInt();
		sc.nextLine();

		for (int tc = 1; tc <= t; tc++) {
			String num = sc.nextLine();
			String in = sc.nextLine();
			String[] input = in.split(" ");

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


			System.out.printf("#%d " + answer + "\n", tc);

		}
	}
}
