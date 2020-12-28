package F_Condicionals;
import java.util.Scanner;
public class F_BMod {
    public static Scanner lect;
    public static void main (String[] args) {
        lect = new Scanner(System.in);
        // Variable d'almacenament d'input.
        System.out.print("\n\t\033[36mIntrodueix una nota entre 1 i 10 sense decimals: \u001B[0m");
        double age = lect.nextDouble();
        String ageCad = String.valueOf(age);  
        // Condicionals 
        if (ageCad.length() <= 4) // [Desde 1.00 a 9.99] 10 enter son 2 caracters i 10.01 (5 length) excedix el que demana el programa i el trencara. 
            if ((age == (int)age) && age >= 1 && age <= 10)
            System.out.println("\n\t\033[32mHas introduit un enter vàlid al rang. És: \u001B[0m" + (int)age + "\n");
            else if (age < 1 || age > 10)
            System.out.println("\n\t\033[31mEstas fora del rang solicitat.\n");
            else 
            System.out.println("\n\t\033[31mHas introduit un numero decimal. És el: \u001B[0m" + age + "\n");
        else
        System.out.println("\n\t\033[31mERROR, Excedeix la longitud de valor valid\n");
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