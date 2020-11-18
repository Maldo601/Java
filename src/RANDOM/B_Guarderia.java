package RANDOM;
/*
1) Un col·legi-guarderia fa un descompte als nens nouvinguts en funció de l'edat.
De 0 a 3 anys - 10 % de descompte.
4 i 5 anys - 15 % de descompte.
6 anys - 20 % de descompte.
7 anys - 15 % de descompte.
Altres edats - Cap descompte.
Fer un programa en Java que demani l'edat del nano i mostri el descompte que se li aplicarà i 
també el cost mensual tenint en compte que sense descompte s'han de pagar 500 € al mes
*/
import java.util.Scanner; 

public class B_Guarderia {
    public static Scanner lect;
    public static void main (String[] args ) {
        lect = new Scanner(System.in);
        final Double mat = (double) 500;
        final Double desc1 = (double) (500 / 15);
        final Double desc2 = (double) (500 / 20);
        System.out.print("Introdueix edat: ");
        int age = lect.nextInt();
        if (age >= 0 && age <= 3)          
            System.out.println(mat - desc2);
            else if ( age >= 4 && age <= 5)
            System.out.println(mat - desc1);
            else if ( age == 6 )
            System.out.println(mat - desc1);
            else if (age == 7 )
            System.out.println(mat - desc2);
            else
            System.out.println("No hi ha descompte");  
    }
}
                                                                                                                                                                                                                                                                                               
