package X_LecturaFitxers;
import java.io.*;
/**
 * Ejercicio que escribirà en un fichero los numeros del 0 al 50.
 * Uno debajo del otro. 
 */
public class F_ExerciciClase {
    public static void main(String[] args) throws Exception{
        if (args[0].endsWith(".txt")){
            File f = new File(args[0]);
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))){
                for(int i = 0; i <= 50; i++){
                    bw.write(String.format("%-3s\n", i));
                }
            }catch(Exception e){
                System.out.println("Error");
            }
        }else
            throw new Exception("Exception message");
        }
    }

