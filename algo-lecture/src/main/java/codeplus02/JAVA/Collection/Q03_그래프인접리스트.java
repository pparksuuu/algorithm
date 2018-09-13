package codeplus02.JAVA.Collection;
// ArrayList는 그래프 문제의 인접 리스트를 만들 떄, 가장 많이 사용한다.
import java.util.*;
public class Q03_그래프인접리스트 {
    public static void main(String[] args) {
        ArrayList<Integer>[] a = (ArrayList<Integer>[]) new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            a[u].add(v);
            a[v].add(u);
        }
    }
}
