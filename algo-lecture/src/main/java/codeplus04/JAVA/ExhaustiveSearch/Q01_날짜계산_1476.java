package codeplus04.JAVA.ExhaustiveSearch;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q01_날짜계산_1476 {
	
	static Scanner sc = new Scanner(System.in);
	
	static int[][] dp = new int[1001][1001];
	
	static int N;
	static int M;
	static int K;
	static int S;
	
	static int[] Go = new int[30];
	
	static int answer;
	static int Map[][] = new int[1001][1001];
	
	public static class Pair{
		int x;
		int y;
		
		public Pair() {
			System.out.println("만들어짐");
		}
		
		public Pair(int x, int y) {
			this.x = x;
			this.y = y;
			System.out.println("만들어짐");
		}
		
	}
	
	public static void settingDefault() {
		System.out.println("setting Default");
		for (int i = 0; i < 1001; i++) {
			for (int j = 0; j < 1001; j++) {
				dp[i][j] = -1;
				Map[i][j] = 0;
			}
		}
		
		N = sc.nextInt();
		M = sc.nextInt();
		K = sc.nextInt();
		S = sc.nextInt();
		
		System.out.printf("%d - %d - %d - %d \n", N, M, K, S);
		
		for (int i = 0; i < K; i++) {
			Go[i] = sc.nextInt();
			System.out.println(Go[i]);
		}
		
		int temp1, temp2;
		
		for (int i = 0; i < M; i++) {
			temp1 = sc.nextInt();
			temp2 = sc.nextInt();
			Map[temp1][temp2] = 1;
			Map[temp2][temp1] = 1;
		}
		
		answer = 2727;
	};
	
	public static void find(int num) {
		System.out.println("find 들어옴");
		Boolean visited[] = new Boolean[1001];
		visited[num] = true;
		
		Queue<Pair> que = new LinkedList<Pair>();
		
		Pair temp = new Pair();
		int dist = 1;
		int now;
		
		for (int i = 1; i <= N; i++) {
			if (Map[num][i] == 1) {
				temp.x = i;
				temp.y = dist;
				que.add(temp);
				visited[i] = true;
			}
		}
		
		while (!que.isEmpty()) {
			now = que.peek().x;
			dist = que.peek().y;
			System.out.printf("now는 %d, dist는 %d", now, dist);
			dp[num][now] = dist;
		
		
			que.remove();
			
			for (int i = 1; i <= N; i++) {
				if (Map[num][i] == 1 && !visited[i]) {
					temp.x = i;
					temp.y = dist + 1;
					que.add(temp);
					visited[i] = true;
				}
			}
		}
		
	}
	
	public static void swap(int i, int j) {
		int temp;
		if (i == j) return;
		temp = Go[i];
		Go[i] = Go[j];
		Go[j] = temp;
	}

	public static void Permutation(int num) {
		System.out.println("permutation들어옴");
		if (num == 1) {
			int temp = 0;
			int now = S;
			int next = Go[0];
			
			temp += dp[now][next];
			
			for (int i = 0; i < K - 1; i++) {
				now = Go[i];
				next = Go[i + 1];
				temp += dp[now][next];
			}
			
			now = next;
			next = S;
			temp += dp[now][next];
			
			if (temp < answer) 
				answer = temp;
			return;
		}
		
		for (int i = 0; i < num; i++) {
			swap(i, num - 1);
			Permutation(num - 1);
			swap(i, num - 1);
		}
	}
	
	public static void solveProblem() {
		System.out.println("solve Problem");
		find(S);
		for (int i = 0; i < K; i++) 
			find(Go[i]);
		
		Permutation(K);
	};
	
	public static void main(String[] args) {
		int t = sc.nextInt();
		
		for (int tc = 1; tc <= t; tc++) {
			settingDefault();
			solveProblem();
			System.out.println("Hahaha");
			System.out.printf("#%d %d\n", tc, answer);
		}
	}
}
