package G_Aleatorietat;
import java.util.Scanner;
import java.security.SecureRandom;
public class C_EndevinaNum {
    public static Scanner lect;
    public static SecureRandom sr;
    public static void main(String[] args){
        // Eines 
        lect = new Scanner(System.in);
        sr = new java.security.SecureRandom();
        // Petició Usuari
        System.out.print("\n\t\u001B[33mIntrodueix un numero del 1 al 6: \u001B[37m");
        // Variables.
        int user = lect.nextInt();
        int maquina = (sr.nextInt(6)+1);
        // Condicionals 
        if ( user > 6 || user < 1)
            System.out.println("\n\t\u001B[31mEstas fora del rang per jugar." + "\n");
        else if ( maquina == user )
            System.out.println("\n\t\u001B[32mHas encertat, he pensat el mateix número que has introduit. El: \u001B[37m" + maquina + "\n");
        else 
            System.out.println("\n\t\u001B[31mNo has encertat el numero que he triat, que era: \u001B[37m" + maquina +
                               "\n\t\u001B[33mEl que tu has posat es el: \u001B[37m" + user + "\n");
    }
}
// MALDO // 