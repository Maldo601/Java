package N_Recursivitat;
import java.util. *;
public class A_DNI {
    static final int MAXINTERROGANTS = 6;
    static String [] nifsOk = new String[9];
    static int numNIFs = 0;
    static String Validar = "";
    static Scanner lect;
    static String v[] = new String [9];
    static String llegeixNif(){
        lect = new Scanner(System.in);
        System.out.print("Introdueix els caràcters del NIF incomplet, indicant en ? el caracter desconegut: ");
        String lectura = lect.nextLine();
               lectura.toUpperCase();
        return lectura;
    }
    // Esta funció s'encarregarà de convertir els interrogants del bucle en números. La lletra no. 
    static String aleatorietat (String nif){
        String numP = "";
        for ( int a = 0; a < nif.length(); a++){
            numP = String.valueOf( (int) (Math.random() * (9-0+1)) + 0);
        }
        return numP;
    }
    static boolean nifCorrecte(String nif){
        int interrogants = 0;
        boolean interrogant = false;
        boolean maxEnter = false;
        boolean lastLetter = false;
        // Al passar lletres retorna true, arreglar. 
        // Funciona en true passantli
        /*
            - 8 digits 1 lletra
            - 8 digits en interrogants i lletra
            - 8 digits en interrogants i lletra interrogant
        */
        for ( int i = 0; i < nif.length(); i++){
            if ( nif.charAt(i) == '?' )
                interrogants++;
                interrogant = true;
            if (nif.charAt(i) <= 9 || nif.charAt(i) >= 0 || nif.charAt(i) == '?')
                maxEnter = true;
            if (!nif.substring(8).matches("\\d*"))
                lastLetter = true;
        }
        if ( (interrogant && maxEnter && lastLetter) == true )
            return true;
        System.out.println(interrogants);
        return false;
    }
    /* Funció on es comprovarà el que hi ha al vector i es pendran mesures oportunes. Aquestes son: 
        - 1_ Si hi ha lletra i hi ha una part numerica completa, es passarà a comprobar si es vàlid.
        - 2_ Si falten digits a la part numèrica pero hi ha lletra, crida a Aleatorietat per generar els valors.
             El vector ja amb valors i lletra, es passarà a la funció de validar la redundancia.

             - 2.1_ Si es valid OK. 
             - 2.2_ Si no es vàlid, tornarà a cridar a aleatorietat. 

        - 3_ Si falta digit i lletra, reomplirem els buits dels digits i validarem cada una de les parts 
             numeriques per extraure la lletra que li correspon.
    */
    static String[] addStringArray (String nif){   
        if (nifCorrecte(nif) == true){
            // Passa indiscriminadament una cadena al vector. 
            for (int x = 0; x < nif.length(); x++){
                nifsOk[x] = String.valueOf(nif.charAt(x));
                v[x] = nifsOk[x];
                Validar += nifsOk[x];
            }
            // Generadora de numeros aleatoris si hi han interrogants.
            String numP = "";
            for ( int y = 0; y < nif.length()-1; y++){
                if (nifsOk[y].equals("?")){
                    numP = String.valueOf( (int) (Math.random() * (9-0+1)) + 0);
                    nifsOk[y] = numP;
                }
            }
            // Generadora de lletra final. 
        }
        // LOGS 
        System.out.println("\n\tDNI a Chain: " + Validar);
        System.out.println("\n\t" + Arrays.toString(v));
        return nifsOk;
    }
    static boolean validNif(String nif){
        
        // char letter = "TRWAGMYFPDXBNJZSQVHLCKE".charAt(String.valueOf(validLetr % 23));
        return false;
    }
    public static void main (String [] args){
        String nif = llegeixNif();
        System.out.println("\n\t" + Arrays.toString(addStringArray(nif)));
        /*resolveNif(nif);
        for (int n = 0; n < numNIFs; n++){
            System.out.printf("Trobat NIF: " + nifsOk[n] + "\n", n+1);
        if (numNIFs == 0){
            System.out.println("No s'ha trobat cap solució que satisfagui els requeriments del problema");
        }
        else 
        System.out.println("Trobats un total de " + numNIFs + " NIF que satisfan els requeriments del problema");
        }
        */
    }
}
