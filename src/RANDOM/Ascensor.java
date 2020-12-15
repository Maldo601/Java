package RANDOM;
import java.util.Scanner;
public class Ascensor {
    public static Scanner lect;
    public static void main (String[] args){
        lect = new Scanner(System.in);
		// String Pisos.
		final String lvls = "S4S3S2S1PBP1P2P3P4P5P6P7P8P9";
		int pisAle = (int)(Math.random()*14);
		String nomPis = lvls.substring(pisAle*2,pisAle*2+2);
		System.out.println("Estas a " + nomPis);
		System.out.println("Selecciona on vols anar: ");
		String dest = lect.nextLine();
		if ( dest.equals(nomPis) )
		System.out.println("Ja estem en aquesta planta.");
		else if ( dest.equals("P8") || dest.equals("P9"))
		System.out.println("Area restringida");
		else if ( lvls.indexOf(dest) < 0 )
		System.out.println("Error.");
		else if ( lvls.indexOf(dest) > lvls.indexOf(nomPis))
		System.out.println("Muntant a... " + dest);
		else 
		System.out.println("Baixant a... " + dest);
	}
}
// MALDO // MALDO // MALDO // MALDO // 

       