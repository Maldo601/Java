package T_Examen2;
import java.util.Arrays;
public class Ej1 {
    public static void main (String[] args){
        int v[] = new int[3];

        for (int i = 0; i < 3; i++){
            v[i] = (int) (Math.random()*(300-100)+100);
        }
        Arrays.sort(v);
        System.out.println(Arrays.toString(v));
        if (v[0] != v[1] || v[0] != v[2] || v[1] != v[2]){
        System.out.println("El numero més petit és: " + v[0]);
        System.out.println("El numero més gran és: " + v[2]);
        }
        else 
        System.out.print("Hi ha valors repetits. Reinicia el programa.");
    }  
}
// M A L D O // 
