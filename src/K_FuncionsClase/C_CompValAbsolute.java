package K_FuncionsClase;
import java.util.Scanner;
// - Fer una funció que rebi dos valors enters i retorni la diferència (n1 - n2) en valor absolut
public class C_CompValAbsolute {
    public static Scanner lect;
    private static int AbsoluteCompare (int a, int b){
        int AbsoluteCompare = Math.max(Math.abs(a),Math.abs(b));
        return AbsoluteCompare;
    }
    public static void main (String[] args){
        lect = new Scanner(System.in);
        System.out.print("Introdueix n1: ");
        int x = lect.nextInt();
        System.out.print("Introdueix n2: ");
        int y = lect.nextInt();
        System.out.println("El més gran absolutament és: " + AbsoluteCompare(x, y));
    }
}
// M A L D O