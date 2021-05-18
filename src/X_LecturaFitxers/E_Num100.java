package X_LecturaFitxers;
import java.io.*;
public class E_Num100 {
    public static void main(String[] args){
        File f = new File("Numeros1000.txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))){
                for(int i = 0; i < 1000; i++){
                    int x = Math.random
                    bw.write(String.format("Valor %3d  =  %5f\n",i, (int)Math.random()*100));
                }
            }catch (Exception ex) {
                System.out.println(ex.getMessage());
        }
    }
}
