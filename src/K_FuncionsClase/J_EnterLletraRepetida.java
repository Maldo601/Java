package K_FuncionsClase;
import java.util.Scanner;
public class J_EnterLletraRepetida {
    static Scanner lect;
    static String repite (int n, char letra){
        String total = " ";
        for (int x = 0; x < n; x++){
            total += " " + letra + " ";
        }
        return " " + total;
    }
    static String asteriscos (int x, char c){
        String s = "";
        for (int n = 1; n <= x; n++){
            s += repite(n,c) + "\n";
        }
        return s;
    }
    public static void main (String[] args){
        lect = new Scanner (System.in);
        
        System.out.println(asteriscos(8,'*'));
    }
}
