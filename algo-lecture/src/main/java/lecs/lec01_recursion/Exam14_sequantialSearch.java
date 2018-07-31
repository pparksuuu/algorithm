// 순차 탐색(Sequantial Search)
package lecs.lec01_recursion;

import java.util.Scanner;

public class Exam14_sequantialSearch { 
    public static void main(String args[]) {
        int[] data = {1,5,205,602,4,6506,27,10};
        
        System.out.println(searchImplicit(data, data.length , 27));
        System.out.println(searchExplicit(data, 0, data.length - 1, 27));
        System.out.println(searchExplicitReverse(data, 0, data.length - 1, 27));
        System.out.println(searchMiddle(data, 0, data.length -1 , 27));
        
    }
    
    // 데이터가 정렬되지 않았다면? -> 순차 탐색

    // 이 함수의 미션은 data[0]에서 data[n-1] 사이에서 target을 검색하는 것이다.
    // 하지만 검색 구간의 시작 인덱스 0은 보통 생략한다. 즉 암시적 매개변수이다.
    public static int searchImplicit(int[] data, int n, int target) {
        for (int i = 0; i < n; i++)
            if (data[i] == target)
                return i;
        return -1;
    }
    
    // 암시적 매개변수?
    // [0, n-1]을 훑게 되는데, 
    // n-1은 두 번째 파라미터로 보내기 때문에 명시적이지만, 0은 암시적이다.
    // 하지만 Recursion으로 구현한다면 매개변수를 명시화 해야 한다.
    // Why?
    // 위 코드대로 한다면, recursion이 일어날 때 시작 인덱스가 바뀌게 된다. 
    // 이를 좀 더 일반화시킨 형태를 갖게 하기 위해 매개변수 명시화가 필요하다.
    
    // 매개변수의 명시화
    // 이 함수의 미션은 data[begin]에서 data[end] 사이에서 target을 검색한다.
    // 즉, 검색구간의 시작점을 명시적(explicit)으로 지정한다.
    // 순차 탐색 : 앞에서부터 찾기
    public static int searchExplicit(int[] data, int begin, int end, int target) { // begin과 end 사이에 target이라는 데이터가 있는가?
        if (begin > end) // base case, begin = end라면 데이터가 한 개
            return -1;
        else if (target == data[begin]) // 첫 번째 값이 내가 찾는 값이라면 인덱스를 리턴하고 끝낸다.
            return begin;
        else
            return searchExplicit(data, begin + 1, end, target);
    }
    // 이 함수의 경우 end를 생략하고 data.length라 해도 된다.
    // 하지만 수가 변하는 매개 변수는 명시적으로 표현 해주시오!
    
    // 순차 탐색 : 다른 버전 - 뒤에서부터 찾기
    public static int searchExplicitReverse(int[] data, int begin, int end, int target) { // begin과 end 사이에 target이라는 데이터가 있는가?
        if (begin > end) // base case, begin = end라면 데이터가 한 개
            return -1;
        else if (target == data[begin]) // 첫 번째 값이 내가 찾는 값이라면 인덱스를 리턴하고 끝낸다.
            return begin;
        else
            return searchExplicitReverse(data, begin, end - 1, target);
    }

    // 순차 탐색 : 다른 버전 - 반 쪼개가며 찾기. binary search와는 다름.
    public static int searchMiddle(int[] data, int begin, int end, int target) {
        if (begin > end) {
            return -1;
        } else {
            int middle = (begin + end) / 2;
            if (data[middle]==target)
                return middle;
            int index = searchMiddle(data, begin, middle - 1, target);
            if (index != -1)
                return index;
            else
                return searchMiddle(data, middle + 1, end, target);
        }
    }
}
