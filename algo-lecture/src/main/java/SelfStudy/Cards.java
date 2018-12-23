package SelfStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

public class Cards {
	
	static Scanner sc = new Scanner(System.in);
	static int num; // 카드 갯수  
	static BufferedReader bf;
	static String[] line;
	static LinkedList<String> word;
	
	public static void setting() throws IOException {
		num = sc.nextInt();
		bf = new BufferedReader(new InputStreamReader(System.in));
		line = bf.readLine().split(" ");
		for (int i = 0; i < line.length; i++) {
			System.out.println(line[i]);
		}
		recursiveWord(line.length, line);
	}
	
	public static void recursiveWord(int num, String[] line) {
		word.add(line[0]);
		// left
//		word.addFirst(line[1]);
		 System.out.println(word);
		// right
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
