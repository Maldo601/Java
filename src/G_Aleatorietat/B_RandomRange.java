package G_Aleatorietat;

public class B_RandomRange {
    public static void main(String[] args){
        // Variables del rang   
        byte n = -3;
        byte x = 5;
        // Cast int ( Random torna double ). 
        System.out.println("\n\t\u001B[33m" + ((byte) (Math.random() * (x-n+1)) + n ) + "\n");
    }
}
// MALDO //