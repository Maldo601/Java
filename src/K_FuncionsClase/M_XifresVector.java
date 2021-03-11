package K_FuncionsClase;
/*
	Funció static int [] xifres(int n) a la que passem un valor enter n i 
    retorna un vector d’enters amb totes les seves xifres (sense repetir-ne cap) i ordenades de major 
    a menor. Per exemple, si la cridem com xifres(430305), 
    retornarà el vector v = {5,4,3,0}. La longitud del vector ha de ser la necessària, no major.
*/
import java.util. *;
public class M_XifresVector {
    static int[] xifres(int n){
        // Variables
        int[] vec = new int [4];
        String chain = Integer.toString(n);
        String filtro = "";
        // Bucles d'ocurrència.
        for (int d = 0; d < 10; d++) { // Digit max per index
            int counter = 0;
            // Calcula si les seguents posicions contenen el mateix valor que la actual. Es 
            // Recorren els dos bucles, aquest i l'extern. Si una posició repeteix el valor 
            // s'acumula al counter.
                for (int i = 0; i < chain.length(); i++) {
                    if(Integer.valueOf(String.valueOf(chain.charAt(i))) == d) {
                        counter++;
                    // Acumulador de digits
                    // Si es mes petit de 2 (1) es que es pot passar aquest numero al filtro.
                    if( counter < 2){
                        filtro += String.valueOf(chain.charAt(i));
                    }
                    // Plenament d'Array cridant a funció per invertir el valor de filtro
                    // Es parseja a la vegada a enter, ja que omplim un vector d'enters. 
                    for (int x = 0; x < filtro.length(); x++){
                        vec[x] = Integer.valueOf(String.valueOf(inverted(filtro).charAt(x)));
                    }
                }
            }
        }
        System.out.println("\n\tNúmero Original: " + n);
        System.out.print("\tNumero Filtrat: " + filtro + "\n"); 
        System.out.print("\tNúmero Invertit: " + inverted(filtro));
        return vec;
    }
    // Aquesta funció te la missió d'invertir cualsevol cadena. Em trenvava molt el codi posarla a l'altra
    // i he decidit tenirla aqui per a futures ocasions. 
    static String inverted (String p){
        String invertedChain = "";
        // Inversió de cadena
        for ( int k = p.length()-1; k >= 0; k --)
            invertedChain += p.charAt(k);
        return invertedChain;
    }
    public static void main (String[] args){
        int n = 430305;
        System.out.println("\t" + Arrays.toString(xifres(n)));
    }
}
