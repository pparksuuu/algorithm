package 기초코딩테스트_트레이닝;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//입력
/*
첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000), 간선의 개수 M(1 ≤ M ≤ 10,000), 
탐색을 시작할 정점의 번호 V가 주어진다. 
다음 M개의 줄에는 간선이 연결하는 두 정점의 번호가 주어진다. 
어떤 두 정점 사이에 여러 개의 간선이 있을 수 있다. 
입력으로 주어지는 간선은 양방향이다.

예제입력 
4 5 1
1 2
1 3
1 4
2 4
3 4
*/
/*
첫째 줄에 DFS를 수행한 결과를, 
그 다음 줄에는 BFS를 수행한 결과를 출력한다. 
V부터 방문된 점을 순서대로 출력하면 된다.
예제출력
1 2 4 3
1 2 3 4
*/
public class DFS_BFS {
	static int[][] graph;
	static boolean visited[];
	static int N; // 정점의 개수 (1 <= N <= 1000)
	static int M; // 간선의 개수 (1 <= M <= 10_000)
	static int startPoint;

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

		for (int j = 1; j <= N; j++) { // 노드가 1번부터 시작
			// 연결되어있고 && 방문하지 않았다면
			if (graph[i][j] == 1 && visited[j] == false) {
				dfs(j);
			}
		}
	}

	public static void bfs(int i) {

		/*
		public void offer(Element data);//순차보관
		public Element poll();//가장 먼저 보관한 값 꺼내고 반환
		public Element peek();//가장 먼저 보관한 값 단순 참조, 꺼내지 않음
		public boolean empty(); //비어있는지 판별
		 */
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(i);
		visited[i] = true;
		System.out.print(i + " ");

		int temp;
		while (!q.isEmpty()) {
			temp = q.poll();
			for (int j = 0; j < N + 1; j++) {
				if (graph[temp][j]==1 && visited[j] == false) {
					q.offer(j);
					visited[j] = true;
					System.out.print(j + " ");
				}
			}
		}
	}
}

