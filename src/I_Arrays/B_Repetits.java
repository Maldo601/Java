package I_Arrays;
import java.util.Arrays;
import java.util.Scanner;
/*
    * Joan Marc Maldonado
    * - El codi conté prints descomentables per
    * - executar proves o llistar.
*/
public class B_Repetits {
    public static Scanner lect;
    public static void main(String[] args) {
        lect = new Scanner(System.in);
        // Variables, Arrays i counters.
        int counter = 0;
        int counter2 = 0;
        int v[] = new int[10]; // Long. resultats.
        int list[] = new int[11];
        System.out.println("Volcant resultats ...");
        // Main Loop
            for (int i=0; i < v.length; i++)
            {
                v[i] = (int) (Math.random() * 10+1);    
                counter++;
            }
            // Ordenació ascendent.
            Arrays.sort(v);
            System.out.print("Vols llistar els valors ordenats? (Y/N): ");
            String lec = lect.nextLine();
            if (lec.equals("Y"))
            {
                // Bucle Print
                for (int i=0; i < v.length; i++)
                {
                System.out.println(v[i]);
                }
                System.out.println("S'han volcat " + counter + " resultats");
            }
            else if (lec.equals("N"))
            //System.out.println(v[Insertar index per veure valor]); 
            System.out.println("S'han volcat " + counter + " resultats");
            else{
            System.out.println("Error. Introdueix Yes (Y) o No (N)");
            }
            for (int i=0;i<v.length; i++){
                list[v[i]] += 1;
            }
            for (int j=1;j<list.length;j++){
                if(list[j] != 0 && list [j] !=1)
                System.out.println("Num: " +j+":"+list[j]+" veces");
            }        
        }
    }
