package K_FuncionsClase;
import java.util.Scanner;
public class B_ValorAbsolut {
    public static Scanner lect;
    private static int absolute (int a){
        int absolute = Math.abs(a);
        return absolute;
    }
    public static void main (String[] args){
        lect = new Scanner(System.in);
        System.out.print("Introdueix un número: ");
        int x = lect.nextInt();
        System.out.println("El numero absolut és: " + absolute(x));
    }
}
// M A L D O 