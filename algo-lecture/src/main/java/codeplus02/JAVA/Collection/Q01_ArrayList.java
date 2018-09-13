package codeplus02.JAVA.Collection;
// Collection
//
// C, C++ 에선 STL (자주 사용하는 자료구조의 모음)
// vector, deque, list, set, map, Stack, Queue
//
// JAVA 에선 Collection
//
// ArrayList는 배열
//   배열과의 차이점 : 길이가 변하는 배열
//   C++ STL : vector에 해당
//
// java.util.ArrayList<E> : O(N) 시간 걸림
//
// ArrayList 사용시 많이 사용하는 메소드
//    boolean add(E e)
// : ArrayList 뒤에 e를 추가
//    void add(int index, E element)
// : index 번째 추가
//    void clear()
// : 비워버림
//    boolean Contains(Object o)
// : o가 들어있는지 아닌지 판단
//    E get(int index)
// : index번째 데려오기 (arr[index] => arr.get(index))
//    boolean isEmpty()
// : ArrayList가 비어있는지 아닌지
//    E remove(int index)
// : index번째를 지워버림
//    E set(int index, E element)
// : index번째를 새로운 element로 바꾼다 (arr[index] = element)
//    Object[] toArray()
// : Array로 바꾸는 method
import java.util.*;
public class Q01_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        // int[] arr = (int[]) a.toArray();
        ArrayList<Integer> b = new ArrayList<Integer>(40);
    }
}
