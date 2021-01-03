package G_Aleatorietat;
public class D_RandomWords {
    // Bucle dintre de bucle que tira 5 resultats.
    public static void main (String[] args){
    int y = 1;
    for (y = 1; y <= 4; y++){
    // He usat bucles per no duplicar codi i per optimització.
        int x =1;
        // Bucle
        for (x = 1; x <= 4; x++){
            String abc = "AAAAABCÇDEEEEEFGHIIIIIJKLMNOOOOOPQRSTUUUUUVWXYZ"; //47
            int lletra = (int) (abc.length() * Math.random());
            char a = abc.charAt(lletra);
            System.out.print("\u001B[36m"+a);   
        } 
        System.out.println("");
        }
    }
}
// Convencional
/*
int x = 0;
    x = (int) (Math.random() * abc.length());
char letter = abc.charAt(x);
    System.out.print(letter);
    x = (int) (Math.random() * abc.length());
char letter = abc.charAt(x);
    System.out.print(letter);
    x = (int) (Math.random() * abc.length());
char letter = abc.charAt(x);
    System.out.print(letter);
    x = (int) (Math.random() * abc.length());
char letter = abc.charAt(x);
    System.out.print(letter);
*/