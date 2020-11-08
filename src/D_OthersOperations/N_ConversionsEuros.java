package D_OthersOperations;
import java.util.Scanner;
public class N_ConversionsEuros {
    public static Scanner lecteur;
    public static void main (String[] args) {
        lecteur = new Scanner(System.in);
        System.out.print("Introdueix cèntims: ");
        // Variables
        int cents = lecteur.nextInt();
        int dos,un,cinquanta,vint,deu,CINC,dosM,X;
        // Operacions
            dos       = cents/200;
            un        = (cents%200)/100;
            cinquanta = ((cents%200)%100)/50;
            vint      = (((cents%200)%100)%50)/20;
            deu       = ((((cents%200)%100)%50)%20)/10;
            CINC      = (((((cents%200)%100)%50)%20)%10)/5;
            dosM      = ((((((cents%200)%100)%50)%20)%10)%5)/2;
            X         = ((((((cents%200)%100)%50)%20)%10)%5)%2;
        // Output
        System.out.println("\n\t" + cents + " centims són: \n" +
                           "\n\t2€ : " + dos +
                           "\n\t1€ : " + un +
                           "\n\t50c: " + cinquanta +
                           "\n\t20c: " + vint +
                           "\n\t10c: " + deu +
                           "\n\t5c : " + CINC +
                           "\n\t2c : " + dosM +
                           "\n\t1c : " + X);
    }    
}
/*_Maldo_*/