package I_Arrays;
import java.util.Scanner;
public class N_BorrarElementosNoEf {
    // Programa que dado un vector de enteros (que se indica), pregunta al
        // usuario un valor a eliminar del vector y lo suprime, desplazando el
        // resto de elementos una posición hacia abajo.
        // La longitud final del vector queda en la variable l.
        Scanner sc = new Scanner(System.in);
        int [] v = {5,5,5,2,3,4,5,3,4,1,2,5,7,8,9,5,5,5,2,3,4,1,8,5,5,5,4,3,5,5,5};
        int l = v.length;           // Longitud inicial y final del vector
        int b;                      // Valor a borrar del vector
        System.out.println("Vamos a eliminar elementos de un vector");
        // Escribe el vector de partida
        System.out.println(java.util.Arrays.toString(v));
        // Pregunta al usuario el valor a borrar del vector
        System.out.print("Introduce el valor que deseas eliminar del vector: ");
        b = sc.nextInt();
        // Borramos totes les aparicions del valor introduít en el vector
        // Ineficiente, desplazamos los elementos del vector para cada valor borrado
        for (int n=0; n<l; )
            if (v[n] == b){
                for (int m=n+1;m<l;m++)
                    // Para evitar que pete el programa al 
                    // eliminar el último elemento del vector
                    if (m<v.length)
                        v[m-1] = v[m];
                l--;
            }
            else
                // Incrementemamos la n solo si v[n] != b para evitar saltar
                // valores a borrar que estén repetidos en el vector
                n++;
        // Vector resultante, ahora ya no tiene v.lenght elementos.  Lo visualizamos hasta l..
        System.out.println("Eliminados " + (v.length - l) + " valores iguales a " + b + " en el vector");
        System.out.println("Vector resultante después de eliminar el valor " + b);
        System.out.print("[");
        for (int n=0; n<l-1; n++)
            System.out.print(v[n] + ", ");
        System.out.println(v[l-1] + "]");
        System.out.println("Si escribimos todo el vector, hay valores no válidos al final del mismo");
        // Aparecen todos los elementos del vector, pero son más que l
        System.out.println(java.util.Arrays.toString(v));
    }
}
