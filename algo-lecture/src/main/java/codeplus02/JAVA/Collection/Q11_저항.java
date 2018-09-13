package codeplus02.JAVA.Collection;

import java.util.*;
import java.io.*;

public class Q11_저항 {
    public static void main(String args[]) throws IOException {
        HashMap<String, Integer> d = new HashMap<String, Integer>();
        d.put("black",0);
        d.put("brown",1);
        d.put("red",2);
        d.put("orange",3);
        d.put("yellow",4);
        d.put("green",5);
        d.put("blue",6);
        d.put("violet",7);
        d.put("grey",8);
        d.put("white",9);
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        long ans = d.get(a)*10 + d.get(b);
        for (int i=0; i<d.get(c); i++) {
            ans *= 10;
        }
        System.out.println(ans);
    }
}
