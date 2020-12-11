package F_Condicionals;

import java.util.Scanner;
public class G_Dni {
    public static Scanner lect;
    public static void main (String[] args) {
        lect = new Scanner(System.in);
        System.out.print("Introdueix el teu DNI: ");
        // String per verificar lletres.
        String lletres = "TRWAGMYFPDXBNJZSQVHLCKE";
        // Lectura del DNI
        String dni = lect.nextLine();
        String nif = dni.substring(0,8);
            
        // Condicionals
        if ( dni.length() < 9 || dni.length() > 9)
            System.out.println("Error en la llargaria del DNI. Has introduit " + dni.length() + " caracters");
            else if (nif.matches("[0-9]*"))
            System.out.println("Els 8 digits son un número i són: " + nif);
            else 
            System.out.println("NIF Incorrecte. Error especificant els 8 digits de la part numèrica");
        
        if (lletres.contains(dni.substring(dni.length()-1).toUpperCase())){
            int validDni = Integer.parseInt(dni.substring(0,8));
                 lletres = lletres.substring(validDni%23, validDni%23+1);
                 System.out.println("NIF Correcte: " + nif +
                                    "\nNIF Lletra  : " + lletres +
                                    "\nPertany a una persona fisica.");
        }else
            System.out.println("NIF Incorrecte. Aquest NIF no pertany a una persona fisica.");
        
            //System.out.println("Lletra vàlida, has introduit la: " + dni.charAt(8));
            //else
            //System.out.println("Lletra invalida, has introduit la: " + dni.charAt(8));
    }
}   