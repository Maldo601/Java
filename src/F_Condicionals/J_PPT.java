package F_Condicionals;
import java.util.Scanner;
public class J_PPT {
    public static Scanner random;
    public static void main (String[] args) {
        random = new Scanner(System.in);
        // Vector        0         1         2
        String v[] = {"papel", "tijeras", "piedra"};
        // Generem un valor random de l'Array
        String maq = v[(int)(Math.random()*3)];
        System.out.print("\n\t\u001B[33mIntroduce piedra papel o tijeras: \u001B[37m");
        String user = random.nextLine();
        // Condicionales
        if (maq.equals(user))
        System.out.println("\n\t\u001B[33mEmpate" + "\n");
        else if (maq.equalsIgnoreCase(v[2]) && user.equalsIgnoreCase(v[1]))
            System.out.println("\n\t\u001B[31mHa guanyat la maquina tirant \u001B[37m"+ maq + "\n");
        else if (maq.equalsIgnoreCase(v[0]) && user.equalsIgnoreCase(v[2]))
            System.out.println("\n\t\u001B[31mHa guanyat la maquina tirant \u001B[37m"+ maq + "\n");
        else if (maq.equalsIgnoreCase(v[1]) && user.equalsIgnoreCase(v[0]))
            System.out.println("\n\t\u001B[31mHa guanyat la maquina tirant \u001B[37m"+ maq + "\n");
        else        
            System.out.println("\n\tHa guanyat l'usuari, la maquina ha tirat \u001B[37m"+ maq + "\n");
    }
}
// MALDO // 