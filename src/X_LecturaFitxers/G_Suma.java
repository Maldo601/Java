package X_LecturaFitxers;
import java.io.*;

public class G_Suma {
    static int k = 0;
    public static void main(String[] args){
        
        String c;
        String note = "";
        try(FileReader fr = new FileReader(args[0])){
            BufferedReader bRead = new BufferedReader(fr);
            while((c = bRead.readLine()) != null){
                for (int x = 0; x < c.length(); x++){
                    if(String.valueOf(c.charAt(x)).equals(" ")){
                        
                        k += Integer.parseInt(note);
                        note = "0";
                    }else{
                        note += c.charAt(x);
                    }
                }
                k += Integer.parseInt(note);
                note = "0";
            }       
        }catch(Exception e){
            e.getStackTrace();
        }
        System.out.println(k);
    }
    
}
