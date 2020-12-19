package S_Examen;
import java.util.Scanner;
public class TercerExercici {
    public static Scanner lect;
    public static void main (String [] args){
        lect = new Scanner(System.in);
        System.out.println("Hola quina edat tens?: ");
        int age = lect.nextInt();
        if ( age < 5)
        System.out.println("Tu no et vacunes ");
        else if ( age >=5 && age <= 10)
        System.out.println("Et vacunes amb la Pfizer");
        else if ( age > 10 && age <= 15)
        System.out.println("Et vacunes amb BioNTech");
        else if ( age >15 && age <= 30)
        System.out.println("Et vacunes amb la Pfizer");
        else if ( age > 30 && age <= 50)
        System.out.println("Et vacunes en la Moderna");
        else 
        System.out.println("Et vacunes en la Oxford"); 

    }
}
