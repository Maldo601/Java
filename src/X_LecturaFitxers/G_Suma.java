package X_LecturaFitxers;
import java.io.*;
public class G_Suma {
    public static void main(String[] args){
        String c; int i = 0;
        String note = "";
        try(FileReader fr = new FileReader(args[0])){
            BufferedReader bRead = new BufferedReader(fr);
            while((c = bRead.readLine()) != null){
                note = c;
                note = c.replaceAll("[a-zA-Z]", "0");
                i += Integer.parseInt(note);
                System.out.println(i);
            }       
        }catch(Exception e){
            e.getStackTrace();
        }
        System.out.println(i);
    }
}
