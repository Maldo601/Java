package P_FuncionsII;
import java.util.*;
public class L_VectorMilio {
    static double max (double [] v){
        double aux[] = Arrays.copyOf(v, v.length);
        Arrays.sort(aux);
        return aux[aux.length-1];
    }
    static double max_sort(double[] v){
        double max = v[0];
        for (int n = 1; n < v.length; n++){
            if(v[n] > max)
                max = v[n];
        }
        return max;
    }
    public static void main (String [ ] args){
        double [] v = new double [1000000];
        for (int i = 0; i < v.length; i++)
            v[i] = Math.random();
        long time = System.currentTimeMillis();
        double x = max(v);
        System.out.println("Major = " + x + " Temps invertit: " + (System.currentTimeMillis() - time));
        x = max_sort(v);
        System.out.println("Major = " + x + " Temps invertit: " + (System.currentTimeMillis() - time));
        }
    }
