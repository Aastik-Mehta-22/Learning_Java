public class countNumbers {
    public static void main(String[] args) {
        int n = 67090300;
        int ans = count(n,0);
        System.out.println(ans);

    }

    static int count(int n,int cnt){
        if(n == 0){
            return cnt;
        }

        int digit = n % 10;
        if(digit == 0) cnt++;

        return count(n/10,cnt);
    }
}
