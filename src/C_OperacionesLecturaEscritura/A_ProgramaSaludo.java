package C_OperacionesLecturaEscritura;

/* En primer lloc, si tenim un programa que requereix entrada de dades per terminal
   necessitem importar un lector desde la biblioteca i fora de la classe. */

import java.util.Scanner;

public class A_ProgramaSaludo {   
    public static Scanner lector;
    public static void main (String[] args) { 
        /* Cridem al scanner anterior dientli que 'lector', es un nou escaneig que ha d'inicialitzar després de ruta>importacio>clase.
           En referència al llibre de 66 pàgines (pag 63, model presentat), 
           presenta una variació en l'exemple per cridar-lo, ja que soltava un Warning molest a la vista si es seguia com a tal. 
           Es soluciona per proposició del VSCode, incrustant un private static Scanner "nom" i ja cridantlo desde el main.  */
        lector = new Scanner(System.in);
        // Missatge de Benvinguda
        System.out.println(" \n\tBenvingut a la Saludadora Personal.\n\tEscriu el teu nom i apreta Intro: \n ");
        // Variable String que recull l'input de text.
        System.out.print("\t\033[33m Introdueix el teu nom: \033[37m"); 
        String userName = lector.nextLine();
        // Constant per al nom del Programa, invariable. 
        final String PROG = "Programa";
        // Output concatenat en escapes inclosos per comilles. 
        System.out.println("\n\t\033[37m Hola "+"\""+userName+"\" "+"sóc "+"\""+PROG+"\"\n");
    }
}
        
/* _Maldo_ */