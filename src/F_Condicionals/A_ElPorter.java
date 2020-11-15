package F_Condicionals;

import java.util.Scanner;

public class A_ElPorter {
    public static Scanner port;
    public static void main(String[] args) {
        port = new Scanner(System.in);
        // Welcome Message.
        System.out.print("\n\t\u001B[36mHola sóc el porter de la discoteca." + "\n\tQuina edat tens?: \u001B[0m");
        // Variable almacenadora.
        byte age = port.nextByte();
        // Outputs amb Operador Ternari
        System.out.println(age >= 18 
                            ? "\n\t\u001B[32mEts major d'edat, passa.\n" 
                            : "\n\t\u001B[31mEts menor d'edat, no pots passar.\n");
    }
}
// _ M A L D O _





