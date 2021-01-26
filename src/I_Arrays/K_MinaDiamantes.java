package I_Arrays;
import java.util.Scanner;
public class K_MinaDiamantes {
   public static Scanner lect;
   public static void main (String[] args){
       lect = new Scanner(System.in);
    System.out.print("Programa per a comptar els diamants <> d'una mina...");
    System.out.print("De quina dimensió vols que sigui el vector que simula la mina: ");
    int dim = lect.nextInt();
    // Generem un vector amb valors aleatoris > o <
    char [] minaDiamants = new char [dim];
    char [] cad = {'<','>'};
    for (int i=0;i<minaDiamants.length;i++) {
            // Generem un valor aleatori entre 0 i 1 i omplim el vector amb > o <
            minaDiamants[i] = cad[(int)(Math.random()*2)];
            System.out.print(minaDiamants[i]);
    }
    System.out.println();
    // Amb els vectors de caràcters es pot mostrar tot el vector de cop també
    // System.out.println(minaDiamants);

    // Busquem diamants
    int diamants=0;
    // Recorregut buscant diamants
    for (int i=1;i<minaDiamants.length;i++) {
            // Generem un valor aleatori entre 0 i 1 i omplim el vector amb > o <
            if (minaDiamants[i] == '>' ) {
                    if (minaDiamants[i-1] == '<') {
                        diamants++;
                    }
                    // Incrementem la i perquè amb el següent '>' no pot formar un diamant
                    i++;
            }
    }
    System.out.println("S'han trobat: "+diamants+" diamants");
   } 
}
