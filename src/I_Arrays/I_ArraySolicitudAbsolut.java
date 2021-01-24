package I_Arrays;
import java.util.Scanner;
public class I_ArraySolicitudAbsolut {
    public static Scanner lect;
    public static void main (String[] args){
        lect = new Scanner(System.in);
        int v[] = new int[150];
        int userInt;
        int counter = 0;
        // BUCLE DO - WHILE 
        do {
        System.out.print("Siusplau, introdueix un número entre el 0 i el 150: ");
        userInt = lect.nextInt();
            if (userInt > 150 || userInt < 0)
            System.out.println("Llegeix bé perfavor, puc seguir així infinitament.");
            else
            System.out.println("Loading ...");
        }
        while(userInt < 0 || userInt > 150); 
            for ( int x = 0; x < v.length; x++) {
                  v[x] = (int) (Math.random() * (-100-100)+100);
                  if (userInt == Math.abs(v[x]))
                    counter++;
            }
        System.out.println("S'ha trobat el valor [" + userInt + "] " + counter + " vegades, absolutament.");
    }
}
// M A L D O // 
