import java.io.*;
import java.util.Arrays;
public class B_Primers100k {

    // Banderilles estàtiques de posició. 
    static int flag1 = 0;
    static int flag2 = 0;
    /* 
       Funció qu retorna la màxima distància del vector i registra
       les posicions als flaggers de donarse el pas a la condició. 
    */
    static int distance (int v[]){
        int max = 0;
        for (int i = 1; i < v.length; i ++){
            if(v[i] - v[i-1] > max ){
                max = v[i] - v[i-1];
                flag1 = v[i-1];
                flag2 = v[i];
            }
        }
        return max;
    }
    public static void main (String[] args){
        BufferedReader bRead = null;
        int linies = 0;
        String c;
        int counter = 0;
        String fichero = args[0];
        long interval = System.currentTimeMillis();
        int v[];

        if (args.length != 1){
            System.out.println("\nPrograma per llegir una llista de primers d'un fitxer\n" + 
                               "-----------------------------------------------------  \n"  +
                               "Ha de passar al programa el nom d'un fitxer de text    \n"  +
                               "contenint números primers. El programa farà una serie  \n"  +
                               "d'operacions amb aquests primers. No s'han passat      \n"  +
                               "arguments al programa. L'execució no pot continuar.");
        // Detecta si el parametre passat acaba amb l'extensió demanada.
        }else if (!args[0].endsWith(".txt")){
            System.out.println("\nEl nom del fitxer no correspon a cap fitxer trobat al sistema.");
        }else{
            // Primer try, conta linies per determinar la longitud del vector.
            try {
                bRead = new BufferedReader
                (
                    new FileReader("C:/Users/maldo/Desktop/Java/src/X_LecturaFitxers/Ficheros/Primes-to-100k.txt")
                );
                while((c = bRead.readLine()) != null)
                    linies++;
                /*
                 * Es tanca el buffer perque el punter ha arribat al final i necessitarem
                 * reoperar amb ell per introduir al vector els valors, tornant el punter al principi
                 */ 
                bRead.close();
            }catch(Exception e){
                System.out.println("S'ha produit un error.\n " +
                                   "Info: ");
                e.printStackTrace();
            }
            // Vector de Sortida.
            v = new int [linies];
            try{
                bRead = new BufferedReader
                (
                    new FileReader("C:/Users/maldo/Desktop/Java/src/X_LecturaFitxers/Ficheros/Primes-to-100k.txt")
                );
                while((c = bRead.readLine()) != null)
                    v[counter++] = Integer.parseInt(c);
                System.out.println(Arrays.toString(v));
                bRead.close();
            }catch (Exception e){
                System.out.println("\nError al processar el fitxer. \n" + 
                                   "Possibles causes: \n"               +
                                   "La línea" + counter + " no conté números.");
                e.printStackTrace();
            }
            System.out.println("Trobat un total de " + linies + " numeros prims.");
            System.out.println(distance(v));
            System.out.println(flag1);
            System.out.println(flag2);
        }
    }
}