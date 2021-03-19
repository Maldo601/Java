package N_Recursivitat;
import java.util. *;
public class provesDni {
    static String [] nifsOk = new String[9];
    static int numNIFs = 0;
    static Scanner lect;
// Filtros Condicionals.
    
    static String[] afegeixNif(String nif){
        if (nifCorrecte(nif) == true){
            for (int x = 0; x < nif.length(); x++){
                nifsOk[x] = String.valueOf(nifOk(nif).charAt(x));
                numNIFs ++;
            }
            for ( int y = 0; y < nif.length(); y ++){
                if (nifsOk[y].equals("?") && y < 8)
                    nifsOk[y] = aleatorietat(nif);
            }
        }     
        return nifsOk;
    }
// Generador d'Enters Aleatoris (Apart, si detecta interrogants, es on els posa, excepte lletra.)
    
    static String nifOk(String nif){
        
            i 
                // Hasta aqui el programa torna un DNI Vàlid en base a la lletra
            }
        return nif;
    }
    static void resolveNif(String nif){
        if (nifCorrecte(nif) == true)
            afegeixNif(nif);
    }
    public static void main(String[] args){
        String lectura;
        System.out.print("Introdueix un DNI: ");
        lect = new Scanner(System.in);
        lectura = lect.nextLine();
        
        // System.out.println(Arrays.toString(afegeixNif(lectura)));
        resolveNif(lectura);
        
    }
}
// Joan Marc Maldonado Negre 
