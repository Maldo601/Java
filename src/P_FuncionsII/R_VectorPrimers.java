package P_FuncionsII;

import java.util.Arrays;

public class R_VectorPrimers {
    static long [] vec_primers(int num){
        /* 
           No se si nums te que determinar el tope de numeros fins a on te que operar
           o si te que determinar la longitud del vector. M'he ceñit a que 
           si no es una llista el que es demana, no es pot ampliar la longitud
           sobre la marxa, d'un Array normal. 
        */
        long v[] = new long [num];
        int counter = 0;
        boolean prim;
        for (int n = 2; counter < num; n++){
            prim = true;
            /*
                "Para cualquier número natural (n) podemos encontrar un número primo (p) que cumple [n<sqrt{p}<n+1.] 
                 Es decir, podemos  encontrar un número primo (p) cuya raíz cuadrada «se cuela» entre  (n) y (n+1)."
                 https://cifrasyteclas.com/primos-raices-y-una-propuesta-irracional-para-numerar-el-carnaval/
            */

            /*
                Un dels problemes es que a cada volta opera la arrel cuadrada. Per optimitzar aixo 
                podem traureu fora del bucle. 

                int m = (int) Math.sqrt(x);

                                    i <= m                   */
            for (int i = 2; i <= Math.sqrt(n) && prim; i++){
                if (n % i == 0)
                    prim = false;
            }
            if (prim){
                v[counter] = n;
                counter++;
            }
        }
        return v;
    }
    public static void main(String[] args){
        System.out.println(Arrays.toString(vec_primers(20)));
    }
}
