package lecs.lec01_recursion;

public class Exam10_printCharsReverse {
    public static void main(String args[]) {
        printChars("SoHOT");
    }
    
    public static void printChars(String str) {
        if (str.length() == 0) // ""
            return;
        else {
            System.out.print(str.charAt(0));
            printChars(str.substring(1));
        }
    }
    // 무한루프에 빠지지 않으려면? (두 가지 요구사항!)
    // 1. 적어도 하나의 Base case가 존재 
    // 2. Recursive case가 base case로 수렴해야 한다.
}
