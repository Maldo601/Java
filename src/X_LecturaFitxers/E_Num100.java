package X_LecturaFitxers;
import java.io.*;
public class E_Num100 {
    public static void main(String[] args){
        int counter = 0;
        File f = new File("Numeros1000.txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))){
                for(int i = 1; i <= 100; i++){
                    int x = (int)(Math.random()*1000) + 0;
                    counter++;
                    bw.write(String.format("%5d\t",x));
                    if (i%10 == 0){
                        bw.newLine();
                    }
                }
            }catch ( Exception ex ) {
                System.out.println(ex.getMessage());
        }
        System.out.println("\nImpresos " + counter + " resultats a " + f );
    }
}
