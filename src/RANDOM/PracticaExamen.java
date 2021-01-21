package RANDOM;
import java.util.Scanner;
public class PracticaExamen {
    public static Scanner lect;
    public static void main (String[] args){
        lect = new Scanner(System.in);
        System.out.print("Introdueix numero de files: ");
        int files = lect.nextInt();
        System.out.println();
        for(int alt = 1; alt<=files; alt++){
            // Activar espaiat per fer modo invers.
            for(int espais = 1; espais<=files-alt; espais++){
                System.out.print(" ");
            }// Afegir altura * 2 -1 per fer arbre
            for(int aster=1; aster<=(alt*2)-1; aster++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// M A L D O // 