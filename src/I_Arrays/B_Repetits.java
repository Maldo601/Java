package I_Arrays;

import java.util.Scanner;
public class B_Repetits {
    public static Scanner lect;

    public static void main (String[] args){
        lect = new Scanner(System.in);
        int matriz[][] = new int[(int) (Math.random()*9+1)][(int) (Math.random()*9+1)];
        
        System.out.print(matriz);
    }
}
