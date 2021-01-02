package RANDOM;
import java.util.Scanner;
public class CaixerAutomatic {
    public static Scanner lect;
    public static void main (String[] args){
        lect = new Scanner(System.in);
        System.out.println("Benvinguts al Caixer Automàtic");
        System.out.print("Introduïu quantitat a retirar: ");
        int in = lect.nextInt();
        int bC, bV, res;
            bC = 0; bV = 0; res = 0;
        // Mòdul de 10 per detectar últim digit. R  = últim digit. 
        if ( in%10 == 0){
            System.out.println("Quantitat a retirar vàlida.");
                bC = in / 50;
                res = in % 50;
                bV = res / 20;
                System.out.println("50: " + bC);
                System.out.println("20: " + bV);
                System.out.println("Res: " + res);           
            }else if ( res > 0){
                bC = bC - 1; 
                res = in - bC * 50;
                bV = res / 20;
                System.out.println("50: " + bC);
                System.out.println("20: " + bV);
                System.out.println("Res: " + res);
            
                }else 
                    System.out.println("Quantitat a retirar invàlida.");
        }
    }


