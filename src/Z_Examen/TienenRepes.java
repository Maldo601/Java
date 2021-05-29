package Z_Examen;
import java.io.*;
public class TienenRepes {
    static String note ="";

       
    
    public static void main (String[] args) throws IOException{
       
        String c; 

        try(FileReader fr = new FileReader(args[0])){
            BufferedReader bRead = new BufferedReader(fr);
  
            while((c = bRead.readLine()) != null){
                note = c;
                note = c.replaceAll("[a-zA-Z]", "");
                try (PrintWriter writer = new PrintWriter(args[1]);){
                    for ( int a = 0; a < 9; a++){
                        if(note.equals(String.valueOf(a) + "" + String.valueOf(a)) || note.equals(String.valueOf(a) + "" + String.valueOf(a) + "" + String.valueOf(a)) || note.equals(String.valueOf(a) + "" + String.valueOf(a) + "" + String.valueOf(a) + "" +String.valueOf(a))||
                           note.equals("-"+String.valueOf(a) +""+String.valueOf(a)) || note.equals("-"+String.valueOf(a) +""+String.valueOf(a) +""+String.valueOf(a))||note.equals("-"+String.valueOf(a) +""+String.valueOf(a) +""+String.valueOf(a)+""+String.valueOf(a))){
                                writer.printf("%-3s\n",note);
                           }

                    }
                } 
            }
        }
    }
}

        
    


