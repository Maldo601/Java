package K_FuncionsClase;
import java.util.Scanner;
public class A_NotaAlumnes {
    public static Scanner lect;
    private static boolean maxNota (int a, int b){
        if (a >= 5)
        return true;
        else
        return false;
    } 
    public static void main (String[] args){
        lect = new Scanner(System.in);
        System.out.print("Introdueix la teua nota: ");
        int x = lect.nextInt();
        System.out.println(maxNota(x, x));
    }
}
// M A L D O 
