package L_Opcionals;
import java.util.*;
public class A_Veins {
    // Utilitzant la llibreria proposada, se li passa el vector a un shuffle que desordena fins
    // trobar la combinació única i exacta on tenen que estar els veins. 
    static boolean satisfa(List<String> veins) {
        if (
            veins.get(4).equals("Dale") && 
            veins.get(3).equals("Cora") && 
            veins.get(2).equals("Adam") && 
            veins.get(1).equals("Bill") && 
            veins.get(0).equals("Erin")){
                return true;
            }
        return false;
    }
    public static void main (String[] args){
        int counter = 0;
        List <String> veins = Arrays.asList("Adam","Bill","Cora","Dale","Erin");
        while (!satisfa(veins)){
            Collections.shuffle(veins);
            System.out.println(veins + " --> " +satisfa(veins));
            counter++;
        }
        System.out.println("S'ha mesclat el vector " + counter + " vegades.");
    }
}
// Joan Marc Maldonado
