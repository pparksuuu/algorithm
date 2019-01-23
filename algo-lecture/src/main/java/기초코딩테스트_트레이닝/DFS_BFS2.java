package 기초코딩테스트_트레이닝;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFS_BFS2 {
	static int N;
	static int M;
	static int startPoint;
	static int graph[][];
	static boolean visited[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		startPoint = sc.nextInt();

		graph = new int[1001][1001];
		visited = new boolean[10001];

		int a, b;
		for (int i = 1; i <= M; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			graph[a][b] = graph[b][a] = 1;
		}

		dfs(startPoint);

		for (int j = 1; j <= N; j++) {
			visited[j] = false;
		}
		System.out.println();
		bfs(startPoint);
	}

	public static void dfs(int i) {
		visited[i] = true;
		System.out.print(i + " ");

		for (int j = 1; j <= N; j++) {
			if (graph[i][j] == 1 && visited[j] == false) {
				dfs(j);
			}
		}
	}

	public static void bfs(int i) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(i);
		System.out.print(i + " ");
		visited[i] = true;
		int temp;

		while (!q.isEmpty()) {
			temp = q.poll();
			for (int j = 0; j < N + 1; j++) {
				if (graph[temp][j] == 1 && visited[j] == false) {
					q.offer(j);
					visited[j] = true;
					System.out.print(j + " ");
				}
			}
		}
	}
}

