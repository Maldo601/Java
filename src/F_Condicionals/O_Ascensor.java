package F_Condicionals;
import java.util.Scanner;
public class O_Ascensor {
    public static Scanner lect;
    public static void main (String[] args){
        lect = new Scanner(System.in);
		// String Pisos disponibles.
		final String lvls = "S4S3S2S1PBP1P2P3P4P5P6P7P8P9";
		// Generació de pis aleatori de partida. Hi han 14 opcions. 
		int pisAle = (int)(Math.random()*14);
		// D'aquestes 14 opcions, no caracters, ha d'agrupar-ho amb grups de 2. 
		String nomPis = lvls.substring(pisAle*2,pisAle*2+2);
		System.out.print("\n\n\t\u001B[33mBenvingut a l'Ascensor. " + "\n\t\u001B[33mEstàs a la planta: \u001B[37m" + nomPis + 
						 ". \n\t\u001B[33mSelecciona on vols anar: \u001B[37m");
		// Lectura destí
		String dest = lect.nextLine();
		// Condicionals 
		if ( dest.equals(nomPis) )
			System.out.println("\n\t\u001B[31mJa estem en aquesta planta.");
			else if ( dest.equals("P8") || dest.equals("P9"))
				System.out.println("\n\t\u001B[31mArea restringida");
			else if ( lvls.indexOf(dest) < 0 )
				System.out.println("\n\t\u001B[31mError.");
			else if ( lvls.indexOf(dest) > lvls.indexOf(nomPis))
				System.out.println("\n\t\u001B[36mMuntant a... \u001B[37m" + dest + "\n");
		else 
			System.out.println("\n\t\u001B[36mBaixant a... \u001B[37m" + dest + "\n");
	}
}
// MALDO //

       