package codeplus01.JAVA;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Solution {

    public static void main(String[] args) {
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        solution(5, stages);
    }

    public static int[] solution(int N, int[] stages) {
        // stage[0], stage[1], stage[2], stage[3], stage[4]
        int[] stage = new int[N + 1];
        for (int i = 0; i < stages.length; i++) {
            stage[stages[i] - 1]++; // stage[2] = 3
        }
        
        //이제 stage에는 갯수만큼 들어갔다. 
//        System.out.println(stage[0]);
        
        
        // 실패율 계산
        double[] failure = new double[N];        
        int remainPlayers = 0;
        double n = stages.length;
        System.out.println(stage[0] / n);
        
        for (int i = 0; i < failure.length; i++) {
            failure[i] = stage[i] / (n - remainPlayers);
            remainPlayers += stage[i];
        }
        
        System.out.println(failure[3]); // 정렬 아직 안됨
        
        // key, value
        Map<Integer, Double> stageMap = new HashMap<Integer, Double>();
        for (int i = 0; i < N; i++) {
            stageMap.put(i + 1, failure[i]);
        }
        System.out.println(stageMap);
        System.out.println(stageMap.get(1));
        
        int[] answer = new int[N];
        
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j< N ; j++) {
                if (stageMap.get(i + 1) > stageMap.get(j + 1)) {
                    double temp = stageMap.get(i + 1);
                    
                    
                }
            }
        }
        // 내림차순으로 정렬하기
        /*
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (stageMap.get(j))
            }
        }
        */
        
        
//        int[] answer = {};
        return answer;
    }
    
}