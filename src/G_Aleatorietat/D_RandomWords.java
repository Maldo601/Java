package G_Aleatorietat;

public class D_RandomWords {
    // Bucle dintre de bucle que tira 5 resultats.
    public static void main (String[] args){
    int y = 1;
    for (y = 1; y <= 4; y++){
    
        int x =1;
        // Bucle
        for (x = 1; x <= 4; x++){
            String abc = "AAAAABCÇDEEEEEFGHIIIIIJKLMNOOOOOPQRSTUUUUUVWXYZ"; //47
            int lletra = (int) (abc.length() * Math.random());
            char a = abc.charAt(lletra);
            System.out.print(a);   
        } 
        System.out.println("");
        }
    }
}
