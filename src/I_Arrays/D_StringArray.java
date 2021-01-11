package I_Arrays;
import java.util.Scanner;
public class D_StringArray {
    public static Scanner lect;
    public static void main (String[] args){
        lect = new Scanner(System.in);
        // Esta a -1 per agafar l'índex 0 al print. 
        int counter = -1;
        String v[] = new String[10];
        for (int i = 0; i < v.length; i++){
            System.out.print("Introdueix l'element " + i + " del vector: ");
            v[i] = lect.nextLine();
            }
            for ( int x = 0; x < v.length; x++) {
                counter++;
                System.out.println("Element " +"["+counter+"] "+ v[x]);
            }
        }
        }