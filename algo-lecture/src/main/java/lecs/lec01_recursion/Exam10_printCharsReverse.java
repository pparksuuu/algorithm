package lecs.lec01_recursion;

public class Exam09_printChars {
    public static void main(String args[]) {
        printCharsReverse("SoHOT");
    }
    
    public static void printCharsReverse(String str) {
        if (str.length() == 0) // ""
            return;
        else {
            printCharsReverse(str.substring(1));
            System.out.print(str.charAt(0));
        }
    }
    // 무한루프에 빠지지 않으려면? (두 가지 요구사항!)
    // 1. 적어도 하나의 Base case가 존재 
    // 2. Recursive case가 base case로 수렴해야 한다.
}
