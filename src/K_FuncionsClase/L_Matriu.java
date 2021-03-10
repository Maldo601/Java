package K_FuncionsClase;
/*
    *** Joan Marc Maldonado ***   

    - El següent programa crea i inicialitza un array bidimensional on
    - se li passa un rango (min-max) aleatori i el va replenant. 
    - Es printa l'Array per terminal i s'indica cuantes vegades apareix en ell 
    - un determinat valor mitjançant un counter. 

    • Funció static int enQuantesFiles(int [][] m, int x) que rep una matriu d’enters m de dues dimensions, 
    i un valor enter x i ens retorna un enter que indica en quantes files de la matriu (la primera 
    coordenada suposem que és la fila, i la segona la columna) apareix el valor x (al menys un cop, 
    pot aparèixer més d’un cop a cada fila).
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
    static void fila (int [][] m, int x){
        // Index Counters
        int zero = 0;
        int one = 0;
        int two = 0;
        for (int i = 0; i < m.length; i++)
            for(int j = 0; j < m[0].length; j++){
                if (x == m[0][j])
                    zero = 1;
                else if (x == m[1][j])
                    one = 1;   
                else if (x == m[2][j])
                    two = 1;     
            }
        System.out.println("\t[0] -> " + zero);
        System.out.println("\t[1] -> " + one);
        System.out.println("\t[2] -> " + two);    
    }
    static int columna (int [][] m, int x){
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++){
                if ( x == m[i][j]){
                    return j;
                }
            }
        return -1;
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
        System.out.println("\n\t El número " + value + " s'ha repetit [" + quantesVegades(m,value) + "] vegades.\n");
        fila(m,value);
        System.out.println("\tColumna: " + columna(m, value));
    }
}
// Joan Marc Maldonado