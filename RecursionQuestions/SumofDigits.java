public class SumofDigits{
    public static void main(String[] args) {
        
        System.out.println(getSum(5600321));
    }

    static int getSum(int n){
        if(n == 0) return 0;

        int digit = n % 10;

        return digit + getSum(n/10);
    }
}