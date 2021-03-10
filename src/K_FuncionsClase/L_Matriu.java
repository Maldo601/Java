package K_FuncionsClase;
import java.util.Arrays;
public class L_Matriu {
    // Exercici IV 
    
    // Visualitzar la matriz
    static void visualitza  (int [][] m){
        //System.out.println(java.util.Arrays.toString(x))
        for (int n = 0; n < m.length; n++){
            System.out.println(Arrays.toString(m[n]));
        }
    }
    static void inicialitza (int [][] m, int min, int max){
        // Condicions
        // Bucle de relleno
        int aux = 0;
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++){
            if (min < max){
                aux = (int) (Math.random() * (max - min+1) + min);
                m[i][j] = aux;
            }
            else if ( min > max ){
                // Es permuten els valors per ser min el mes gran.
                aux = min;
                min = max;
                max = aux;
                aux = (int) (Math.random() * (max - min+1) + min);
                }
                m[i][j] = aux;
            }
    }
    public static void main(String[] args){
        int m[][] = new int [3][8];
        int min = 24;
        int max = 1;
        inicialitza(m,min,max);
        visualitza(m);
    }
}
