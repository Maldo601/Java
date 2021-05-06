import java.io.*;
import java.util.Arrays;
public class B_Primers100k {
    public static void main (String[] args){
        int v[];
        BufferedReader bRead = null;
        int linies = 0;
        String c;
        int counter = 0;
        if (args.length != 1){
            System.out.println("\nPrograma per llegir una llista de primers d'un fitxer\n"  + 
                               "-----------------------------------------------------  \n"  +
                               "Ha de passar al programa el nom d'un fitxer de text    \n"  +
                               "contenint números primers. El programa farà una serie  \n"  +
                               "d'operacions amb aquests primers. No s'han passat      \n"  +
                               "arguments al programa. L'execució no pot continuar.");
        // Detecta si el parametre passat acaba amb l'extensió demanada.
        }else if (!args[0].endsWith(".txt")){
            System.out.println("\nEl nom del fitxer no correspon a cap fitxer trobat al sistema.");
        }else{

            try {
                // Buffer
                bRead = new BufferedReader
                (
                    new FileReader("C:/Users/maldo/Desktop/Java/src/X_LecturaFitxers/Ficheros/primes-to-100k.txt")
                );
                while((c = bRead.readLine()) != null)
                    linies++;
                /*
                 * Es tanca el buffer perque el punter ha arribat al final i necessitarem
                 * reoperar amb ell per introduir al vector els valors, tornant el punter al principi
                 */ 
                bRead.close();
            }catch(Exception e){
                System.out.println("Error.");
            }
            // Vector de Sortida.
            v = new int [linies];
            try{
                bRead = new BufferedReader
                (
                    new FileReader("C:/Users/maldo/Desktop/Java/src/X_LecturaFitxers/Ficheros/primes-to-100k.txt")
                );
                while((c = bRead.readLine()) != null ){
                    v[counter] = Integer.parseInt(c);
                    counter++;
                }
                bRead.close();
            }catch ( Exception e ){
                System.out.println("Error indeterminat en procesar el fitxer.");
                e.getStackTrace();
            }finally{
                System.out.println(Arrays.toString(v));
            }
        }
    }
}