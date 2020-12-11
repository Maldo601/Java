package G_Aleatorietat;
import java.util.Scanner;
public class C_EndevinaNum {
    public static Scanner lect;
    public static void main(String[] args){
        lect = new Scanner(System.in);
        System.out.print("\nIntrodueix un numero del 1 al 6: ");
        int user = lect.nextInt();
        int maquina = (int)Math.random() * (1-6+1) + 1;
        // Condicionals 
        if ( user > 6 || user < 1)
            System.out.println("\nEstas fora del rang per jugar.");
        else if ( maquina == user )
            System.out.println("\nHas encertat, he pensat el mateix número que has introduit. El: " + maquina);
        else 
            System.out.println("No has encertat el numero que he triat, que era: " + maquina +
                               "\nEl que tu has posat es el: " + user);
    }
}
// MALDO // 