package practice.lec01_recursion;

public class Exam04 {
    public static void main(String args[]) {
        System.out.println(func(4));
    }
    
    public static int func(int n) {
        if (n == 0) 
            return 1;
        else {
            System.out.println("Hello.... : " + n);
            return n * func(n - 1);
        }
    }
    
}

