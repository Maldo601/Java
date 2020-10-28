package A_BASES;
public class J_TableOfFourWithNoForBucle {
    public static void main(String[] args) throws Exception {
        // En el siguiente metodo de Java, veremos como imprimir 
        // por consola la tabla de multiplicar por 4, con los 
        // primeros 5 resultados, sin usar ninguna iteración 
        // ni bucle "for". 
        // También tenemos terminalmente prohibido assignar mas
        // de dos variables y solo se puede usar un literal para 
        // inicializar el programa. 

        // Para hacerlo declararemos una variable "x" y "y", ambas
        // con valor 4.

        // Recordemos que cada valor assignado en una variable es 
        // un espacio assignado a la memoria del programa y por ende
        // es susceptible a ser modificado o a cambios, teniendo por 
        // defecto ese mismo valor, con lo cual podemos deducir que en 
        // base a esto, podemos guardar ese valor en la memoria e ir sumando.

        int x = 4;
        int y = 4;

        System.out.println(x); // Primero se printa un "4"
        x = x + y;             // A ese valor 4 se le añade el resultado de x + y. "X = 4+4 = 8"
        System.out.println(x); // 8 queda reservado en la memoria en ese print, se muestra. 
        x = x + y;             // "x = x + y" es igual ahora a "8 = 8 + 4 = 12" 
        System.out.println(x); // 12 queda reservado en la memoria de ese print, se muestra.
        x = x + y;             // "x = x + y" es igual ahora a "12 = 12 + 4 = 16"
        System.out.println(x); // 16 se queda reservado en la memoria de ese print, se muestra.
        x = x + y;             // "x = x + y" es igual ahora a "16 = 16 + 4 = 20"
        System.out.println(x); // 20 queda reservador en la memoria de ese print, se muestra.
    }
}

// AIXO NO ES GENS OPTIM. No ens podem equivocar en cap valor perque estan assignats a variables en un valor determinat
// pero es costós d'escriure. En el seguent exemple veurem com podem fer una taula de multiplicar de forma mes optima en una constant
// on nomes canviant un valor podrem printar per terminal o consola tota una taula de multiplicar fins on nosaltres volguesim. 
// i encara mes endavant veurem com fer una taula de multiplicar mitjançant l'ús de bucles for i increments fins a un tope 
// que li marquessim al codi.


