package F_Condicionals;

import java.util.Scanner;

public class A_ElPorter {
    public static Scanner port;

    public static void main(String[] args) {
        port = new Scanner(System.in);
        // Welcome Message.
        System.out.print("\tHola sóc el porter de la discoteca." + "\n\tQuina edat tens?: ");
        byte age = port.nextByte();
        // Output amb Operador Ternari
        System.out.println(age >= 18 ? "Ets major d'edat, passa." : "Ets menor d'edat, no pots passar.");

    }
}