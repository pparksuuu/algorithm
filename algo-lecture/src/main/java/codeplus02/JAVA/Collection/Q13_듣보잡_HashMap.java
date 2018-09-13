package codeplus02.JAVA.Collection;
// 듣도 못한 사람들에게 1을 더해주고
// 보도 못한 사람들에게 2를 더해준다.
// => 듣도 보도 못한 사람들은 3이다.
import java.util.*;
import java.io.*;
public class Q13_듣보잡_HashMap {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);
        HashMap<String, Integer> d = new HashMap<String, Integer>();
        for (int i=0; i<n; i++) {
            String name = br.readLine();
            d.put(name, 1);
        }
        for (int i=0; i<m; i++) {
            String name = br.readLine();
            Integer v = d.get(name);
            if (v == null) {
                v = 0;
            }
            v += 2;
            d.put(name, v);
        }
        ArrayList<String> a = new ArrayList<String>();
        for (Map.Entry<String, Integer> entry : d.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (value == 3) {
                a.add(key);
            }
        }
        System.out.println(a.size());
        // 출력 전에 정렬
        Collections.sort(a);
        for (String name : a) {
            System.out.println(name);
        }
    }
}
