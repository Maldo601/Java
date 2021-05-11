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
    /*
    Pescar 4 ultimes posicions de la cadena. Parsejarles a Double i tirar error si no se pot parsejar.
    Comparar este valor parsejat en el valor parsejat del arg[1]. De ser mes gran usarem la nota pescada
    com a índex revers per determinar el nom de l'alumne. 
    Comparar el valor double o enter si es corresponent al igual de la cadena real i de ser que si, 
    tirar el nom de la persona. 
    
    */
    static void readerDoc(String[] args){
        String c;
        String name = "";
        String note = "";
        int sc;
        try(FileReader fr = new FileReader(args[0])){
            BufferedReader bRead = new BufferedReader(fr);
                while((c = bRead.readLine()) != null){

                    System.out.println(c);
                }   
        }catch(Exception e){

        }
    }
    public static void main (String[] args){
        validFormat(args);
        if (file && score == true){
            readerDoc(args);
        }
    }
}
    

