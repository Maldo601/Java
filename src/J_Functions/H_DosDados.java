package J_Functions;

public class H_DosDados {
    // Aprofitament de G_Dado.java.
    public static int dosDados(){
        return G_Dado.dado(1,6) + G_Dado.dado(1,6);
    }
    public static void main (String[] args){
        System.out.println("\n\tResultat: " + dosDados());
    }
}
// JOAN MARC MALDONADO 