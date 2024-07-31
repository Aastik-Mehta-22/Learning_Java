import java.util.ArrayList;

public class mazeproblem {
    public static void main(String[] args) {
        
        // paths(0, 0, 3,"");
        ArrayList<String> ans = pathsStore(3, 3, "");
        System.out.println(ans);
        
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
}

