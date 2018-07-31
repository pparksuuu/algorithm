package lecs.lec01_recursion;

public class Exam08_strCount {
    public static void main(String args[]) {
        System.out.println(length("SoHOT"));
    }
    
    public static int length(String str) {
        if (str.equals(""))
            return 0;
        else
            return 1 + length(str.substring(1));
    }
    // 무한루프에 빠지지 않으려면? (두 가지 요구사항!)
    // 1. 적어도 하나의 Base case가 존재 
    // 2. Recursive case가 base case로 수렴해야 한다.
}
