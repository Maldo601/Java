package K_FuncionsClase;
import java.util.Scanner;
public class D_RealArrodonitEnter {
    public static Scanner lect;
    public static int roundReals(double a){
        int roundReals = (int) Math.round(a);
        return roundReals;
    }
    public static void main (String[] args){
        lect = new Scanner(System.in);
        System.out.println("Introdueix un número: ");
        double x = lect.nextDouble();
        System.out.println(roundReals(x));
    }
}
// M A L D O 
/* 
DOSSIER : 
    static int aleatori(int min, int max){
        int aux;
        if (min > max ){
            aux = min;
            min = max;
            max = aux;
        }
    return (int) Math.random() * 
    } 
*/