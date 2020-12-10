package RANDOM;
import java.util.Scanner;
public class ppt {
    public static Scanner random;
    public static void main (String[] args) {
        random = new Scanner(System.in);
        // Vector        0         1         2
        String v[] = {"papel", "tijeras", "piedra"};
        // Generem un valor random de l'Array
        String maq = v[(int)(Math.random()*3)];
        System.out.print("Introduce piedra papel o tijeras: ");
        String user = random.nextLine();
        // Condicionales
        if (maq.equals(user))
        System.out.println("empate");
        else if (maq.equalsIgnoreCase(v[2]) && user.equalsIgnoreCase(v[1]))
            System.out.println("1 Ha guanyat la maquina tirant "+ maq);
        else if (maq.equalsIgnoreCase(v[0]) && user.equalsIgnoreCase(v[2]))
            System.out.println("2 Ha guanyat la maquina tirant "+ maq);
        else if (maq.equalsIgnoreCase(v[1]) && user.equalsIgnoreCase(v[0]))
            System.out.println("3 Ha guanyat la maquina tirant "+ maq);
        else        
            System.out.println("4 Ha guanyat l'usuari, la maquina ha tirat "+ maq);
    }
}
