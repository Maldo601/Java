package A_BASES;
// El siguiente programa de Java permite sumar dos entradas por teclado.
// Lo primero y fundamental sera importar unas librerias que permiten
// que java pueda admitir entradas de texto por consola. 

// En este ejemplo hemos trabajado con valores int. Recordemos que para entrar decimales por terminal
// debemos usar la coma y no el punto. 
// Podemos modificar el programa si queremos entrar solo enteros, largos, dobles, etc modificando los lector.nextInt

// El siguiente ejemplo a este usaremos una multiplicadora pero podeos usar otros operandos. 
import java.util.Scanner;


public class F_EntrarDatosYOperar { 
    private static Scanner lector;

    public static void main (String[] args) { 

        // Necesitaremos inicializar la biblioteca que hemos importado fuera de la clase.
        // A ese escaner le damos un nombre y le decimos que es nuevo y que debe inicializarse.
        
        lector = new Scanner(System.in);

        // Hecho esto tiramos un mensaje de bienvenida presentando la operadora.

        System.out.println(" Bienvenido a la sumadora, vamos a sumar dos numeros enteros.");
        System.out.println(" Escribe un numero entero y pulsa ENTER: ");
        
        // Ahora le daremos la instruccion donde nos permitirá entrar ese primer numero por terminal. 
        // Declaramos una variable en int con un nombre generico adecuado y le indicamos que el valor de 
        // primerEntero se introducira mediante un lector.

        int primerEntero = lector.nextInt();
        lector.nextLine();

        // Repetimos el proceso para introducir el segundo entero. 

        System.out.println(" Escribe el segundo numero y pulsa ENTER: ");
        int segundoEntero = lector.nextInt();
        lector.nextLine();

        // Tercer nombre. 

        System.out.println(" Escribe el tercero numero y pulsa ENTER: ");
        int tercerEntero = lector.nextInt();
        lector.nextLine();


        // Una vez hecho esto le pasaremos como debe operar el programa en base a los dos valores entrados
        // por lector a int. 

        int resultat = primerEntero * segundoEntero * tercerEntero;

        // Y printamos el resultado.

        System.out.println(" El resultado és " + resultat + ".");
    }
}
