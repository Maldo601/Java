package J_Functions;
import java.util.Arrays;
import java.util.Scanner;

public class K_OrdenarEnters {
    public static Scanner lect;
    static int[] ordenaTres(int n1, int n2, int n3) {
        int [] a = new int[3];
            a[0] += n1; 
            a[1] += n2; 
            a[2] += n3;
        Arrays.sort(a);
        return a;
    }
    public static void main (String[] args){
        
        System.out.println(Arrays.toString(ordenaTres(23,32,12)));
    }
}
// Joan Marc Maldonado ,.