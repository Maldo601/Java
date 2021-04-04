package P_FuncionsII;

public class I_Explanada {
    static String explanada (int n){
        String cad = "=()";
        String str = "";
        for (int i = 0; i < n; i++){
             int num = (int) (Math.random() * cad.length());
             str += String.valueOf(cad.charAt(num));
        }
        return str;
    }
    public static void main (String[ ] args){
        System.out.println(explanada(8));
    }
}
