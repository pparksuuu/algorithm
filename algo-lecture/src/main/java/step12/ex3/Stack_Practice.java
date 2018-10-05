package step12.ex3;

import step12.ex2.LinkedList_Practice;

// 스택 사용의 예:
// - 웹 브라우저의 history 다룰 때
// - 웹 사이트에서 breadcrumb navigation을 구현할 때
// - 웹페이지 UI 이벤트를 처리할 때
public class Stack_Practice extends LinkedList_Practice{
    public void push(Object value) {
        this.add(value); // LinkedList의 맨 끝에 추가하는 것임
    }
    
    public Object pop() { // Stack이니까 맨 끝의 값을 return 해야겠지?
        if (this.head == this.tail) // 비어있을 경우
            return null;
        
        Bucket removedBucket = this.tail.prev;
        if (this.tail.prev.prev != null) { // 리스트의 중간 버킷 제거할 떄
            this.tail.prev.prev.next = tail;
            this.tail.prev = this.tail.prev.prev; 
        } else { // 리스트의 맨 처음 버킷을 제거할 때
            head = tail;
            head.prev = null;
        }
        
        return removedBucket.value;
    }
}
