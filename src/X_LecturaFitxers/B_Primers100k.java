package X_LecturaFitxers;
import java.io.*;
import java.util.Arrays;
/*
    Joan Marc Maldonado
    GitHub: https://github.com/Maldo601
    ----------------------------------------------------------------------------------
    - El programa funciona correctament en els casos de

        1.- Vectors amb mides exactes.
        2.- Autotancament amb try-with-resources.
        3.- 
        4.- 
        5.- 
        6.- 
        7.- 
        8.- 
        9.- 
        10. 
        11. 
        12.- Temps òptimitzats per usar lectura amb BufferReader.

    - Presenta problemes del tipo ... {

        - Cap. (crec...)

    - Documentació del Programa:

        1.- Variables Globals.
        2.- Distance
        3.- InvertirNumero
        4.- countNewArray
        5.- Main
                
*/
public class B_Primers100k {
    static int flag1 = 0;
    static int flag2 = 0;
    static int gem = 0;
    static int num = 0;
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
    static int invertirNumero(int num){
        int xifra, invers = 0;
        while(num!=0){
            xifra = num%10;
            invers = (invers * 10) + xifra;
            num/=10;
        }
        return invers;
    }
    static void countNewArray(int v[]){
        int count = 0;
        for (int i = 0; i < v.length; i ++){
            num = invertirNumero(v[i]);
            if(v[i] == num){
                System.out.print("      " + num ); // Camp de 6 precedits d'espai.
                count++;
            }
        }
        if (count == 0){
            try {
                throw new Exception("");
            }catch (Exception e) {
                System.out.println("No s'han trobat palíndroms.");
            }
        }else{
            System.out.print("\n");
            System.out.println("Trobats " + count + " Palíndroms.");
        }
    }

    public static void main (String[] args){
        int linies = 0;
        String c = "";
        int counter = 0;
        long temps = System.currentTimeMillis();
        int v[];
        if (args.length != 1){
            System.out.println("\nPrograma per llegir una llista de primers d'un fitxer\n" + 
                               "-----------------------------------------------------  \n"  +
                               "Ha de passar al programa el nom d'un fitxer de text    \n"  +
                               "contenint números primers. El programa farà una serie  \n"  +
                               "d'operacions amb aquests primers. No s'han passat      \n"  +
                               "arguments al programa. L'execució no pot continuar.");
        }else{
            // Primer try, conta linies per determinar la longitud del vector.
            try(FileReader fr = new FileReader(args[0])) {
                BufferedReader bRead = new BufferedReader(fr);
                while((c = bRead.readLine()) != null){
                    linies++;
                }
                    
            }catch(Exception e){
                System.out.println("S'ha produit un error.\n ");
                // e.printStackTrace();
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
                System.out.println("Gemelos-> " + gem);
                countNewArray(v);
            }catch (Exception e){
                System.out.println("\nError al processar el fitxer. \n");
                System.out.println(e.getMessage());
                // e.printStackTrace();
            }
            System.out.println("Execution time: " + (System.currentTimeMillis() - temps) + " ms.");
        }
    }
}
    