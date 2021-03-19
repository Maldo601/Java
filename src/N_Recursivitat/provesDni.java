package N_Recursivitat;
import java.util. *;
public class provesDni {
    static String [] nifsOk = new String[9];
    static int numNIFs = 0;
    static Scanner lect;
// Filtros Condicionals.
    static boolean nifCorrecte(String nif){
        boolean llarg = false; boolean xifres = false; boolean maxInt = false; boolean trueLetter = false; 
        // 9 CARACTERS DE LLARGARIA 
        if (nif.length() == 9)
            llarg = true;
        else
            return false;
        // MAXIM INTERROGANTS
        int counter = 0;
        for (int i = 0; i < nif.length(); i++){
            if ( nif.charAt(i) == '?' )
                counter++;
            if (nif.charAt(i) <= 9 || nif.charAt(i) >= 0 || nif.charAt(i) == '?')
                maxInt = true;
            else 
                return false;
        }
        if ( counter <= 6 || counter == 0 )
            xifres = true;
        else
            return false;
        // ULTIMA LLETRA VALIDA O INTERROGANT ( No validada encara )
        String lletresValides = "TRWAGMYFPDXBNJZSQVHLCKE";
        for ( int k = 0; k < lletresValides.length(); k++ ){
            if (nif.charAt(8) == '?' || nif.charAt(8) == lletresValides.charAt(k)){
                trueLetter = true;
            }
        }
        // LOGS 
        System.out.println("\n\tInterrogants trobats: " + counter);
        System.out.print("\n\tVector: " + Arrays.toString(afegeixNif(nif)));
            if ( llarg && xifres && maxInt && trueLetter == true){
                return true;
            }
        return false;
    }
// Passa el DNI a un vector. 
    static String[] afegeixNif(String nif){
        for (int x = 0; x < nif.length(); x++){
            nifsOk[x] = String.valueOf(nif.charAt(x));
            if (nifsOk[x].equals("?") && x < 8)
                nifsOk[x] = aleatorietat(nif);
        }
        return nifsOk;
    }
// Generador d'Enters Aleatoris (Apart, si detecta interrogants, es on els posa, excepte lletra.)
    static String aleatorietat (String nif){
        String numP = "";
        for ( int a = 0; a < nif.length(); a++){
            numP = String.valueOf( (int) (Math.random() * (9-0+1)) + 0);
        }
        return numP;
    }
    static boolean nifOk(String nif){
        
            String validLet="";
            for (int l = 0; l < nif.length(); l++)
                validLet += afegeixNif(nif)[l];

            int numPart = 0;
                numPart = Integer.parseInt(validLet.substring(0, 8));
            if ( validLet.charAt(8) == '?'){
                char letter = "TRWAGMYFPDXBNJZSQVHLCKE".charAt(numPart % 23);
                validLet = String.valueOf(numPart) + Character.toString(letter);
                for ( int i = 0; i < validLet.length(); i++){
                    nifsOk[i] = String.valueOf(validLet.charAt(i));  
                }
                return true; 
                // Hasta aqui el programa torna un DNI Vàlid en base a la lletra
            }
            System.out.println(validLet);
        return false;
    }
    public static void main(String[] args){
        String lectura;
        System.out.print("Introdueix un DNI: ");
        lect = new Scanner(System.in);
        lectura = lect.nextLine();
        
        // System.out.println(Arrays.toString(afegeixNif(lectura)));
        System.out.println("\n\tValidesa: " + nifCorrecte(lectura));
        System.out.println(nifOk(lectura));
    }
}
// Joan Marc Maldonado Negre 
