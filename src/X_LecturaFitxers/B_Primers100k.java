import java.io.*;
import java.util.Arrays;
public class B_Primers100k {
    public static void main (String[] args){
        // long interval = System.currentTimeMillis();
        BufferedReader bRead = null;
        // BufferedReader zRead = null;
        // String fichero = "primes-to-100k.txt";
        int linies = 0;
        String c;
        int counter = 0;
            // Primer try, conta linies per determinar la longitud del vector
            try {
                // Buffer
                bRead = new BufferedReader
                (
                    new FileReader("C:/Users/maldo/Desktop/Java/src/X_LecturaFitxers/Ficheros/primes-to-100k.txt")
                );
                while((c = bRead.readLine()) != null)
                    linies++;
                /*
                 * Es tanca el buffer perque el punter ha arribat al final i necessitarem
                 * reoperar amb ell per introduir al vector els valors, tornant el punter al principi
                 */ 
                bRead.close();
            }catch(Exception e){
                System.out.println("Error.");
            }
            // Vector de Sortida.
            long v[] = new long [linies];
            try{
                bRead = new BufferedReader
                (
                    new FileReader("C:/Users/maldo/Desktop/Java/src/X_LecturaFitxers/Ficheros/primes-to-100k.txt")
                );
                while((c = bRead.readLine()) != null){
                    v[counter] = Integer.parseInt(c);
                    counter++;
                }
            }catch (Exception e){
                System.out.println("blabla");
            }finally{
                System.out.println(Arrays.toString(v));
            }
        }
    }
