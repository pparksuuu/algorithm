// 순차 탐색(Sequantial Search)
package lecs.lec01_recursion;

public class Maze { 
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
    
}
