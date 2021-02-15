package F_Condicionals;
import java.util.Scanner;
public class J_PPT {
    public static Scanner random;
    public static void main (String[] args) {
        random = new Scanner(System.in);
        // Vector        0         1         2
        String v[] = {"paper", "tisores", "pedra"};
        // Generem un valor random de l'Array
        String maq = v[(int)(Math.random()*3)];
        System.out.print("\n\t\u001B[33mIntrodueix pedra paper o tisores: \u001B[37m");
        String user = random.nextLine();
        // Main if
        if (user.equals(v[0]) || user.equals(v[1]) || user.equals(v[2]) ) {
            // Sub-condicionals.
            if (maq.equals(user))
            System.out.println("Empat" + "\n");
            else if (maq.equalsIgnoreCase(v[2]) && user.equalsIgnoreCase(v[1]))
            System.out.println("Ha guanyat la maquina tirant "+ maq + "\n");
            else if (maq.equalsIgnoreCase(v[0]) && user.equalsIgnoreCase(v[2]))
            System.out.println("Ha guanyat la maquina tirant "+ maq + "\n");
            else if (maq.equalsIgnoreCase(v[1]) && user.equalsIgnoreCase(v[0]))
            System.out.println("Ha guanyat la maquina tirant "+ maq + "\n");
            else {        
            System.out.println("\n\tHa guanyat l'usuari amb: " + user);
            System.out.println("\n\tLa màquina ha tirat: " + maq + "\n");
            }
        }
        // Error de lectura. 
        else {
            System.out.println("\tSelecció incorrecta. Has introduit: " + user);
        }
    }
}
// MALDO // 


