// 순차 탐색(Sequantial Search)
package lecs.lec01_recursion;

public class PracticalExam01_Maze { 
    public static void main(String args[]) {
        printMaze();
        System.out.println();
        findMazePath(0,0);
        System.out.println();
        printMaze();
    }
   
    public static void printMaze() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(maze[i][j]);
            }
            System.out.println();
        }
    }
    
    private static int N = 8;
    private static int [][] maze = {
            {0, 0, 0, 0, 0, 0, 0, 1},
            {0, 1, 1, 0, 1, 1, 0, 1},
            {0, 0, 0, 1, 0, 0, 0, 1},
            {0, 1, 0, 0, 1, 1, 0, 0},
            {0, 1, 1, 1, 0, 0, 1, 1},
            {0, 1, 0, 0, 0, 1, 0, 1},
            {0, 0, 0, 1, 0, 0, 0, 1},
            {0, 1, 1, 1, 0, 1, 0, 0}
    };
    
    // PATH_COLOR : visited이며 아직 출구로 가는 경로가 될 가능성이 있는 cell
    // BLOCKED_COLOR : visited이며 출구까지의 경로상에 있지 않음이 밝혀진 cell
    private static final int PATHWAY_COLOR = 0;     // white
    private static final int WALL_COLOR = 1;        // blue
    private static final int BLOCKED_COLOR = 2;     // red
    private static final int PATH_COLOR = 3;        // green  
    
    public static boolean findMazePath(int x, int y) {
        if (x < 0 || y < 0 || x >= N || y >=N)
            return false;
        else if (maze[x][y] != PATHWAY_COLOR) // 내가 지금 있는 곳이 PATHWAY가 아니다.(visited or wall)
            return false;
        else if (x == N - 1 && y == N - 1) { // 여기가 바로 출구이다.
            maze[x][y] = PATH_COLOR;
            return true;
        } else {
            maze[x][y] = PATH_COLOR; // PATH_COLOR :  이 위치를 방문했으며, 이 위치가 꽝인지 아닌지는 모른다.
            if (findMazePath(x - 1, y) || findMazePath(x, y + 1)
                    || findMazePath(x + 1, y) || findMazePath(x, y -1)) { //인접한 네 개의 cell을 방문
                return true; // 더 이상 체크하지 않고 끝낸다.
            }
            maze[x][y] = BLOCKED_COLOR; //dead end
            return false; // 이 자리는 꽝이다.
        }
    }
    
}


//미로찾기는 여러 해법이 있지만 recursion이 가장 간단.
//
//Recursion 문제를 풀 때 중요한 것
//=> 이 코드가 무한 루프에 빠지지 않는가? (Recursion은 무한 루프에 빠지기 딱 좋은 구조 - 재귀이기 때문)
//=> Recursion의 두 가지 조건을 보장해야만 한다.
//
//
//Recursive Thinking (내가 풀어야하는 문제 안에 또 내가 풀어야하는 문제가 있다.)
//
//현재 위치에서 (이미 가본 곳을 다시 지나지 않고) 출구까지 가는 경로가 있으려면
//1. 현재 위치가 출구이거나
//2. 이웃한 셀들 중 하나에서 (이미 가본 곳을 다시 지나지 않고) 출구까지 가는 경로가 있거나
//
//Decision Problem(답이 yes or no인 문제)
//