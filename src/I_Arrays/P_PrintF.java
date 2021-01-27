package I_Arrays;
import java.util.Arrays;	
public class P_PrintF {
    public static void main(String[] args) {

        // Declarem i inicialitzem un vector de valors int
        int enters[] = { 12, 34, -1, -14, 35, 162, 920, 34 }; // 8 elements
        // Declarem i inicialitzem un vector de valors double
        double nums[] = { 1.3, 4.56, -12.45, 9.638, 11.452 }; // 5 elements

        // Declarem i inicialitzem la matriu al mateix temps
        int [][] matriuEnters = { {1,3,25},{5,7,-123},{9,13,1532} }; // 3x3
        int i,j;
        
        // Mostrem els vectors fent servir Arrays
        System.out.println("Vector d'enters");
        System.out.println(Arrays.toString(enters));
        System.out.println("\nVector de doubles");
        System.out.println(Arrays.toString(nums));
        System.out.println();		// Escriu una línia en blanc
        
        // Mostrem el vector d'enters fent servir length
        System.out.println("Vector de "+enters.length+" enters:");
        for (i=0;i<enters.length;i++)
            System.out.printf("Element: %5d\n", enters[i]);

        // Mostrem el vector de nombres reals
        System.out.println("\nVector de "+nums.length+" valors double");
        i=0;
        while (i<nums.length)
            // Mostrem els valors ocupant 6 posicions i amb 2 decimals
            System.out.printf("Element: %6.2f\n", nums[i++]);

        // Ara mostrem tots els valors de la matriu
        // Calculem també la suma dels valors
        int suma=0;
        System.out.println("\nEls 9 valors guardats dins la matriu són:");
        // El nombre d'elements dins de la matriu també es pot calcular amb:
        System.out.println("Nombre d'elements = " + matriuEnters.length*matriuEnters[0].length);

        // També es pot accedir a la dimensió de files i columnes amb length
        for (i=0;i<matriuEnters.length;i++)
        {
            // Lés columnes amb l'índex i
            for (j=0;j<matriuEnters[i].length;j++)
            {
                // Impressió amb format
                // Té el mateix funcionament que al llenguatge C.
                System.out.printf("%6d",matriuEnters[i][j]);
                // Acumulem la suma
                suma = suma+matriuEnters[i][j];
            }
            System.out.println();		// Escriu una línia en blanc
        }
        // Mostrem la suma
        System.out.println("\nLa suma dels 9 elements de la matriu és: "+suma);
    }
}
