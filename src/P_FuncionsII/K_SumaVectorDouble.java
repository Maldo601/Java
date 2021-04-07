package P_FuncionsII;

public class K_SumaVectorDouble {
    static double suma ( double v[] ){
        double value = 0;
        for (int i = 0; i < v.length; i++){
            value += v[i];
        }
        return value;
    }
    static double mitja ( long d[] ){
        double value = 0;
        for (int i = 0; i < d.length; i++){
            value += d[i];
        }
        return value / d.length;
    }
    public static void main (String[] args){
        double v[] = {1.1,1.2,1.3,1.4,1.5};
        long d[] = {4,8,12,15,14,13,12,10,80};
        System.out.println(suma(v));
        System.out.println(mitja(d));
    }
}
// Maldo