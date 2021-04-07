package P_FuncionsII;
import java.util.*;
public class I_VectorIntMax {
    static int max (int v[]){
        int aux[] = Arrays.copyOf(v, v.length);
        Arrays.sort(aux);
        return aux[aux.length-1];
    }
    public static void main (String [ ] args ){
        int v[ ] = {5,2,32,4,5,6};
        System.out.println(max(v));
    }
}
// Maldo