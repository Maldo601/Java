package X_LecturaFitxers;
import java.io.*;
public class D_Taula {
    public static void main (String[] args){
        File f = new File("TaulaMultiplicar.txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))){
            for(int k = 0; k < 1; k++){
                for (int i = 0; i <= 10; i++){
                    bw.newLine();
                    for (int n = 0; n < 5; n++){
                        bw.write(String.format("%-3s%-3s%-3s%-3s%-3s\t",n, "x", i, "=", n*i));
                    }
                }
                bw.newLine();
            }
            for(int k = 0; k < 1; k++){
                for (int i = 0; i <= 10; i++){
                    bw.newLine();
                    for (int n = 5; n < 10; n++){
                        bw.write(String.format("%-3s%-3s%-3s%-3s%-3s\t",n, "x", i, "=", n*i));
                    }
                }
                bw.newLine();
            }
        }
        catch (Exception ex) {
            // Escrivim el missatge d'error del sistema
            System.out.println(ex.getMessage());
        }
    }
}