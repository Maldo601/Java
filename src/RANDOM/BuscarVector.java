package RANDOM;
import java.util.Scanner;
import java.util.Arrays;
public class BuscarVector {
    public static Scanner lect;
    public static void main(String[] args){
         // Timer & Scanner.
         long initTime, endTime, time;
         lect = new Scanner(System.in);
         // Counters.
         int counter = 0;                    
         // int counter2 = 0;
         // Array max resultats.
         int v[] = new int[(int) 10000];       
         int list[] = new int[(int) (10e6+1)]; // Array auxiliar, aquest tamany correspon als resultats possibles de Random.
         System.out.println("Volcant resultats ...");
        
             for (int i=0; i < v.length; i++)
             {
                 v[i] = (int) (Math.random() * (1000-500)+500);    
                 counter++;
             }
             // Ordenació ascendent dels valors.
             Arrays.sort(v);
             System.out.print("Vols llistar els valors ordenats? (Y/N): ");
             String lec = lect.nextLine();
             if (lec.equalsIgnoreCase("Y"))
             {
                 // Bucle Print
                 for (int i=0; i < v.length; i++)
                 {
                 System.out.println(v[i]);
                 }
                 System.out.println("S'han volcat " + counter + " resultats");
             }
             else if (lec.equalsIgnoreCase("N"))
             System.out.println("S'han volcat " + counter + " resultats");
             else{
             System.out.println("Error. Introdueix Yes (Y) o No (N)");
             }
             System.out.print("Vols llistar la quantitat de valor repetit? (Y/N): ");
             lec = lect.nextLine();
             if (lec.equalsIgnoreCase("Y"))
             {  
             initTime = System.currentTimeMillis(); // Inici del Timer.
             for (int i=0;i<v.length; i++)
             {
                 list[v[i]] += 1;
             }
             for (int j=800;j<list.length;j=800)
             {
                 if(list[j] != 0 && list [j] !=1)
                 {
                 System.out.println("Numero: " +j+": s'ha repetit "+list[j]+" vegades");
                 //counter2++;
                 }
                 if (j == 800){
                     break;
                 }
                 else
                 continue;
             }
             endTime = System.currentTimeMillis();
             time = endTime - initTime;  
             
             System.out.println("Temps d'execució en localitzar repetits: " + time + " m/s");
             }
             else if (lec.equalsIgnoreCase("N"))
             {
             System.out.println("Adeu.");
             }
             else 
             System.out.println("");
    }
    
}
