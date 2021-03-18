package N_Recursivitat;
import java.util. *;
public class provesDni {
    static String [] nifsOk = new String[9];
    static int numNIFs = 0;
    static Scanner lect;
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
            if ( nif.charAt(i) == '?')
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
        // ULTIMA LLETRA VALIDADA
        // char letter = "TRWAGMYFPDXBNJZSQVHLCKE".charAt(validLet % 23);
        /*
        String validLet="";
        for (int l = 0; l < nif.length(); l++){
            validLet += afegeixNif(nif)[l];
        }
        // Que tot siguien enters: 
        int numPart = 0;
            numPart = Integer.parseInt(validLet.substring(0, 8));
        
        System.out.println("\n\tPart Numerica del dni: " + numPart);
        */
        // ULTIMA LLETRA VALIDA O INTERROGANT ( No validada encara )
        String lletresValides = "TRWAGMYFPDXBNJZSQVHLCKE";
        for ( int k = 0; k < lletresValides.length(); k++ ){
            if (nif.charAt(8) == '?' || nif.charAt(8) == lletresValides.charAt(k)){
                trueLetter = true;
            }
        }
        // char letter = "TRWAGMYFPDXBNJZSQVHLCKE".charAt(numPart % 23);
        // LOGS 
        System.out.println("\n\tInterrogants trobats: " + counter);
        System.out.println("\n\tNif passat: " + nif);
        System.out.print("\n\tVector: " + Arrays.toString(afegeixNif(nif)));
        //System.out.print("\n\tExtracte del vector: " +  validLet);
        
            if ( llarg && xifres && maxInt && trueLetter == true){
                return true;
            }
        return false;
    }
    // Passa el DNI a un vector. 
    static String[] afegeixNif(String nif){
        
        for (int x = 0; x < nif.length(); x++){
            nifsOk[x] = String.valueOf(nif.charAt(x));
        }
        for (int y = 0; y < nif.length(); y++){
            if (nifsOk[y].equals("?")){
                nifsOk[y] = aleatorietat(nif);
            }
        }
        return nifsOk;
    }
    static String aleatorietat (String nif){
        String numP = "";
        int mnm = 0; int mxm = 9;
        for ( int a = 0; a < nif.length(); a++){
            numP = String.valueOf( (int) (Math.random() * (mxm-mnm+1)) + mnm);
        }
        return numP;
    }
    static boolean nifOk(String nif){

        return false;
    }
    public static void main(String[] args){
        String lectura;
        System.out.print("Introdueix un DNI: ");
        lect = new Scanner(System.in);
        lectura = lect.nextLine();
        
        // System.out.println(Arrays.toString(afegeixNif(lectura)));
        System.out.println("\n\tValidesa: " + nifCorrecte(lectura));
        
    }
}
// Joan Marc Maldonado Negre 
