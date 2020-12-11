package G_Aleatorietat;

public class B_RandomRange {
    public static void main(String[] args){
        
        int n = -3;
        int x = 5;
        System.out.println( (int) (Math.random() * (x-n+1)) + n );

    }
}
