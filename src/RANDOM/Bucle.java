package RANDOM;

import java.util.Scanner;

public class Bucle {
    public static Scanner lect;
    public static void main(String[] args) {
        
        lect = new Scanner(System.in);
        int x =1;
        // Bucle 
        for (x = 1; x <= 5; x++)
            System.out.println("La nota de l'alumne " + x + " és: ");
    }
}
