
public class mazeproblem {
    public static void main(String[] args) {
        
        paths(0, 0, 3,"");
    }

    static void paths(int i,int j,int n,String p){

        if(i >= n || j>=n) return ;
        if(i == n-1 && j == n-1) {
            System.out.println(p);
            return ;
        }

        paths(i+1,j,n,p+'D');
        paths(i,j+1,n,p+'R');
    }
}
