package P_FuncionsII;

public class S_InsertaVec {
    static void inserta(int v[], int x, int p){
        /*
          No tenia clar si m'havia de complicar la vida. 
          Pero no recordo el metode de com complicarme la vida
          en bucle en aquest cas en particular.
        */
        /*
          Parametros: "Array 1", "Inici Array 1", "ArrayDestí", "Posicio d'inici a Array destí", "longitud a copiar"
        */
        int vaux[] = new int[(v.length-1) - p];
        System.arraycopy(v, p, vaux, 0, vaux.length);
        v[p] = x;
        System.arraycopy(vaux, 0, v, p+1, vaux.length);


        // System.out.println(Arrays.toString(vaux));
        // System.out.println(Arrays.toString(v));
    }
    public static void main (String[] args){
        int v[] = {1,2,4,5,6};
        inserta(v, 3, 2);
    }
}
// Parametros: "Array 1", "Inici Array 1", "ArrayDestí", "Posicio d'inici a Array destí", "longitud a copiar"

    // System.arraycopy(a, 0, v, 0, a.length);

    // Parametros: "Array 2", "Inici Array 2", "A partir d'on es comença a copiar", "longitud a copiar"

    //System.arraycopy(b, 0, v, a.length, b.length);