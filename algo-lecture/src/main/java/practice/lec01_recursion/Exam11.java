package practice.lec01_recursion;

public class Exam11 {
    public static void main(String args[]) {
        printInBinary(9);
    }
    
    public static void printInBinary(int n) {
        if (n < 2)
            System.out.print(n);
        else {
            printInBinary(n / 2);
            System.out.print(n % 2);
        }
    }
}

