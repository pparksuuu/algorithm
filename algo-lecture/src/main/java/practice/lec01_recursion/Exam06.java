package practice.lec01_recursion;

public class Exam06 {
    public static void main(String args[]) {
        System.out.println(func(4));
    }
    
    public static int func(int n) {
        if (n < 2)
            return n;
        else {
            return func(n - 2) + func(n - 1);
        } 
    }
    
}

