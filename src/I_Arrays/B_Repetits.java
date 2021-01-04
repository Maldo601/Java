package I_Arrays;
import java.util.Arrays;
import java.util.Scanner;
/*
    * - Joan Marc Maldonado Negre
    *-  1er DAW G2 
*/
public class B_Repetits {
    public static Scanner lect;
    public static void main(String[] args) {
        lect = new Scanner(System.in);
        // Variables, Arrays i counters.
        int counter = 0;                    // Comptador.
        int counter2 = 0;
        int v[] = new int[(int) 1000000];   // Array max resultats.
        int list[] = new int[(int) (10e7)]; // Array auxiliar.
        System.out.println("Volcant resultats ...");
        /* Main Loop
            Omple v[] de numeros aleatoris. Un contador compta voltes, per tirar la 
            quantitat volcada per terminal, al bucle print del primer condicional.
        */
            for (int i=0; i < v.length; i++)
            {
                v[i] = (int) (Math.random() * 10e6+1);    
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
            System.out.print("Vols llistar la quantitat de valor repetit? (Y/N): ");
            lec = lect.nextLine();
            if (lec.equals("Y"))
            {
            for (int i=0;i<v.length; i++){
                list[v[i]] += 1;
            }
            for (int j=1;j<list.length;j++){
                
                if(list[j] != 0 && list [j] !=1){
                System.out.println("Num: " +j+":"+list[j]+" veces");
                counter2++;
                }
            }  
            System.out.println("Quantitat de repetits: "+counter2); 
            }else
                System.out.println("Adeu");   
        }
    }
