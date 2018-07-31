package lecs.lec01_recursion;

public class Exam01 {
    public static void main(String args[]) {
       func();
    }
    
    public static void func() {
        System.out.println("Hello...");
        func();
    }
}
