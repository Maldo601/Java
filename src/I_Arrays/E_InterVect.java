package I_Arrays;
import java.util.Arrays;
public class E_InterVect {
    public static void main (String[] args){
        // Vectors
        int v1[] = {1,2,3,4,5,6};
        int v2[] = {1,2,3,4,5};
        // Auxiliars
        int aux,aux2;
            // Bucle parell 
            for (int x = 0; x<3; x++){
                aux = v1[x];
                v1[x] = v1[x+3];
                v1[x+3] = aux;
            }
            // Bucle amb 3 inmovil. 
            for (int y = 0; y<v2.length/2; y++){
                aux2 = v2[y];
                v2[y] = v2[v2.length/2+y+1];
                v2[v2.length/2+y+1] = aux2;
            }
        System.out.println(Arrays.toString(v1));
        System.out.println(Arrays.toString(v2));
    }
}
// M A L D O // 



