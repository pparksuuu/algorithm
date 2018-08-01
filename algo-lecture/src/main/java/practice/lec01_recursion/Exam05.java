package practice.lec01_recursion;

public class Exam05 {
    public static void main(String args[]) {
        System.out.println(func(3, 4));
    }
    
    public static double func(double x, int n) {
        if (n == 0) 
            return 1;
        else {
            System.out.println("Hello.... : " + n);
            return x * func(x, n - 1);
        }
    }
    
}

