public class NoofDiceRolls {
    public static void main(String[] args) {
        
        dice("", 4);
    }

    static void dice(String p,int target){
        if (target == 0) {
            System.out.println(p);
            return ;
        }

        for(int i = 1;i<=6;i++){
            if(i <= target){

                char ch = (char)(i+'0');
                dice(p+ch, target-i);
            }
        }
    }
}
