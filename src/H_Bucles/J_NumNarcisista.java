package H_Bucles;

public class J_NumNarcisista {
    public static void main (String[] args){
        // Bucle Narcisista.
       int n;
       int counter = 0;
       System.out.println("\n\tNúmeros Narcisistes del 100 al 500\n");
       for(n=100; n<=500; n++){
           int c = n / 100;     // Determina el valor de la centena dividint el numero del bucle entre 100.
           int res = n % 100;   // Obté el residu de n entre 100
           int d = res/10;      // Determina les desenes del residu dividit entre 10. 
           int u = res%10;      // Determina les unitats amb el residu del residu de 10. 
           // Compara si cada numero elevat a tres correspon al número on es troba el bucle. 
           if (n == Math.pow(c,3)+Math.pow(d,3)+Math.pow(u,3)){
               counter++;
               System.out.println("\t" + counter + " --> " + n + " = " + c + "e3 + " + d + "e3 + " + u + "e3 ");
           }
        }
    }
}
// M A L D O // 




