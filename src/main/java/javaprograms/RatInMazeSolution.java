
public class RatInMzeSolution {

    static int ROW = 0;

    static int COL = 0;

    public static void main(String[] args) {

        System.out.println("App Started.............");

        int maze[][] = { { 0, 1, 1, 1 },
                { 0, 0, 1, 0 },
                { 1, 0, 1, 1 },
                { 0, 0, 0, 0 } };

        if(solution(maze, 0, 0)) {
            System.out.println("Path found..");
        } else {
            System.out.println("Not Found.....");
        }

    }

    public static boolean solution(int [][] maze, int row, int col) {

        if(row == maze.length && col == maze[0].length && maze[row][col]==0) {
            return true;
        }
        if(row>-1 && col>-1 && row<maze.length && col<maze[0].length && maze[row][col]==0) {
            //Move Down
            if(solution(maze, row+1, col))
                return true;

            //Move left
            if(solution(maze, row, col+1)) {
                return true;
            }

            //Move right
            if(solution(maze, row-1, col)) {
                return true;
            }

            //Move right
            if(solution(maze, row, col-1)) {
                return true;
            }
        }

        return false;
    }

}
