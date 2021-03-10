package J_Functions;
import java.util.Scanner;
public class F_NumeroMesGran {
    public static Scanner lect;
    // Funció d'Aleatorietat amb valors permutables. Contempla 3 opcions.
    static int random (int min, int max){
        int aux;
        // Condicions
        if (min < max)
            return (int) (Math.random() * (max - min+1) + min);
        else if ( min > max ){
            // Es permuten els valors per ser min el mes gran.
            aux = min;
            min = max;
            max = aux;
            return (int) (Math.random() * (max - min+1) + min);
            }
    return max;
    }
    public static void main(String[] args){
        lect = new Scanner(System.in);
        System.out.print("\n\tIntrodueix n1: ");
        int x = lect.nextInt();
        System.out.print("\tIntrodueix n2: ");
        int y = lect.nextInt();

        System.out.println("\tEL número aleatori és el: " + random(x,y));
    }
}
// JOAN MARC MALDONADO // 
