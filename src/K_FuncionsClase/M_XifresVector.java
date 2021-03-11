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
        int[] vec = new int [4];
        String chain = Integer.toString(n);
        String filtro = "";
        
        // Bucles d'ocurrència.
        for (int d = 0; d < 10; d++) {
            int counter = 0;
                for (int i = 0; i < chain.length(); i++) {
                    if(Integer.valueOf(String.valueOf(chain.charAt(i))) == d) {
                        counter++;
                    if( counter < 2){
                        filtro += String.valueOf(chain.charAt(i));
                    }
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
