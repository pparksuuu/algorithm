package lecs.lec01_recursion;

// N-Queens Problem
// => N개의 말을 N x N의 판에 놓는데, 어떠한 말도  * 상에 놓이지 않도록 해야한다.
//
// Backtracking
// => 내가 내린 결정들이 막다른 길에 놓이면,
//    가장 최근에 내린 결정을 번복하고 다른 결정을 !
// => 상태 공간 트리(해를 포함하는 트리) 를 깊이 우선 방식으로 탐색하여 해를 찾는 알고리즘
// => Backtracking은 1) Recursion 2) Stack으로 구현할 수 있다.
//
// Backtracking Algorithm의 기본 구조.
// 1) infeasible인가? (내려갈 필요 x)
// 2) 답인가?
// 3) 꽝도 아니고 답도 아니면? => 자식 노드를 방문해야 한다.
public class PracticalExam02_NQueens {
    public static void main(String args[]) {
    }

}
