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
    static boolean consecutiu (int n){

        return true;
    }
    public static void main (String[] args){
        lect = new Scanner(System.in);
        System.out.print("\n\tIntrodueix un enter: ");
        int enter = lect.nextInt();
        System.out.println(consecutiu(enter));
    }
}
