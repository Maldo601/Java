package J_Functions;

public class G_Dado {
    public static int dado(int min, int max){
        return (int) (Math.random() * (max - min+1) + min);
    }
    public static void main (String[] args){
    /*
        for (int x = 0; x < 10; x++){
            System.out.print(dado(1,6));
        }
    */
        System.out.print(dado(1,6));
    }
}
