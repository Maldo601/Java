import java.io.*;
import java.util.Arrays;

public class B_Primers100k {
    public static void main (String[] args){

        long interval = System.currentTimeMillis();
        BufferedReader bRead = null;
        String fichero = "primes-to-100k.txt";
        int linies = 0;
        String c;
        int counter = 0;
        long v[] = new long[9592];
            try {
                bRead = new BufferedReader
                (
                    new FileReader("C:/Users/maldo/Desktop/Java/src/X_LecturaFitxers/Ficheros/primes-to-100k.txt")
                );
                while((c = bRead.readLine()) != null){
                    v[counter] = Integer.parseInt(c);
                    counter++;
                }
            }catch(Exception e){
                System.out.println("blabla");
            }
            System.out.println(Arrays.toString(v));
        }
    }

