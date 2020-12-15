package RANDOM;
import java.util.Scanner;
public class MesEspectacle {
    public static Scanner lect;
    public static void main (String[] args){
        lect = new Scanner(System.in);
        // CONTADOR DE REPETICIO DE BUCLE. 
        int counter = 0;
        // FILTROS 
        int menor = 0;
        int adult = 0;
        // LECTURA DE PERSONES 
        System.out.print("Quantes persones sou?: ");
        int numberOfPeople = lect.nextInt();
        // BUCLE 
        do 
        {
            System.out.print("Quina edat tens: ");
            int age = lect.nextInt(); 
                // Filtro condicional d'agregació.
                if (age < 18){
                    menor++;
                }
                else if (age >=18){
                    adult++;
                }
                // Output.
                if (menor > adult*2)
                        System.out.println("Tenim " +menor+ " menors i " +adult+ " adults."+" No es pot accedir.");
                else 
                        System.out.println("Tenim " +menor+ " menors i " +adult+ " adults."+" Es pot accedir.");       
            counter++;
        }
        while(counter != numberOfPeople);
    }
}
