package K_FuncionsClase;
import java.util. *;
public class E_CadenaVocal {
    public static Scanner lect;
    public static String vocals(String a){
        return a.toLowerCase();
    }
    public static void main (String[] args){
        lect = new Scanner(System.in);
        System.out.print("Introdueix una cadena: ");
        String cad = lect.nextLine();
        System.out.println(vocals(cad));
    }
}
// Joan Marc 
