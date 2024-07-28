public class positionofrightmostsetbit {
    
    public static void main(String[] args) {
        
        int n = 16;
    
        int pos = 1;
        while((n & 1 ) != 1){
            
            n = n >> 1;
            pos = pos * 2;
    
        }

        System.out.println(pos);
    }

    
}
