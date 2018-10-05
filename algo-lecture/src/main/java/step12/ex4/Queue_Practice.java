package step12.ex4;

import step12.ex2.LinkedList_Practice;

// 큐 사용의 예 : 
// => 인터넷 예약 처리할 때
// => single-thread 기반 node 서버의 요청처리
// => 마우스 또는 키보드 이벤트 처리(이벤트가 발생된 순서대로 처리)
public class Queue_Practice extends LinkedList_Practice {
    // 맨 뒤에 값을 붙인다.
    public void offer(Object value) {
        this.add(value);
    }
    
    public Object poll() {
        return this.remove(0);
    }
}
