import java.util.ArrayList;

public class mazeproblem {
    public static void main(String[] args) {
        
        // paths(0, 0, 3,"");
        // ArrayList<String> ans = pathsStore(3, 3, "");
        // System.out.println(ans); 
        boolean[][] maze = new boolean[3][3]; // true means safe and false means obsatcles
        maze[1][1] = true;
        pathRestrictions("", maze, 0, 0);
        
    }

    static void paths(int i,int j,int n,String p){

        if(i >= n || j>=n) return ;
        if(i == n-1 && j == n-1) {
            System.out.println(p);
            return ;
        }

        paths(i+1,j,n,p+'D');
        paths(i,j+1,n,p+'R');
        paths(i+1,j+1,n,p+'X'); // x for diagonal
    }

    static ArrayList<String> pathsStore(int i,int j,String p){
    
        if (i == 1 && j == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if(i > 1 && j > 1){

            ans.addAll(pathsStore(i-1, j-1, p+'D')); // d for diagonal
        }

        if( i > 1){
            ans.addAll(pathsStore(i-1, j, p+'V')); // v for vertical;
        }


        if(j > 1){
            ans.addAll(pathsStore(i, j-1, p+'H')); // H for horizontal
        }


        return ans;
        
    }


    static void pathRestrictions(String p,boolean[][] maze,int r,int c){
        
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return ;
        }

        if(maze[r][c]){ // true means there is obstacles an false means there is no obstacles
                        // because by default value is false for boolean matrix;
            return ;
        }

        if( r < maze.length -1){
            pathRestrictions(p + 'D', maze, r+1, c); // D here for Down
        }
        if(c < maze[0].length - 1){
            pathRestrictions(p + 'R', maze, r, c + 1); // R here for right;
        }
 
        

    }
}

