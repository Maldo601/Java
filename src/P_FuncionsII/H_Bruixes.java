package P_FuncionsII;

public class H_Bruixes {
    static boolean hiHaBruixa (String cad){
        return cad.contains("=()=");
    }
    public static void main (String[ ] args){
        System.out.println(hiHaBruixa("=)(="));
    }
}
