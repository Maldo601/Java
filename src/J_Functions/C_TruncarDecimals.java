package J_Functions;
import java.util.Scanner;
public class C_TruncarDecimals {
    public static Scanner lect;
    public static void main (String[] args){
        lect = new Scanner(System.in);
        System.out.print("\n\tIntrodueix un decimal (amb coma): ");
        double x = lect.nextDouble();
        System.out.print("\tDecimal truncat a enter: " + trunca(x) + "\n");
    }
    static int trunca(double x){
        return (int) x;
    }
}
