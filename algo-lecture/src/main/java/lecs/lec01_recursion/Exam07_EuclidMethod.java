package lecs.lec01_recursion;

public class Exam07_EuclidMethod {
    public static void main(String args[]) {
        System.out.println(gcd(7, 30));
        System.out.println(gcdSimple(7, 30));
    }
    
    public static double gcd(int m, int n) {
        if (m < n) {
            int tmp = m; m = n; n = tmp; //swap m and n
        }
        if (m % n == 0)
            return n;
        else
            return gcd(n, m % n);
    }

    public static int gcdSimple(int p, int q) {
        if (q == 0)
            return p;
        else
            return gcdSimple(q, p%q);
    }
    
    // 최대공약수 : Euclid Method
    // m >= n인 두 양의 정수 m과 n에 대해서 m이 n의 배수이면 gcd(m,n)=n이고,
    // 그렇지 않으면 gcd(m,n) = gcd(n, m % n)이다.
    
    
    // 무한루프에 빠지지 않으려면? (두 가지 요구사항!)
    // 1. 적어도 하나의 Base case가 존재 
    // 2. Recursive case가 base case로 수렴해야 한다.
}
