package K_FuncionsClase;
import java.util. *;
/*
	Funció static boolean consecutiu(int n) que rep un valor enter n i retorna un booleà que val true 
    si n és “consecutiu”, es a dir, si les xifres de n, ordenades i sense repetir-ne cap son consecutives. 
    Per exemple, el 103 no és consecutiu (falta el 2), i el 768976 si que ho és, ja que les xifres que té 6789, 
    son consecutives. Fixeu-vos que podem aprofitar la funció anterior per determinar si n és consecutiu. 
*/
public class N_ConsecutivitatBool {
    static Scanner lect;
    /* Funció auxiliar. Reb l'enter que nosaltres li hem introduit, fa una crida a la classe anterior
       fent passar el nostre enter per el procés d'almacenament a un vector i inversió.
       Amb un arrays sort li desfarem la inversió que li vam fer i li donarem un ordre ascendent
    */
    static boolean retornVector (int n){
        int vector[] = M_XifresVector.vector(M_XifresVector.xifres(n));
        Arrays.sort(vector);
        // System.out.println("\n\t" + Arrays.toString(vector));
        for ( int i = 1; i < vector.length; i++)
            if ( vector[i-1] != vector[i]-1)   
                return false;
        return true;
    }
    public static void main (String[] args){
        lect = new Scanner(System.in);
        System.out.print("\n\tIntrodueix un enter: ");
        int enter = lect.nextInt();
        System.out.println(retornVector(enter));
    }
}
