package X_LecturaFitxers;
import java.io.*;
public class E_Num100 {
    public static void main(String[] args){
        int counter = 0;
        int countLines = 0;
        int longitud = args[0].length()+1;
        File f = new File("Numeros1000.txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))){
                for(int i = 1; i <= 100; i++){
                    int x = (int)(Math.random()*Integer.parseInt(args[0])) + 0;
                    counter++;
                    bw.write(String.format("%"+String.valueOf(longitud)+"d\t",x));
                    if (i%Integer.parseInt(args[2]) == 0){
                        bw.newLine();
                        countLines++;
                    }
                    if(countLines == Integer.parseInt(args[1]))
                        break;
                }
            }catch ( Exception ex ) {
                System.out.println(ex.getMessage());
        }
        System.out.println("\nImpresos " + counter + " resultats a " + f + " en " + countLines + " files." );
    }
}
