package L_Opcionals;
import java.util.*;
public class A_Veins {
    static boolean satisfa(List<String> veins) {
        /* Forma Comprimida: 
        if (
            veins.get(4).equals("Dale") && 
            veins.get(3).equals("Cora") && 
            veins.get(2).equals("Adam") && 
            veins.get(1).equals("Bill") && 
            veins.get(0).equals("Erin")){
                System.out.print(veins);
                return true;
            }
        */
        if( !veins.get(4).equals("Adam") && !veins.get(4).equals("Cora") &&
            !veins.get(0).equals("Bill") && !veins.get(0).equals("Cora") && 
            // Partint de que CORA no pot estar a sobre de Bill ni a sota de forma adjunta
            // i que Dale ha d'estar per damunt de Bill
            // s'entén que Cora tampoc pot estar a la posició 1, ja que Bill, si Cora ocupés la 1, estaria a 3 per força
            // ja que per sobre d'ell estaria Dale. No obstant, Erin, no pot estar al costat de "Cora", per tant 
            // Si Erin estés a 0, cora tampoc pot estar a la posició 1. Amb la nova situació tampoc pot estar a 2
            // ja que per la seva politica de rebuig lateral a Bill i a Erin, no es pot situar al mig del Vector. 
            // Es a dir, esta tia no pot ocupar ni la 0, ni la 1, ni la 2 ni la 4.
            // Per tant, després d'això sabem que Bill no pot estar a 4 ( necessita per damunt a Dale)
            // ni pot estar a 2.  
            veins.get(3).equals("Cora") && !veins.get(2).equals("Bill") && !veins.get(4).equals("Bill") &&
            // Amb això també tindrem present que "Erin" tampoc pot estar al costat de 3. Es a dir, ni 4
            // ni 2. 
            !veins.get(4).equals("Erin") && !veins.get(2).equals("Erin")){
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
