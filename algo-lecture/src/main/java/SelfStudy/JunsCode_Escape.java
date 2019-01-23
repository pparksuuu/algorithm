package SelfStudy;

import java.util.ArrayList;
import java.util.Scanner;

public class JunsCode_Escape {
   int count = 0;
 
    public static void main(String[] args) {
		long start = System.currentTimeMillis();
    	
       Scanner sc = new Scanner(System.in);
       
       System.out.println("입력");
       int cnt = Integer.parseInt(sc.nextLine().split("#")[1]);
       for (int i = 0; i < cnt; i++) {
          
          String[] x = sc.nextLine().split(" ");
          String[] y = sc.nextLine().split(" ");
          String[] z = sc.nextLine().split(" ");
          System.out.println("#"+(i+1) + " " + new JunsCode_Escape().find(x,y,z));
       }
       
		long end = System.currentTimeMillis();
		System.out.println("실행 시간 : " + (end - start)/1000.0);
       
    }
    public int find(String[] x, String[] y, String[] z) {
       count += 1;
       
       int M = Integer.parseInt(x[1]);
       ArrayList<String> car = new ArrayList();
       for (int i = 0; i < M; i++) {
          for (int j = 1; j < M+1; j++) {
             if(Integer.parseInt(y[i]) == j) {
                for (int k = 0; k < j; k++) {

                   car.add(Integer.toString(i+1));
                   
                }
                
             }
          }
             
       }
       
       int cnt = 0;
       int temp = 0;
       int result = 0;
       int index = 0;
       
       for (int i = 0; i < z.length; i++) {
          for(int j = 0; j < car.size(); j++) {
             
             if(z[i].equals(car.get(j))) {
                
                
                if(i == 0) {
                   index = i;
                   temp = i;
                } else {
                   if(i > temp) {
                      if((index-temp) == 1) {
                         index = i;
                         cnt += 1;
                         temp++;
                      } else {
                         if(cnt == car.size()) {
                            result = ((i+1) - cnt);
                         } else {
                            temp = i;
                            cnt += 1;
                         }
                      }
                   }
                }
             } else if(i > temp) {
                temp = 0;
             }
          }
       }
       return result;
    }
}
 