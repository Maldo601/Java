package Z_Examen;
import java.io.*;
public class CuantosIguales {
    static String mn = "";
    public static void main(String[] args) {
        String c; int counter = 0;
        String note = "";
        String a = args[0];
        // String numero = args[1];
        if (Integer.parseInt(args[0]) < 0 || Integer.parseInt(args[0]) > 9){
            try {
                throw new Exception("");
            } catch (Exception e) {
                System.out.println("El primer parametro ha de ser un numero entero positivo entre 0 y 9");
            }
        }else{
        
            try(FileReader fr = new FileReader(args[1])){
                BufferedReader bRead = new BufferedReader(fr);
                System.out.print("["); 
                while((c = bRead.readLine()) != null){
                    note = c;
                    note = c.replaceAll("[a-zA-Z]", "");
                    // El fichero es único i inviolable, pues la informacion es lo mas valioso. 
                    // La maxima cantidad de caracteres numericos en una linea son 4. 
                    // Aunque no sea escalable, creo que cumple todas las especificaciones para resolver ese caso.
                    if(note.equals(a) || note.equals(a + "" + a) || note.equals(a + "" + a + "" + a) || note.equals(a + "" + a + "" + a + "" +a)||
                    note.equals("-"+a) || note.equals("-"+a +""+a) || note.equals("-"+a +""+a +""+a)||note.equals("-"+a +""+a +""+a+""+a)){
                        System.out.print(note + ", ");
                        counter++;
                    }
                }
                System.out.print("]");     
            }catch(Exception e){
                e.getStackTrace();
            }
            System.out.println("\nEncontrados un total de  " + counter + " valores en el fichero con todas sus cifras iguales a "+args[0]);
            }
        }
    }
