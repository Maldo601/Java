package RANDOM;
import java.util.Scanner;
public class CaixerAutomatic {
    public static Scanner lect;
    public static void main (String[] args){
        lect = new Scanner(System.in);
        System.out.println("\n\t\u001B[33mBenvinguts al Caixer Automàtic");
        System.out.print("\t\u001B[33mIntroduïu quantitat a retirar: \u001B[37m");
        int in = lect.nextInt();
        // Inicialització de Variables.
        int bC, bV, res;
            bC = 0; bV = 0; res = 0;
            // Priorització fora de condicional dels 50.
            bC = in / 50;
            res = in % 50;
            bV = res / 20;
        // Condicionals. 
        // Mòdul de 10 per detectar últim digit. R  = últim digit.        
        if ( in%10 == 0 && in >= 20 ){
            System.out.println("\n\t\u001B[32mQuantitat a retirar vàlida.");   
            if (bC * 50 + bV * 20 == in) {
                System.out.println("\n\t\u001B[36mBitllets de 50 €: \u001B[37m" + bC);
                System.out.println("\t\u001B[36mBitllets de 20 €: \u001B[37m" + bV + "\n");
                }
                // Única excepció extranya.    
                else if ( in == 30)
                System.out.println("\t\u001B[31mPero no es poden retirar 30€ perque si et donés "+
                                   "un bitllet de 10, trenca la finalitat de l'exercici.");
                // Reoperar amb bitllets de 20.
                else {
                bC = bC - 1; 
                res = in - bC * 50;
                bV = res / 20;
                System.out.println("\n\t\u001B[36mBitllets de 50 €: \u001B[37m" + bC);
                System.out.println("\t\u001B[36mBitllets de 20 €: \u001B[37m" + bV + "\n");
                }    
            }else 
                System.out.println("\n\t\u001B[31mQuantitat invàlida");
        }
    }


