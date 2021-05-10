package X_LecturaFitxers;

import java.io.*;

public class A_LecturaBasica {
    public static void main (String[] args){
    // Comprovarem el temps d'execució del programa.
    long interval = System.currentTimeMillis();
    BufferedReader bRead = null;
    int numLs = 0;
    String fichero = "palabras.txt";
    int c;
        try {
            /* Associarem el buffer al fitxer. Va aqui dintre perque de no existir
               el fitxer, es un tros de codi susceptible a errors
            */
            bRead = new BufferedReader
                (new FileReader("C:/Users/maldo/Desktop/Java/src/X_LecturaFitxers/Ficheros/palabras.txt"));
            while((c = bRead.read()) != -1){
                if ((char) c == 'l')
                    numLs++;
            }
        }catch ( Exception e ){
            System.out.println("S'ha produit un error d'accés a " + fichero);
            e.printStackTrace();
        }finally {
            System.out.println("\nCodi executat sempre: ");
            // Al tancar fitxers tambe es poden produir errors.
            try {
                if (bRead != null)
                    bRead.close();
            }catch( Exception e ){
                e.printStackTrace();
            }
        }
        System.out.println("Time Exec: " + (System.currentTimeMillis() - interval)+" ms");
        System.out.println("Trobades " + numLs + " lletres 'l' en el fitxer " + fichero);
    }
}
