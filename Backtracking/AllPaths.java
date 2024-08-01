import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        
        boolean[][] maze = new boolean[3][3];

        // allPath("", maze, 0, 0);
        int[][] path = new int[maze.length][maze[0].length];
        allPathPrint("", maze, 0, 0, path, 1);
    }

    static void allPath(String p,boolean[][] maze,int r,int c){
        if(r == maze.length-1 && c == maze[0].length - 1){ // here it means we are reached to end
            System.out.println(p);
            return ;
        }

        if (maze[r][c]) { 
            return ;
        }

        maze[r][c] = true;; // visited true


        if( r < maze.length - 1){
            allPath(p + 'D', maze, r+1, c); // here D reprenst down 
        }

        if(c < maze[0].length - 1){
            allPath(p+'R', maze, r, c+1); // here R represent right
        }

        if(r > 0) {
            allPath(p+'U', maze, r-1, c); // here U represent up direction 
        }

        if( c > 0){
            allPath(p + 'L', maze, r, c-1 ); // here L represent left direction
        }

        // this line is where the function will be over
        // so before the function gets removed , also remove the changes taht were made by  
        maze[r][c] = false; // backtrack
    }

    static void allPathPrint(String p,boolean[][] maze,int r,int c,int[][] path,int step){
        if(r == maze.length-1 && c == maze[0].length - 1){ // here it means we are reached to end
            
            path[r][c] = step;
            for(int[] arr: path){
                System.out.println(Arrays.toString(arr)); 
            }
            System.out.println(p);
            System.out.println();
            return ;
        }

        if (maze[r][c]) { 
            return ;
        }

        maze[r][c] = true; // visited true
        path[r][c] = step;

        if( r < maze.length - 1){
            allPathPrint(p + 'D', maze, r+1, c,path,step+1); // here D reprenst down 
        }

        if(c < maze[0].length - 1){
            allPathPrint(p+'R', maze, r, c+1,path,step+1); // here R represent right
        }

        if(r > 0) {
            allPathPrint(p+'U', maze, r-1, c,path,step+1); // here U represent up direction 
        }

        if( c > 0){
            allPathPrint(p + 'L', maze, r, c-1 ,path,step+1); // here L represent left direction
        }

        // this line is where the function will be over
        // so before the function gets removed , also remove the changes taht were made by  
        maze[r][c] = false; // backtrack
        path[r][c] = 0; // backtrack
    }
}
