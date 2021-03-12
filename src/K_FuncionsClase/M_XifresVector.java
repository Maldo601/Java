package K_FuncionsClase;
/*
	Funció static int [] xifres(int n) a la que passem un valor enter n i 
    retorna un vector d’enters amb totes les seves xifres (sense repetir-ne cap) i ordenades de major 
    a menor. Per exemple, si la cridem com xifres(430305), 
    retornarà el vector v = {5,4,3,0}. La longitud del vector ha de ser la necessària, no major.
*/
import java.util. *;
public class M_XifresVector {
    // Per la naturalesa de l'estructura, filtro té que anar com Static, ja que es cridat a varies funcions
    static String filtro = "";
    static Scanner lect;
    // Aquesta funció retorna la funció d'inversió aplicada al filtro que s'extreu d'aquí.
    static String xifres(int n){
        // Variables
        String chain = Integer.toString(n);
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
                }
            }
        }
        // Resultats
        // System.out.println("\n\tNúmero Original: " + n);
        // System.out.print("\tNumero Filtrat Ascendent: " + filtro + "\n"); 
        // System.out.print("\tNúmero Descendent per passar a vector: ");
        return inverted(filtro);
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
    /*
    Aquesta funció fa dues coses ( que be podrien estar separades en dos funcions mes ) pero conta 
    els digits del número filtrat, actua en base a aquesta extracció com a variabilitzador de la longitud
    del vector i, retorna el vector omplert amb la inversio. 
    */
    static int[] vector (String p){
        int filtroCount = 0;
        for (int y = 0; y < filtro.length(); y++){
            filtroCount++;
        }
        // Te que anar aquí si o si per l'observat. 
        int[] vec = new int [filtroCount];
        for (int x = 0; x < filtro.length(); x++){
            vec[x] = Integer.valueOf(String.valueOf(inverted(filtro).charAt(x)));
        }
        return vec;
    }
    public static void main (String[] args){
        lect = new Scanner(System.in);
        System.out.print("Introdueix un enter: ");
        int n = lect.nextInt();
        System.out.println("\t" + xifres(n)); 
        // Output
        System.out.print("\n\tVector de longitud Variable: " + Arrays.toString(vector(inverted(filtro))) + "\n");
    }                                                        // funcions integrades recursivament
}
// Joan Marc Maldonado 