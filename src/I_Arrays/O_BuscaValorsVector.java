package I_Arrays;
import java.util.Scanner;
public class O_BuscaValorsVector {
    public static Scanner sc;
    public static void main(String[] args) {
        /* 1) - Crear un vector de 10000 enteros
           2) - Rellenarlo con valores aleatorios entre 500 y 1000 (las 10000 posiciones)
           3) - Determinar cuantas veces aparece en el vector el valor 800
                (el número de repeticiones más probable para cualquier valor es el de 20)
                - Preguntar al usuario valores a buscar en el vector repetidamente mientras
                  este no introduzca el valor 0.
                - Hacer que los valores introducidos se encuentren entre 500 y 1000 (comprobar-lo
                  y si no es así, indicar esta eventualidad al usuario, sin contar el valor
                  incorrecto introducido)
        */
        sc = new Scanner(System.in);
        int dato;   // Dato a buscar
        int c;    // Contador para contar cuantas veces aparece el valor
        // Declaramos vector de enteros
        int [] v = new int[10000];
        // Lo rellenamos de valores aleatorios entre 500 y 1000
        for (int n=0; n<v.length; n++)
            v[n] = (int)(Math.random()*501)+500;
        // Pedimos el dato al usuario
        do{
            c = 0;      // Resetear el contador
            do{
                System.out.print("Dato a buscar en el vector: ");
                dato = sc.nextInt();
                if ((dato < 500 || dato > 1000) && dato != 0)
                    System.out.println("Valor incorrecto. Los valores válidos estan entre 500 y 1000");
            }while ((dato < 500 || dato > 1000) && dato != 0);
            if (dato != 0){
                for (int n=0; n<v.length; n++)
                    if (v[n]==dato)
                        c++;
                System.out.println("El valor " + dato + " aparece " + c + " veces en el vector");
            }  
        }while (dato != 0);
    }
}
