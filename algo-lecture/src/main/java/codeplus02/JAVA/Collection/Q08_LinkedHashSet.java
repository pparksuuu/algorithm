package codeplus02.JAVA.Collection;
// LinkedHashSet
// java.util.LinkedHashSet<E>
//
// 해시테이블과 연결 리스트를 이용해서 구현되어 있다.
// 삽입/삭제/제거 연산의 시간 복잡도가 O(1)이다.
// 추가한 순서가 보장된다.
//
import java.util.*;

public class Q08_LinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> d = new LinkedHashSet<Integer>();
        for (int i = 10; i >= 1; i--) {
            d.add(i);
        }
        for (int x : d) {
            System.out.print(x + " ");
        }
    }
}
