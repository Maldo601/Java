package X_LecturaFitxers;
import java.io.*;
public class C_MesNota {
    static boolean file = true;
    static boolean score = true;
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

    static void readerDoc(String[] args){
        String c;
        String name = "";
        String note = "";
        double sc;
        try(FileReader fr = new FileReader(args[0])){
            BufferedReader bRead = new BufferedReader(fr);
                while((c = bRead.readLine()) != null){
                    note = c.substring(c.length()-4, c.length());
                    note = note.replace(",", ".");
                    note = note.replace(" ", "");
                    note = note.replaceAll("[^0-9+.]", "");
                    sc = Double.parseDouble(note);
                    // System.out.println(sc); // Checkpoint.
                }  
        }catch(Exception e){
            System.out.println("Error al parsejar. Caracters invalids al fitxer.");
        }
    }
    public static void main (String[] args){
        validFormat(args);
        if (file && score == true){
            readerDoc(args);
        }
    }
}
    

