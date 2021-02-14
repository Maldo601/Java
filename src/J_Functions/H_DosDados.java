package J_Functions;

public class H_DosDados {
    // Aprofitament de G_Dado.java.
    public static int dosDados(){
        return G_Dado.dado(1,6) + G_Dado.dado(1,6);
    }
    // Partint de 0.
    private static int dadoDotze(int min, int max){
        return (int) (Math.random() * (max - min+1) + min);
    }
    public static void main (String[] args){
        System.out.println(dosDados());
        System.out.println(dadoDotze(2,12));
    }
}
// JOAN MARC MALDONADO 