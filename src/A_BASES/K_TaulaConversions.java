
package A_BASES;
public class K_TaulaConversions {
    public static void main (String[] args) {
        // Variables
        int a,b,g,j;
        String c,d;
        char e,f,h;
        float i;
        double l,k,m;
        
        
        // Fila 1
        a = 6 - 5 * 3; b = (6 - 5) * 3; c = '3' + "5" + '7'; d = "error"; e = 'A' * 10; f = 'A' + 10;
        // Fila 2
        g = -1 * -1; h = 'A' + 'B'; i = 2; j = -4 - 7 + 2 * 3; k = (double)3/2; l = (double)3/4;
        // Fila 3
        m = (double)12 / 5; 


        // Output

        // Per fer-ho el mes semblant a la taula proposada per l'exemple, concaternarem cada fila a un system.out
        // i per visualitzar-ho millor que amb un espaiat buit, inclourem una tabulació entre resultats. 
        System.out.println(a + "\t" + b + "\t" + c + "\t" + d + "\t" + (short)e + "\t" + (byte)f);
        System.out.println(g + "\t" + (short)h + "\t" + i + "\t" + j + "\t" + k + "\t" + l);
        System.out.println(m);


    }    
}
