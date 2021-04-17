package P_FuncionsII;

public class Q_QuantesVegadesVector {
    static int quants (int v[], int x){
        int counter = 0;
        for ( int i = 0; i < v.length; i++){
            if(v[i] == x)
                counter++;
        }
        return counter;
    }
    public static void main(String[] args){
        int v[] = {1,1,1,1,2,2,8,9,10};
        System.out.println(quants(v, 2));
    }
}
