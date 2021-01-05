package I_Arrays;
import java.util.Arrays;
import java.util.Scanner;
/*
    * - Joan Marc Maldonado Negre
    *-  1er DAW G2
    *-  Instruccions:
        - Modificar l'Array de "max resultats".
*/
public class B_Repetits {
    public static Scanner lect;
    public static void main(String[] args) {
        // Timer & Scanner.
        long initTime, endTime, time;
        lect = new Scanner(System.in);
        // Counters.
        int counter = 0;                    
        int counter2 = 0;
        // Array max resultats.
        int v[] = new int[(int) 10e5];       
        int list[] = new int[(int) (10e6+1)]; // Array auxiliar, aquest tamany correspon als resultats possibles de Random.
        System.out.println("Volcant resultats ...");
        /* Loop de replenament.
            Omple v[] de numeros aleatoris mentre "i" sigui mes petit que la llargaria del vector. 
            Un contador compta voltes, per tirar la quantitat volcada de resultats per terminal, 
            al bucle print del primer condicional.
        */
            for (int i=0; i < v.length; i++)
            {
                v[i] = (int) (Math.random() * (10e6-1)+1);    
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
            // Bucle d'Arrays amb Array auxiliar que te la funció de counter.
            /*
                Aquest bucle conté l'Array auxiliar i, dintre d'aquest, el principal
                amb els resultats ordenats. Això fa que cada vegada que s'adelante
                una posició de lectura a v[] amb el cicle del bucle, s'anoti com un counter++
                un +1 al INDEX del bucle auxiliar. Es a dir, per més que tinguem a v[], 3 repetits de valor 2,
                als index 0, 1, 2, el valor 2 serà la posició del index de list[] incrementada en funció a la
                quantitat de repetits trobats a v[].
                Es pot comprobar amb el debugger de VSCode mes facilment si introduim un array de 10 posicions amb 
                una aleatorietat del 1 al 10. 
            */
            initTime = System.currentTimeMillis(); // Inici del Timer.
            for (int i=0;i<v.length; i++)
            {
                list[v[i]] += 1;
            }
            // Bucle print II & Filtro
            /*
                Aquest bucle s'encarrega de filtrar i imprimir els resultats repetits trobats.
                Simplement, evita treure per pantalla els resultats del array comptador que 
                siguin 0 i 1. Entenent que que sincrementi una valor al array auxiliar, es sinonim
                de que el numero ha estat localitzat 1 vegada. 
            */
            for (int j=1;j<list.length;j++)
            {
                if(list[j] != 0 && list [j] !=1)
                {
                System.out.println("Numero: " +j+": s'ha repetit "+list[j]+" vegades");
                counter2++;
                }
            }
            endTime = System.currentTimeMillis();
            time = endTime - initTime;  
            System.out.println("Quantitat de repetits: "+counter2);
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
