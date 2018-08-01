package practice.lec01_recursion;

public class Exam12 {
    public static void main(String args[]) {
        int[] data = {1,2,3,4,5,6,7,8,9};
        System.out.println(sumOfArray(3, data));
    }
    
    public static int sumOfArray(int n, int[] data) {
        if (n == 0) {
            return 0;
        } else {
            return sumOfArray(n - 1, data) + data[n - 1];
        }
    }
    
}

