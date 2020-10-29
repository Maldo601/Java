package D_OthersOperations;

import java.util.Scanner;

public class C_ConversorEuroPesseta {
    public static Scanner lectmoney;
    public static void main (String[] args) {
        lectmoney = new Scanner(System.in);
      
        // Variable double per si li volem entrar amb decimals i lectura double.
        System.out.println("\n\tBenvingut a la conversora € - pta.");
        System.out.println("\tIntrodueix els decimals amb coma si escau.\n");
        System.out.print("\tEuros a convertir: \033[32m");
        double eur = lectmoney.nextDouble();
        // Aquest print agafa el valor introduit abans de ser convertit i ser adjuntat a l'output final.
        System.out.print("\n\t\033[37m"+eur + "€ són... ---> ");
        // Factor de conversió.
               eur = (eur * 166.386);
        // Output Double arrodonit a consideració per el mètode Math.round 
        // i en sortida de 2 decimals.
        System.out.println((double)Math.round(eur * 100d)/100d + " pessetes.\n");
    }
}
/*_Maldo_*/