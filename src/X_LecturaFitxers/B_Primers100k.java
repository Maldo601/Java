import java.io.*;
import java.util.Arrays;
public class B_Primers100k {
    static int flag1 = 0;
    static int flag2 = 0;
    static int gem = 0;
    static int distance (int v[ ]){
        int max = 0;
        for (int i = 1; i < v.length; i ++){
            if(v[i] - v[i-1] > max ){
                max = v[i] - v[i-1];
                flag1 = v[i-1];
                flag2 = v[i];
            }
            if (v[i] - v[i-1] == 2) gem++;
        }   
        return max;
    }
    public static void main (String[] args){
        
        int linies = 0;
        String c;
        int counter = 0;
        // String fichero = args[0];
        long temps = System.currentTimeMillis();
        int v[];

        if (args.length != 1){
            System.out.println("\nPrograma per llegir una llista de primers d'un fitxer\n" + 
                               "-----------------------------------------------------  \n"  +
                               "Ha de passar al programa el nom d'un fitxer de text    \n"  +
                               "contenint números primers. El programa farà una serie  \n"  +
                               "d'operacions amb aquests primers. No s'han passat      \n"  +
                               "arguments al programa. L'execució no pot continuar.");
        // Detecta si el parametre passat acaba amb l'extensió demanada.
        }else{
            // Primer try, conta linies per determinar la longitud del vector.
            try(FileReader fr = new FileReader(args[0])) {
                BufferedReader bRead = new BufferedReader(fr);
                while((c = bRead.readLine()) != null)
                    linies++;
            }catch(Exception e){
                System.out.println("S'ha produit un error.\n " +
                                   "Info: ");
                e.printStackTrace();
            }
            // Vector de Sortida.
            v = new int [linies];
            try (FileReader fr = new FileReader(args[0])){
                BufferedReader bRead = new BufferedReader(fr);
                while((c = bRead.readLine()) != null)
                    v[counter++] = Integer.parseInt(c);
                // System.out.println(Arrays.toString(v));
                System.out.println("\nTrobat un total de " + linies + " numeros prims.\n"     +
                                   "--------------------------------------------------\n"     +
                                   "La distancia mes gran entre dos numeros consecutius es: " + 
                                    distance(v) + "\n");
                
                System.out.println("Numero -> " + flag1);
                System.out.println("Numero -> " + flag2);
                System.out.println("Gemelos-> " + counter);
            }catch (Exception e){
                System.out.println("\nError al processar el fitxer. \n" + 
                                   "Possibles causes: \n"               +
                                   "La línea" + counter + " no conté números.");
                                   System.out.println(e.getMessage());
                // e.printStackTrace();
            }
            System.out.println("Execution time: " + (System.currentTimeMillis() - temps) + " ms.");
            System.out.println(gem);
        }
    }
}