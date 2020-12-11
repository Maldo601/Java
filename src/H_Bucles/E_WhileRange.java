package H_Bucles;

public class E_WhileRange {
    public static void main (String [] args){
        /*Iniciem la variable a 99 i no li passarem un igual al 110
          sino incrementara un nombre per davant al executarse despres del 
          bucle.  */
        int x = 99;
        while (x<110) {
            x++;
            System.out.println(x);
        }
    }
}
