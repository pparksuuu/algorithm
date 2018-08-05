package lecs.lec01_recursion;

// 멱집합
// => 어떤 집합의 모든 부분 집합의 집합
public class PracticalExam03_Powerset {
    public static void main(String args[]) {
        powerSet(0);
    }

    private static char data[] = {'a', 'b', 'c', 'd', 'e'};
    private static int n = data.length;
    private static boolean[] include = new boolean [n];
    
    public static void powerSet(int k) {
        if (k == n) {
            for (int i = 0; i < n; i++)
                if (include[i]) System.out.print(data[i] + " ");
            System.out.println();
            return;
        }
        include[k] = false;
        powerSet(k + 1);
        include[k] = true;
        powerSet(k + 1);
    }
}
