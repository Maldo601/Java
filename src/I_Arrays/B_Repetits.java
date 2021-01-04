package I_Arrays;
import java.util.Scanner;

public class B_Repetits {
    public static Scanner lect;
    public static void main(String[] args) {
        lect = new Scanner(System.in);
        // Loop 
        int[] v = new int[(int) 10e5];
        for (int i=0; i < (int) 10e5; i++){
            v[i] = (int) (Math.random() * (int) 10e6);
            System.out.println(v[i]);
        }
        
    }
}

/*

implementas un for que recorra desde la pocicion sub 0 hasta el tamaño maximo del array, y dentro del for vas poreguntando :

int aux = 0;


for (int i=0;i<array.length;i++)
{

if ( array[i] = array[i+1] )
{
aux++;
}
}

System.out.println("El numero de elementos repetidos es : " + aux);
*/