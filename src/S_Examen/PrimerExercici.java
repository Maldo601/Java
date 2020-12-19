package S_Examen;
import java.util.Scanner;
public class PrimerExercici{
    public static Scanner lect;
    public static void main(String[] args){
        lect = new Scanner(System.in);
        // Exercici 1
        final double col = 0.56;
        final double scot = 0.48;
        System.out.print("Hola Lluis, quants rollos vols adquirir?: ");
        int rollos = lect.nextInt();
        double preudescCol;
        double preudescScot;
        double desCol;
        double desCot;
        System.out.println("Vols adquirir "+rollos+ " rollos de paper");
        if (rollos < 20){
            desCol = rollos * col;
            desCot = rollos * scot;
            System.out.println("Colhogar et costa: " + desCol);
            System.out.println("Scottex et costa: " + desCot); 
            if( desCol > desCot)
            System.out.println("Colhogar et surt mes car.");
            else if (desCol < desCot)
            System.out.println("Scotex et surt mes barato");
            else 
            System.out.println("Et surten al mateix preu");
            // System.out.println("");
        }
        else if ( rollos >= 20 && rollos < 50){
            desCol = rollos * col;
            desCot = rollos * scot;
            System.out.println("El preu de Colhogar son: " + desCol);
            System.out.println("El preu de Scotex son: " + desCot);
            System.out.println("Tens descompte");
            preudescCol = desCol * 0.15;
            preudescScot = desCot * 0.10;
            desCol = desCol - preudescCol;
            desCot = desCot - preudescScot;
            System.out.println("Colhogar et surt a " +desCol+ " €");
            System.out.println("Scotex et surt a "+desCot+ " €");
                if ( desCol > desCot)
                    System.out.println("Colhogar es mes barat.");
                else if ( desCol < desCot)
                    System.out.println("Scotex et surt mes barato.");
                else 
                    System.out.println("Et surten al mateix preu.");
        }
        else if ( rollos >= 50 && rollos < 200){
            desCol = rollos * col;
            desCot = rollos * scot;
            System.out.println("El preu de Colhogar son: " + desCol);
            System.out.println("El preu de Scotex son: " + desCot);
            System.out.println("Tens descompte");
            preudescCol = desCol * 0.25;
            preudescScot = desCot * 0.15;
            desCol = desCol - preudescCol;
            desCot = desCot - preudescScot;
            System.out.println("Colhogar et surt a " +desCol+ " €");
            System.out.println("Scotex et surt a "+desCot+ " €");
                if ( desCol > desCot)
                    System.out.println("Colhogar es mes barat.");
                else if ( desCol < desCot)
                    System.out.println("Scotex et surt mes barato.");
                else 
                    System.out.println("Et surten al mateix preu.");
        }
        else if ( rollos >= 200){
        desCol = rollos * col;
        desCot = rollos * scot;
        System.out.println("El preu de Colhogar son: " + desCol);
        System.out.println("El preu de Scotex son: " + desCot);
        System.out.println("Tens descompte");
        preudescCol = desCol * 0.35;
        preudescScot = desCot * 0.20;
        desCol = desCol - preudescCol;
        desCot = desCot - preudescScot;
        System.out.println("Colhogar et surt a " +desCol+ " €");
        System.out.println("Scotex et surt a "+desCot+ " €");
            if ( desCol > desCot)
                System.out.println("Colhogar es mes barat.");
            else if ( desCol < desCot)
                System.out.println("Scotex et surt mes barato.");
            else 
                System.out.println("Et surten al mateix preu.");
        }
    }
}