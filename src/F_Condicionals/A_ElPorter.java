package F_Condicionals;

import java.util.Scanner;

public class A_ElPorter {
    public static Scanner port;

    public static void main(String[] args) {
        port = new Scanner(System.in);
        // Welcome Message.
        System.out.print("\n\tHola sóc el porter de la discoteca." + "\n\tQuina edat tens?:");
        // Variable almacenadora.
        byte age = port.nextByte();
        // Output amb Operador Ternari
        System.out.println(age >= 18 ? "\n\tEts major d'edat, passa." : "\n\tEts menor d'edat, no pots passar.");
    }
}
// _ M A L D O _
