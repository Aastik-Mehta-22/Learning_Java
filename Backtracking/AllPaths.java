public class AllPaths {
    public static void main(String[] args) {
        
        boolean[][] maze = new boolean[3][3];

        allPath("", maze, 0, 0);
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
}
