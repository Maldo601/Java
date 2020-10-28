package C_OperacionesLecturaEscritura;

import java.util.Scanner;

public class C_LecturaStringsCharAt {

    public static Scanner lectchains;
    public static void main (String[] args) {
        lectchains = new Scanner (System.in);
        System.out.println("\n\tBenvingut a la lectora de cadenes de teclat que retorna la posició 0 i final.");
        // Crearem una variable chain on inicialment obrira una lectura de linea per reservarla.
        // Dos variables char analitzaran la posició 0 i la final en base a la longitud per determinar 
        // l'ultim caracter, ja que aquest, depenent de l'introduit, es de longitud variable.                  
        String chain;
        System.out.print("\n\tInserta Quelcom: ");
                  chain = lectchains.nextLine();
        char m0 = chain.charAt(0);
        char m1 = chain.charAt(chain.length()-1);
              
    System.out.println("\n\t\033[32mPrimera Lletra: \033[37m" + m0);
    System.out.println("\t\033[32mUltima Lletra: \033[37m" + m1 + "\n");
    }
}
/*_Maldo_*/