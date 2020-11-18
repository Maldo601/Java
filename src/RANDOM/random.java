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
        if ((x == y) && ( x == z) && (y == z) )
            System.out.println("El triangle és Equilater");
            else if ((x == y) && (x != z) && (y != z))
                System.out.println("El triangle és Isoceles");
            else if ((x != y) && (x != z) && (y != z))
                System.out.println("El triangle és Escalè");
        // Condicional Pitagores
        if  ( x*x + y*y == z*z )
            System.out.print("El triangle és rectangle.");
            else
            System.out.println("El triangle no és rectangle.");
    }
}
// _ M A L D O _ // 
