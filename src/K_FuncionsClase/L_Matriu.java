package K_FuncionsClase;
/*
    *** Joan Marc Maldonado ***   

    - El següent programa crea i inicialitza un array bidimensional on
    - se li passa un rango (min-max) aleatori i el va replenant. 
    - Es printa l'Array per terminal i s'indica cuantes vegades apareix en ell 
    - un determinat valor mitjançant un counter. 
    NOTA: 
        - Per printar una matrix s'ha de recorrer la seua llargaria 
        - Per printar un vector unidimensional, no. 

*/
import java.util. *;
public class L_Matriu {
    public static Scanner lect;
    // Exercici IV 
    // Visualitzar l'array bidimensional. 
    static void visualitza  (int [][] m){
        //System.out.println(java.util.Arrays.toString(x))
        for (int n = 0; n < m.length; n++){
            System.out.println("\t" + Arrays.toString(m[n]));
        }
    }
    static void inicialitza (int [][] m, int min, int max){
        int aux = 0;
        for (int i = 0; i < m.length; i++){
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
    }
    static int quantesVegades (int [][] m, int x){
        int counter = 0;
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++){
                if (m[i][j] == x)
                counter++;
            }
        return counter;
    }
    public static void main(String[] args){
        lect = new Scanner(System.in);
        int m[][] = new int [3][8];
        int min = 24;
        int max = 1;
        System.out.println("\n\t\t Matrix" + "\n");
        System.out.print("\tIntrodueix un número entre el [1-24]: ");
        int value = lect.nextInt();
        inicialitza(m,min,max);
        visualitza(m);
        System.out.println("\n\t El número " + value + " s'ha repetit [" + quantesVegades(m,value) + "] vegades.");
    }
}
// Joan Marc Maldonado