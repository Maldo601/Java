package N_Recursivitat;
import java.util. *;
public class A_DNI {
    // Variables Globals
    static final int MAXINTERROGANTS = 6;
    static String [] nifsOk = new String[9];
    static int numNIFs = 0;
    static String Validar = "";
    static char lletraOperacional;
    static Scanner lect;
    static String historial [] = new String[1]; // S'incrementa la mesura del vector 
    static List <String> list = Arrays.asList(historial);
    // Funció de Lectura. 
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
             El vector ja amb valors i lletra, es passarà a la funció de Validar la redundancia.

             - 2.1_ Si es valid OK. 
             - 2.2_ Si no es vàlid, tornarà a cridar a aleatorietat. 

        - 3_ Si falta digit i lletra, reomplirem els buits dels digits i Validarem cada una de les parts 
             numeriques per extraure la lletra que li correspon.
    */
    static void addStringArray (String nif){
        int i = 0;
        while ( i <= 1000){   
        if (nifCorrecte(nif) == true ){
            // Passa indiscriminadament una cadena al vector. 
            for (int x = 0; x < nif.length(); x++){
                nifsOk[x] = String.valueOf(nif.charAt(x));
            }
            // Generadora de numeros aleatoris si hi han interrogants.
            String numP = "";
            Validar = "";
            for ( int y = 0; y < nif.length()-1; y++){
                if (nifsOk[y].equals("?")){
                    numP = String.valueOf( (int) (Math.random() * (9-0+1)) + 0);
                    nifsOk[y] = numP;
                }
                Validar += nifsOk[y];
            }
            boolean comprova = false;
            if(!validNif(Validar)){ // Benvinguts a la recursivitat.
                nifsOk[8] = ""+lletraOperacional;
            } 
            if (validNif(Validar)){ // Sempre arribara en lletra. 
                List<String> list = Arrays.asList(historial);
               if(!list.contains(Validar)){
                        historial = Arrays.copyOf(historial, historial.length + 1);
                        historial[historial.length-1] = Validar; 
                }
                else 
                comprova = true;
                if(!comprova){
                    System.out.println(Arrays.toString(nifsOk));
                }
            }
        }
        i++;
        }
    }
    static boolean validNif(String nif){
        String lastLetter = nifsOk[8];
        lletraOperacional = "TRWAGMYFPDXBNJZSQVHLCKE".charAt((Integer.parseInt(nif) % 23));
        if (lastLetter.equals(String.valueOf(lletraOperacional)))
            return true;
        else
        return false;
    }
    static char returnLetter (String nif){
        
        return lletraOperacional;
    }
    public static void main (String [] args){
        String nif = llegeixNif();
        addStringArray(nif);
        System.out.println("\n\n");
        }
    }

