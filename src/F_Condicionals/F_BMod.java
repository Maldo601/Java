package F_Condicionals;

import java.util.Scanner;

public class F_BMod {
    public static Scanner lect;
    public static void main (String[] args) {
        lect = new Scanner(System.in);
        // Variable d'almacenament d'input.
        System.out.print("Introdueix una nota entre 1 i 10 sense decimals: ");
        double age = lect.nextDouble();
        String ageCad = String.valueOf(age);  
        // Condicionals 
        if (ageCad.length() <= 5) // [Desde 1.00 a 9.99] 10 enter son 2 caracters i 10.01 (5 length) excedix el que demana el programa i el trencara. 
            if ((age == (int)age) && age >= 1 && age <= 10)
            System.out.println("Has introduit un enter vàlid al rang. És: " + (int)age);
            else if (age < 1 || age > 10)
            System.out.println("Estas fora del rang solicitat.");
            else 
            System.out.println("Has introduit un numero decimal. És el: " + age);
        else
        System.out.println("ERROR, Excedeix la longitud de valor valid");
    }
}
/*
if ( (age == (int)age) && age > 1 && age < 10) 
            System.out.println("Número valid, has introduit: " + (int)age);
            else if ( (age == (float)age) )
            System.out.println("Has introduit un numero en decimals.");
*/
/*
System.out.println(
            ( (age == (int)age) && age >= 1 && age <= 10 ) ? "Número introduit vàlid. És " + (int)age
                                                           : "Has introduit un numero en decimals"
            );
*/