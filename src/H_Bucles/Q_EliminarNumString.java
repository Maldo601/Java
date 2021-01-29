package H_Bucles;
import java.util.Scanner;
public class Q_EliminarNumString {
    public static Scanner entrada;
    public static void main (String[] args){
    String cad,cadResult ="";
         entrada = new Scanner(System.in);

        System.out.println("Programa per eliminar els números d'un String.\n");
        System.out.println("Escriu un missatge que contingui números: ");
        cad = entrada.nextLine();
   
        // Recorregut del primer String buscant valors entre '0' i '9'
        for (int i = 0; i < cad.length(); i++) {
            if (cad.charAt(i) < '0' || cad.charAt(i) > '9') {
				cadResult += cad.charAt(i);
			}
        }
        // Mostrem el resultat
        System.out.println("El missatge sense els números és:");
        System.out.println(cadResult);
    }
}
