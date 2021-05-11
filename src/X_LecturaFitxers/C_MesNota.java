package X_LecturaFitxers;
import java.io.*;
import java.util.Arrays;

public class C_MesNota {
    static boolean file = true;
    static boolean score = true;
    static Double sc;
    static Double v[];
    static int counter = 0;
    static void validFormat(String[] args){
        if (args.length != 2){
            System.out.println("Programa per llegir notes d'Alumnes. " + 
                               "Siusplau, passa una nota com argument. ");
        }
        try (FileReader fr = new FileReader(args[0])){  }
        catch (Exception e) {
            System.out.println("Fitxer Desconegut");
            file = false;
        }
        try{
            if (Double.parseDouble(args[1]) > 10 || Double.parseDouble(args[1]) <  0)
                throw new Exception("");
        }
        catch(Exception e){
            System.out.println("Nota invàlida. Escriu una nota entre 0 i 10");
            score = false;
        }
    }
    
    static void extracter(String[] args){
        String c;
        String note = "";
        try(FileReader fr = new FileReader(args[0])){
            BufferedReader bRead = new BufferedReader(fr);
                while((c = bRead.readLine()) != null){
                    counter++;
                }
        }catch (Exception e) {
            System.out.println("Error indefinit.");
        }
        v = new Double[counter];
        int cnt = 0;
        try(FileReader fr = new FileReader(args[0])){
            BufferedReader bRead = new BufferedReader(fr);
                while((c = bRead.readLine()) != null){
                    note = c.substring(c.length()-4, c.length());
                    note = note.replace(",", ".");
                    note = note.replace(" ", "");
                    note = note.replaceAll("[^0-9+.]", "0");
                    v[cnt++] = Double.parseDouble(note);
                }
        }catch(Exception e){
            System.out.println("Error indefinit.");
        }
        for (int i = 0; i < v.length; i++){
            if (Double.parseDouble(args[1]) >= v[i]){
                
            }
        }
    }

    public static void main (String[] args){
        validFormat(args);
        if (file && score == true){
            extracter(args);
        }
    }
}
    

