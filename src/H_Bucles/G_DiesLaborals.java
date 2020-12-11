package H_Bucles;
import java.util.Scanner;
public class G_DiesLaborals {
    public static Scanner lect;
    public static void main(String[] args) {
        lect = new Scanner (System.in);
        // AMB   DO   WHILE

        // Aquest bucle només s'executa una vegada mentre els dies introduits estiguin
        // entre el 0 i el 31. De ser el contrari, tornara a demanar els dies treballats.
        int d;
        do {
            System.out.print("Introdueix els dies treballats: ");
            d = lect.nextInt();
            System.out.println("Has treballat " + d + " dies.");
        }while(d < 0 || d > 31);    
        
        // ONLY WHILE
        System.out.print("Introdueix: ");
        int a = lect.nextInt();
        System.out.print("1 Has treballat: " + a + " dies");
        while ( a < 0 || a > 31){
            System.out.println("ERROR, apreta CTRL C");
        }
    }
}
