package practice.lec01_recursion;

public class Exam08 {
    public static void main(String args[]) {
        System.out.println(length("HOTHOTSOHOT"));
    }
    
    public static int length(String str) {
        if (str.equals(""))
            return 0;
        else
            return 1 + length(str.substring(1));
    }
}

