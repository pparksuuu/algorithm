package SelfStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

public class Cards2 {

	static Scanner sc = new Scanner(System.in);
	static int num; // 카드 갯수  
	static BufferedReader bf;
	static String[] line;
	static LinkedList<String> left;
	static LinkedList<String> right;
	static LinkedList<String> word;
	static int i, l, r;

	public static void setting() throws IOException {
		num = sc.nextInt();
		bf = new BufferedReader(new InputStreamReader(System.in));
		line = bf.readLine().split(" ");
		for (int i = 0; i < line.length; i++) {
			System.out.println(line[i]);
		}
		//		word.add(line[0]);
		//		System.out.println(word);
		i = 0;
		l = 1;
		r = 1;
		word = new LinkedList<String>();
		word.add(line[0]);
		recursiveWord(line.length, line, left, right);
	}

	public static void recursiveWord(int num, String[] line, LinkedList<String> left, LinkedList<String> right) {
		
		// 둘 다 길이 check, 
		if (word.size() == num) {
			System.out.println("끝");
			System.out.println(left);
			System.out.println(right);
		}		
		
		// left
		if (l == 1) {
			left = (LinkedList<String>) word.clone();
			left.addFirst(line[i + 1]);
			System.out.println(left);
			
			right = (LinkedList<String>) word.clone();
			right.addLast(line[i + 1]);
			System.out.println(right);
			
			i++;
			recursiveWord(num, line, left, right);
		}
		

	}

	public static void solve() {

	}

	public static void main(String[] args) throws IOException {
		int t = sc.nextInt();
		for (int tc = 1; tc <= t; tc++) {
			setting();
			solve();
			//			System.out.println("#%d %d\n", tc, answer);
		}
	}
}
