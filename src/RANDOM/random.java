package RANDOM;

import java.util.Scanner;

public class random {
    public static Scanner random;
  
    public static void main (String[] args) {
        random = new Scanner(System.in);

        long x,y,z;
        System.out.print("Introdueix x: ");
        x = random.nextLong();
        System.out.print("Introdueix y: ");
        y = random.nextLong();
        System.out.print("Introdueix z: ");
        z = random.nextLong();
        // Condicionals
        // introduir el comparatiu de la hipoptenusa i si son 0
        //cc <= c2 || 
        if ((x == y) && ( x == z) && (y == z) ) // no cal comparar el tercer 
            System.out.println("El triangle és Equilater");
            else if ((x == y) && (x != z) && (y != z)) // revisar 
                System.out.println("El triangle és Isoceles");
            else if ((x != y) && (x != z) && (y != z)) // revisar
                System.out.println("El triangle és Escalè");
        // Condicional Pitagores
        if  ( x*x + y*y == z*z ) // S'han de fer tres 
            System.out.print("El triangle és rectangle.");
            else
            System.out.println("El triangle no és rectangle.");
    }
}
// _ M A L D O _ // 
