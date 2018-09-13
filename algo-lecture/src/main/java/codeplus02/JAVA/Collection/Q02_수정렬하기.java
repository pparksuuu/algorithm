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
// java.util.ArrayList<E>
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
public class Q02_수정렬하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i=0; i < n; i++) {
            int temp = sc.nextInt();
            a.add(temp);
        }
        Collections.sort(a);
        for (int x : a) {
            System.out.println(x);
        }
        /*
        for (int i=0; i < n; i++) {
            System.out.println(a.get(i));
        }
        */
    }
}
