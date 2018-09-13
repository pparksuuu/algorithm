package codeplus02.JAVA.Collection;
// TreeSet
// java.util.TreeSet<E>
//
// 이진 검색 트리 (레드 블랙 트리) 이용해서 구현되어 있따.
// 삽입/삭제/제거 연산의 시간 복잡도가 O(logN)이다.
// 순서가 보장된다. (오름차순 - 내림차순 같은 순서)
//
//
import java.util.*;

public class Q07_TreeSet {
    public static void main(String[] args ) {
        TreeSet<Integer> d = new TreeSet<Integer>();
        for (int i = 10; i >= 1; i--) {
            d.add(i);
        }
        for (int x : d) {
            System.out.print(x + " ");
        }
    }
}
