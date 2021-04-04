package P_FuncionsII;

public class G_StringSeparada {
    static String separaStr (String str, String sep){
        String cad = "";
        for (int i = 0; i < str.length(); i++)
            cad += str.charAt(i) + sep;
            
        return cad.substring(0, cad.length()-2);
    }
    public static void main (String[] args){
        System.out.println(separaStr("Hola", "--"));
    }
}
// Joan Marc Maldonado 