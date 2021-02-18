package K_FuncionsClase;
import java.util.Scanner;
public class F_BoleanAeiou {
    public static Scanner lect;
    public static String voc (Boolean bool) {
        if (bool == true)
        return "AEIOU";
        else 
        return "aeiou";
    
    }
    public static void main (String[] args){
        lect = new Scanner(System.in);
        Boolean bool = lect.nextBoolean();

        System.out.println(voc(bool));
    }
}
// Joan Marc Maldonado Negre