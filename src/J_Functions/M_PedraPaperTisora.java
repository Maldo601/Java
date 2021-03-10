package J_Functions;
import java.util.Scanner;
public class M_PedraPaperTisora {
    public static Scanner lect;
    
    public static String maq (String a) {
        String[] v = {"Pedra", "Paper", "Tisora"};
        a = v[(int)(Math.random()*3)];
        return a;
    }
    public static String player (String a){
        return a;
    }
    public static String resultat (String maq, String player){
        if (maq.equals(player))
        System.out.println("\n\tEmpate");
            else if (maq.equals("Pedra") && player.equals("Tisora") )
                System.out.println("\n\tGuanya MAQ tirant " + maq);
            else if (maq.equals("Paper") && player.equals("Pedra"))
                System.out.println("\n\tGuanya MAQ tirant " + maq);
            else if (maq.equals("Tisora") && player.equals("Paper"))
                System.out.println("\n\tGuanya MAQ tirant " + maq);
        else 
        System.out.println("\n\tHa guanyat l'usuari amb: " + player);

        return ""; 
    }
    public static void main(String[] args){
        lect = new Scanner(System.in);
        System.out.print("\n\tPedra, paper o tisora?: ");
        String player = lect.nextLine();
        String maq = maq("");
        System.out.println("\n\n\t\t" + maq + " <--v.S--> " + player);
        System.out.println(resultat(maq,player));
        }
    }
// Joan Marc Maldonado
        
