package I_Arrays;
import java.util.Scanner;
public class A_ReinaAlfil {
    public static Scanner lect;
    public static void main (String[] args){
        lect = new Scanner(System.in);
        boolean v[][] = new boolean[3][3];
        System.out.print("\t\033[33mPosicio de la reina: \u001B[0m");
        int rX = lect.nextInt();
        int rY = lect.nextInt();
        System.out.print("\t\033[33mPosicio de alfil: \u001B[0m");
        int aX = lect.nextInt();
        int aY = lect.nextInt();
        
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[0].length; j++) {
                
                System.out.print("\t" + v[i][j] +" ");
            }
            System.out.println("\n");
        }
        
    }
}
