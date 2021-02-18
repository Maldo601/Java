package K_FuncionsClase;

public class G_Dado {
    public static int dado(int min, int max){
        return (int) (Math.random() * (max - min+1) + min);
    }
    public static void main (String[] args){
        System.out.println(dado(1,6));
    }
}
// Joan Marc Maldonado 