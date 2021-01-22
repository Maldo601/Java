package F_Condicionals;
import java.util.Scanner;
public class I_Triangles {
    public static Scanner random;
      public static void main (String[] args) {
        random = new Scanner(System.in);
        long x,y,z;
        System.out.print("\n\t\u001B[36mIntrodueix x: \u001B[37m");
        x = random.nextLong();
        System.out.print("\t\u001B[36mIntrodueix y: \u001B[37m");
        y = random.nextLong();
        System.out.print("\t\u001B[36mIntrodueix z: \u001B[37m");
        z = random.nextLong();
        // Tipus
        if ( (x == 0 || y == 0 || z == 0 ) || ( x + y <= z) )
        System.out.println("\n\t\u001B[31mError, no es pot formar un triangle amb aquests valors.");
            else if ((x == y) && ( x == z) && (y == z) )
            System.out.println("\n\t\u001B[32mEl triangle és Equilater");
            else if ((x == y) && (x != z) && (y != z)) 
                System.out.println("\n\t\u001B[32mEl triangle és Isoceles");
            else
                System.out.println("\n\t\u001B[32mEl triangle és Escalè");
        // Rectangle
        if ( (x == 0 || y == 0 || z == 0 ) || ( x + y <= z) )
            System.out.println("\t\u001B[31mError al determinar la rectangularitat." + "\n");
            else if ( x + y == z*2 || x + z == y*2 || y+z == x*2 )
            System.out.print("\t\u001B[32mEl triangle és rectangle." + "\n");
            else
            System.out.println("\t\u001B[31mEl triangle no és rectangle." + "\n");
    }
}
// _ M A L D O _ // 
