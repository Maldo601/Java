package J_Functions;
import java.util.Scanner;
public class N_Triangles {
    public static Scanner lect;
    static String triangle (int x, int y, int z){
        if ( (x == 0 || y == 0 || z == 0 ) || ( x + y <= z) )
        System.out.println("\n\tError, no es pot formar un triangle amb aquests valors.");
            else if ((x == y) && ( x == z) && (y == z) )
            System.out.println("\n\tEl triangle és Equilater");
            else if ((x == y) && (x != z) && (y != z)) 
                System.out.println("\n\tEl triangle és Isoceles");
            else
                System.out.println("\n\tEl triangle és Escalè");
    return "";
    }
    public static void main (String[] args){
        lect = new Scanner(System.in);
        System.out.print("[x]: ");
        int x = lect.nextInt();
        System.out.print("[y]: ");
        int y = lect.nextInt();
        System.out.print("[z]: ");
        int z = lect.nextInt();
        System.out.println(triangle(x, y, z));
    }
}
