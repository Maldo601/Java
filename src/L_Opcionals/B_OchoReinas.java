package L_Opcionals;
import java.util.*;
public class B_OchoReinas {

    public static void main(String[] args){
        int [] t = {1,2,3,4,5,6,7,8};
        while(!correcte(t))
            t = shuffle(t);
        dibuixaTauler(t);
    }
}
