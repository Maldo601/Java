package J_Functions;
import java.util.Arrays;
public class E_PermutarVector {
    
    public static void main(String[] args){
        int v[] = {10,20};
        System.out.println("Vector abans: " + Arrays.toString(v));
        permutar(v);
        System.out.println("Vector després: " + Arrays.toString(v));
    }
    public static void permutar(int v[]){
        int aux = v[0];
        v[0] = v[1];
        v[1] = aux;
    }
}
// MALDO // 