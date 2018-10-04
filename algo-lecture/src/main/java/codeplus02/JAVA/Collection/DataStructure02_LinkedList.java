package codeplus02.JAVA.Collection;
// ArrayList 직접 구현하기
// java106.step12.ex1
public class DataStructure02_LinkedList {
    
    // 값을 저장할 바구니 클래스를 만든다.
    // 그 클래스는 LinkedList에서만 사용할 것이기 떄문에
    // 일반적인 클래스인 패키지 멤버 클래스로 정의하지 않고
    // LinkedList 안에 정의한다
    // 이렇게 클래스 안에 정의된 클래스를 "중첩 클래스(nested class)" 또는
    // "내부 클래스(inner class)"라고 부른다.
    protected class Bucket {
        // 이 클래스의 역할은 기차에서 사람이나 물건을 싣는 객차의 역할
        public Object value; // 이 변수에 값을 저장
        public Bucket next; // 이 변수에는 다음 객차 주소를 저장
        public Bucket prev; // 이 변수에는 이전 객체 주소를 저장
    }

    protected Bucket head; // 리스트에서 맨 앞 객차의 주소를 저장하는 인스턴스
    protected Bucket tail; // 리스트에서 맨 뒤 객차의 주소를 저장하는 인스턴스
    
    public DataStructure02_LinkedList() {
        // LinkedLIst를 만들면 일단 맨 앞에 있는 빈 객차를 준비한다.
        head = new Bucket();
        tail = head;
    }
    
    public void add(Object value) {
        // 맨 끝 객차에 짐을 싣는다.
        tail.value = value;
        
        // 새 객차를 만들어 맨 뒤에 붙인다.
        Bucket bucket = new Bucket();
        tail.next = bucket;
        
        // 새 객차에 이전 객차의 주소를 저장한다.
        
    }
}