package N_Recursivitat;
import java.util. *;
public class A_DNI {
    static final int MAXINTERROGANTS = 6;
    static String [] nifsOk = new String[(int) (Math.pow(10,MAXINTERROGANTS))];
    static int numNIFs = 0;
    static Scanner lect;
    static String llegeixNif(){
        lect = new Scanner(System.in);
        System.out.print("Introdueix els caràcters del NIF incomplet, indicant en ? el caracter desconegut: ");
        String lectura = lect.nextLine();
               lectura.toUpperCase();
            
        // Retorna cadena en nif no resolt llegit i passada a MAYUS cuan es true
        // Demana repetidament la introduccio de les dades si son false. 
        // Per comprobar la cadena introduida usa la funcio nifCorrecte.
        return lectura;
    }
    static boolean nifCorrecte(String nif){
        // 26 linies 
        // torna true if: 9 charlength // 8 primers son xifres o ?
        // Ultim ha de ser lletra valida o ?
        // no mes de 6 interrogants. 

        // char let = "TRWAGMYFPDXBNJZSQVHLCKE".charAt(dni % 23);
        int numPart = Integer.parseInt(nif.substring(0,8));
        char letter = "TRWAGMYFPDXBNJZSQVHLCKE".charAt(numPart % 23);

        boolean length;
        boolean trueNum;
        boolean validLett;
        boolean inter;
        if (nif.length() == 9)
            length = true;
        if (nif.indexOf(9) == letter)

        return false;
        
    }
    static void afegeixNif(String nif){
        // 4 linies de codi
    }
    static boolean nifOk (String nif){

        return true;
    }
    static void resolveNif(String nif){

    }
    public static void main (String [] args){
        String nif = llegeixNif();
        resolveNif(nif);
        for (int n = 0; n < numNIFs; n++){
            System.out.println("%6d - Trobat NIF: " + nifsOk[n] + "\n", n+1);
        if (numNIFs == 0){
            System.out.println("No s'ha trobat cap solució que satisfagui els requeriments del problema");
        }
        else 
        System.out.println("Trobats un total de " + numNIFs + " NIF que satisfan els requeriments del problema");
        }
    }
}
