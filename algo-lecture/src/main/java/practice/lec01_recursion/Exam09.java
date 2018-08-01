package practice.lec01_recursion;

public class Exam09 {
    public static void main(String args[]) {
        printChars("SOSOSOHOT");
    }
    
    public static void printChars(String str) {
        if (str.length() == 0)
            return;
        else
            System.out.print(str.charAt(0));
            printChars(str.substring(1));
    }
}

