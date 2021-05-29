package X_LecturaFitxers;
import java.io.*;
// import java.util.Arrays;
public class I_SeparaHerois {
    public static void main(String[] args) throws IOException{
        String c;
        int i = 0;
        int x = 0;
        // Lo siento, soy fan de los vectores.
        String superHeroes[] = new String[434];
        String dolents[] = new String[683];
        // File f = new File("Superherois.txt");
        try(InputStreamReader fr = new InputStreamReader(new FileInputStream(args[0]), "UTF-8")){
            BufferedReader bRead = new BufferedReader(fr);
            while((c = bRead.readLine()) != null){
                if(c.contains("s") || c.contains("S"))
                    superHeroes[i++] = c;
                else
                    dolents[x++] = c;
                }
            }
        File f = new File("Superherois.txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))){
            for(int n = 0; n < superHeroes.length; n++){  
                    bw.write(String.format("%3s\n",superHeroes[n]));
            }
        }
        File fa = new File("Dolents.txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fa))){
            for(int n = 0; n < superHeroes.length; n++){  
                    bw.write(String.format("%3s\n",dolents[n]));
            }
        }
    }
}
    

