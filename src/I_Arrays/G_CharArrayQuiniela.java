package I_Arrays;
import java.util.Arrays;
public class G_CharArrayQuiniela {
    public static void main (String[] args){
        char v[] = new char[15];
        String cad = "1111111XX2"; 
        for (int i = 0; i < v.length; i++){
            int num = (int) (Math.random() * cad.length());
            char lletra = cad.charAt(num);
            v[i] = lletra;  
        }
        System.out.println("\n\t" + Arrays.toString(v));
    }
}
// M A L D O // 


