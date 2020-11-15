package F_Condicionals;

import java.util.Scanner;

public class B_ConditionalValueRange {
    public static Scanner lect;
    public static void main (String[] args) {
        lect = new Scanner(System.in);
        // Variable d'almacenament d'input.
        System.out.print("\n\t\u001B[36mIntroduiex un número entre el 0 i el 10: \u001B[0m");
        Double age = lect.nextDouble();
        // Condicionals -- Outputs.
        if (age < 0 ) System.out.println("\n\t\u001B[31mValor massa petit !\n");
            /* Només s'executarà si el valor age es més gran. Si és
               correcte, ens ahorrem aquesta execució.*/
            else if (age > 10 ) System.out.println("\n\t\u001B[31mValor massa gran !\n");
        else System.out.println("\n\t\u001B[32mValor correcte.\n");
    }
}
// _ M A L D O _ // 
