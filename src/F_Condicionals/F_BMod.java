package F_Condicionals;

import java.util.Scanner;

public class F_BMod {
    public static Scanner lect;
    public static void main (String[] args) {
        lect = new Scanner(System.in);
        // Variable d'almacenament d'input.
        System.out.print("Introdueix una nota entre 1 i 10 sense decimals: ");
        double age = lect.nextDouble();   
        // Condicional ternari -- Output.
      
        else
        System.out.println(
        ( (age ==(int)age) && age > 1 && age < 10 ) ? "Número introduit vàlid. És " + (int)age
                                                    : "Has introduit un numero en decimals"
        );
    }
}

/*

if ( (age == (int)age) && age > 1 && age < 10) 
            System.out.println("Número valid, has introduit: " + (int)age);
            else if ( (age == (float)age) )
            System.out.println("Has introduit un numero en decimals.");
*/