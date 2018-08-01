package practice.lec01_recursion;

public class Exam07 {
    public static void main(String args[]) {
        
        System.out.println(gcdSimple(12, 18));
        System.out.println(gcdSimple(18, 12));
    }
    
    public static double gcd(int m, int n) {
        if (m < n) {
            int tmp = m;
            m = n;
            n = tmp;
        }
        
        if (m % n == 0) {
            return n;
        } else {
            return gcd(n, m % n);
        }
    }
    
    public static int gcdSimple(int p, int q) {
        if (q == 0)
            return p;
        else
            return gcdSimple(q, p % q);
    }
}

