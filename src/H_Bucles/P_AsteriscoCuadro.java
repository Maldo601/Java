package H_Bucles;
import java.util.*;
public class P_AsteriscoCuadro {
    /*
 Fer un requadre d'asteriscs de les dimensions x i y que indiqui l'usuari.
 Ha de quedar de la manera següent:

 *******
 *     *
 *     *
 ******* 
*/
    public static void main(String[] args) {
        int numx, numy, i, j;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Programa per crear un quadrat d'asteriscs.\n");
        System.out.print("Quantes fileres vols ? ");
        numx = entrada.nextInt();
        System.out.print("Quantes columnes vols ? ");
        numy = entrada.nextInt();
		System.out.println();
        // Bucle de les files
        for (i = 0; i < numx; i++) {
            // Bucle de les columnes
            // La primera i la darrera fila son diferents
            if (i == 0 || i == numx-1) {
				for (j = 0; j < numy; j++) {
					System.out.print("*");
				}
			}
			else {
				// Primer col·loquem un asterisc i després espais
				System.out.print('*');
				for (j = 1; j < numy-1; j++) {
					System.out.print(' ');
				}
				// Al final un altre asterisc
				System.out.print('*');
			}
			// Alimentem línia
            System.out.println();
        }
    }
}

