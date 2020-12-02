package RANDOM;
// ARRAYS 
import java.util.Scanner;
public class random1 {
    public static Scanner lect;
    public static void main (String[] args) {
        lect = new Scanner(System.in);
        // Variables
        String l = lect.nextLine();
        // String [] vocales = { "A", "E", "I", "O","U" };
        // Condicionals
        if ( l.equals("A") || l.equals("E") || l.equals("I") || l.equals("O") || l.equals("U") )
            System.out.println("La lletra "+ l + " ... es majuscula i vocal.");
            else if ( l.equals ("a") || l.equals("e") || l.equals("i") || l.equals("o") || l.equals("u"))
            System.out.println("La lletra "+ l + " ... es minuscula i vocal");
            else if ( l.equals("Z"))
            System.out.println("La lletra "+ l + " ...es la ultima lletra i mayuscula");
            else if (l.equals("z"))
            System.out.println("La lletra "+ l + " ...es la ultima lletra i minuscula ");
        else
        System.out.println( "La lletra "+ l + " ...No entra dintre els meus parametres.");
 
    }
}
// MALDO // 
/*
String [] vocales = { "A", "E", "I", "O","U" };












*/