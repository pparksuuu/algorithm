package codeplus02.JAVA.Collection;
// java.util.HashSet<E>
//
// HashSet
// 해시 테이블을 이용해서 구현되어 있다.
// 삽입/삭제/제거 연산의 시간 복잡도가 O(1)이다.
// 순서가 보장되지 않는다.
//
import java.util.*;

public class Q06_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> d = new HashSet<Integer>();
        for (int i = 10; i >= 1; i--) {
            d.add(i);
        }
        for (int x : d) {
            System.out.print(x + " ");
        }
    }
}
