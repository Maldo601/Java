package RANDOM;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

import java.util.Random;
public class Ascensor {
    public static Scanner lect;
    public static Random rnd;
    public static void main (String[] args){
        lect = new Scanner(System.in);
        rnd = new Random();
        System.out.println("\nBenvingut al ascensor");
        //String plantes
        final int lvl [] = {"S4","S3","S2","S1","PB","P1","P2","P3","P4","P5","P6","P7","P8","P9"}; // 28
        int actual = lvl[new Random().nextInt(lvl.length)];
        System.out.println("\nL'ascensor està a la planta: " + actual + "\n" );
        System.out.println("A quina planta vols anar?: ");
        int userGo = lect.nextInt();
        if (user == 12 || user == 13 )
            System.out.println("Area Restringida a usuaris.");
        else if (userGo > actual)
            System.out.println("Pujant desde: " + actual + " fins a: " +userGo);
        else if (usergo < actual)
            System.out.println("Baixant desde: "+ actual + " fins a " +userGo);
        else 
            System.out.println("Ens quedarem on estem crec."); 
    }
}
