package G_Aleatorietat;

public class E_RandomCharacters {
    public static void main (String[] args){
        String cad = "1111111XX2";
        int num = (int) (Math.random() * cad.length());
        char lletra=cad.charAt(num);
        System.out.println("\n\t"+lletra+"\n");
    }
}
// MALDO // 