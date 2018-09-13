package codeplus02.JAVA.Collection;
// Queue
// 한쪽 끝에서만 자료를 넣고 다른 한쪽 끝에서만 뺄 수 있는 자료구조
// 먼저 넣은 것이 가장 먼저 나오기 때문에 First In First Out(FIFO)라고도 한다.
//
// push : 큐에 자료를 넣는 연산
//      boolean offer(E e)
// pop :  큐에서 자료를 뺴는 연산
//      E poll()
// front : 큐의 가장 앞에 있는 자료를 보는 연산
//      E peek()
// back : 큐의 가장 뒤에 있는 자료를 보는 연산
//      별로 중요하지 않아서 java에 이 연산은 존재하지 않는다.
// empty : 큐가 비어있는지 아닌지를 알아보는 연산
//      boolean isEmpty()
// size : 큐에 저장되어있는 자료의 개수를 알아보는 연산
//      int size()
//
//  C++ STL 과의 차이점 : Java는 리턴값이 있고 C++은 void
//
// 인터페이스다
// 구현한 클래스로는
// ArrayDeque
// LinkedList
// ============> 위의 두 가지는 FIFO
//
// PriorityQueue
// ============> 우선순위가 가장 높은 것이 나오는 Queue
//
public class Q14_Queue {

}
