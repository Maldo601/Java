package I_Arrays;

public class L_MenosDeDeuRep {
    public static void main(String[] args) {   
		/* 1) - Crear un vector de 10000 enteros
           2) - Rellenarlo con valores aleatorios entre 500 y 1000 (las 10000 posiciones)
           3) - Determinar cuantos valores aparecen en el vector menos de 11 veces, y cuales son
           (el valor más probable de repeticiones de qualquier valors es de 20 = 10000 / 500)
		*/
 
        int c=0;    // Contador para contar cuantas veces aparece el valor
        // Veces que aparece 
        int [] veces = new int[1001];
        // Declaramos vector de enteros
        int [] v = new int[10000];
        // Lo rellenamos de valores aleatorios entre 500 y 1000
        for (int n=0; n<v.length; n++)
            v[n] = (int)(Math.random()*501)+500;
        // Recorremos el vector, contando cuantas veces aparece cada valor (de 500 a 1000)
        // Lo haremos de dos formas, una de ellas muy ineficiente
        /*
            Recorrido muy ineficiente, para cada valor de 500 a 1000, recorremos el vector v,
        es decir, recorremos el vector v 500 veces.  Se puede hacer esto en un solo recorrido.
        for (int n=0; n<v.length; n++)
            for (int m=500; m<=1000; m++)
                if (v[n]==m)
                    veces[m]++;
        */
        // Recorremos el vector v una sola vez y encontramos las veces que aparece cada valor en el
        for (int n=0; n<v.length; n++)
            veces[v[n]]++;      // Incrementamos las veces que aparece el valor v[n]
        // Recorremos el vector veces para ver cuantos valores aparecen menos de 11
        for (int n=500; n<=1000; n++)
            if (veces[n] <= 10){
                System.out.println("El valor " + n + " aparece " + veces[n] + " veces en el vector");
                c++;    // Incrementamos el contador 
            }
        System.out.println("Total " + c + " valores aparecen menos de 11 veces en el vector");
}
}
