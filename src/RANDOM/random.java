package RANDOM;

import java.util.Scanner;

public class random {
    public static Scanner random;
    public static void main (String[] args) {
        random = new Scanner(System.in);

        int edad = random.nextInt();
            System.out.print("Introdueix la teua edat: " + (edad+1) + "años");
            String s = random.nextLine();
            
            System.out.println("introduce tu nombre: " + s );
            //s = s.replace(',','.');
            //double edad = Double.parseDouble(s);
           



        System.out.println();
    }
}
