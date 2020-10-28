package E_ProblemasLogicos;

import java.util.Scanner;

public class B_LaBarbacoa {
    public static Scanner lectb;
    public static void main (String[] args) {
        lectb = new Scanner (System.in);
        // Les respostes de si o no s'entren mitjançant true or false per teclat.
        System.out.println("\n\tBenvingut a la reservadora de barbacoes\n");

        System.out.print("\t\u001B[36mHeu reservat?: \u001B[37m");
        Boolean reserva = lectb.nextBoolean();

        System.out.print("\t\u001B[36mPlou?: \u001B[37m");
        Boolean plou = lectb.nextBoolean();
        
        System.out.print("\t\u001B[36mQuin dia de la setmana és?: \u001B[37m");
        String diaSet = lectb.next();

        System.out.print("\t\u001B[36mQuantes persones sou en total?: \u001B[37m");
        int ppl = lectb.nextInt();

        System.out.print("\t\u001B[36mQuants cotxes porteu?: \u001B[37m");
        int cotxes = lectb.nextInt();

        Boolean viabilitat = reserva && !plou && ppl <= cotxes*5 && (diaSet.equals("Dissabte")||(diaSet.equals("Diumenge")));

        System.out.println("\n\t\u001B[31mAqui tens el resultat de si podràs anar: \u001B[37m" + viabilitat + "\n");
    }
}
