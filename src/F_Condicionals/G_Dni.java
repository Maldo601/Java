package F_Condicionals;
import java.util.Scanner;
public class G_Dni {
    public static Scanner lect;
    public static void main (String[] args) {
        lect = new Scanner(System.in);
        System.out.print("\n\t\033[34mIntrodueix el teu DNI: \u001B[0m");
        // String per verificar lletres.
        String lletres = "TRWAGMYFPDXBNJZSQVHLCKE";
        // Lectura del DNI
        String dni = lect.nextLine();
        String nif = dni.substring(0,8);          
        // Condicionals
        if ( dni.length() < 9 || dni.length() > 9)
            System.out.println("\t\033[31mError en la llargaria del DNI. Has introduit \u001B[0m" + dni.length() + " \033[31mcaracters");
            else if (nif.matches("[0-9]*"))
            System.out.println("\t\033[32mEls 8 digits son un número i són: \u001B[0m" + nif);
            else 
            System.out.println("\t\033[31mNIF Incorrecte. Error especificant els 8 digits de la part numèrica");

        if (lletres.contains(dni.substring(dni.length()-1).toUpperCase())){
            int validDni = Integer.parseInt(dni.substring(0,8));
                 lletres = lletres.substring(validDni%23, validDni%23+1);
                 System.out.println("\t\033[32mNIF Correcte: \033[37m" + nif +
                                    "\n\t\033[33mNIF Lletra  : \u001B[0m" + lletres +
                                    "\n\t\033[33mPertany a una persona fisica.\u001B[0m" + "\n");
        }else
            System.out.println("\t\033[31mNIF Incorrecte. Aquest NIF no pertany a una persona fisica.\n");
            //System.out.println("Lletra vàlida, has introduit la: " + dni.charAt(8));
            //else
            //System.out.println("Lletra invalida, has introduit la: " + dni.charAt(8));
    }
}   