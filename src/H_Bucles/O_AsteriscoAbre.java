package H_Bucles;
import java.util.Scanner;
public class O_AsteriscoAbre {
    public static Scanner lect;
    public static void main (String[] args){
        lect = new Scanner(System.in);
        System.out.println("Dóna'm l'alçada");
        int altura = lect.nextInt();
        System.out.println();
        int espacios=altura-1;
        int asteriscs=1;
        for (int n=0;n<altura;n++) {
            // Posem els espais
            for (int i=0;i<espacios;i++) {
				System.out.print(' ');
			}
            // Posem els asteriscs
            for (int i=0;i<asteriscs;i++) {
				System.out.print('*');
			}
            // El nombre d'espais al començament va decrementant d'un en un.
            espacios--;
            // Els asteriscs s'incrementen de 2 en 2
            asteriscs+=2; 
            System.out.println();
        }
    }
}
