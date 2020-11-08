package D_OthersOperations;
public class O_ElCorredor {    
    public static void main (String[] args ) {
        // Com no es demanen els milisegons podem arrodonir. 
        // m/s * distancia en metros. ( son 14346.94 segons. )
        // 0.46 s'extrau de dividir 14400 entre 31189. 
        // Es mes facil operar a la inversa per a Java que dividir 14400/31189 donant 0.0
        // i generar problemes amb double i floats als metodes Math.floor. 
        long ms = Math.round(0.46 * 31189);
        // Provem el resultat, veient que ha arrodonit els milisegons.
        // Usare long perque amb INT m'obliga a un redundant CAST.
        System.out.println("\n\tTenim un total de: " + ms + " segons " +
                           "per recorrer 31189 metros."); // Aqui tenim 14347 segons per fer 31189 metros.
        // Inicialitzem variables. 
        // Tirem els condicionals de la practica anterior.
        int hora, min,res;
        hora = 0; min = 0; res = 0;
        // Condicions
        if ( ms >= 60) {
            min = (int) (ms / 60);
            res = Math.floorMod(ms, 60);
        }
        if (min >= 60) {
            hora = min/60;
            min = Math.floorMod(min, 60);
        }
        // OUTPUTS
        System.out.println("\n\tEns costarà...");
        System.out.print("\n\tHores: " + hora);
        System.out.print("\n\tMinuts: " + min);
        System.out.print("\n\tSegons: " + res + "\n\n");                         
    }
}
/*_Maldo_*/
