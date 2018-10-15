package codeplus02.JAVA.Collection;
// Stack
// 한 쪽 끝에서만 자료를 넣고 뺄 수 있는 자료구조
// 마지막으로 넣은 것이 가장 먼저 나오기 때문에
// LIFO :  List In First Out
// push : 스택에 자료를 넣는 연산
//      E push(E item)
// pop : 스택에서 자료를 빼는 연산
//      E pop()
// top : 스택의 가장 위에 있는 자료를 보는 연산
//      E peek()
// empty : 스택이 비어있는지 아닌지를 알아보는 연산
//      bool empty()
// size : 스택에 저장되어있는 자료의 개수를 알아보는 연산
//      int size()
//
// 자바에서의 pop은 리턴 값이 있지만 C++ STL에선 void라 리턴 값이 없다
import java.util.*;

public class Q04_Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // 정수 뒤에 \n이 있어서 필요합니다
        Stack<Integer> stack = new Stack<Integer>();
        for (int k=0; k<n; k++) {
            String line = sc.nextLine();
            String[] s = line.split(" ");
            String cmd = s[0];
            if (cmd.equals("push")) {
                int num = Integer.parseInt(s[1]);
                stack.push(num);
            } else if (cmd.equals("top")) {
                if (stack.empty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(stack.peek());
                }
            } else if (cmd.equals("size")) {
                System.out.println(stack.size());
            } else if (cmd.equals("empty")) {
                if (stack.empty()) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } else if (cmd.equals("pop")) {
                if (stack.empty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(stack.pop());
                }
            }
        }
    }
}
