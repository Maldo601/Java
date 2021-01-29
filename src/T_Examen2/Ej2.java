package T_Examen2;
import java.util.Scanner;
public class Ej2 {
    public static Scanner lect;
    public static void main (String[] args){
    lect = new Scanner(System.in);
    int a = 0; int e = 0; int i = 0; int o = 0; int u = 0;
    System.out.print("Introdueix una paraula o frase: ");
    String frase = lect.nextLine();
    System.out.println("Has introduit la frase o paraula: " + frase);
    for (int x = 0; x < frase.length(); x++){
        if (frase.charAt(x) == 'a' || frase.charAt(x) == 'A'){
        a++;
        }
    }
    for (int x = 0; x < frase.length(); x++){
        if (frase.charAt(x) == 'e' || frase.charAt(x) == 'E') {
        e++;
        }
    }
    for (int x = 0; x < frase.length(); x++){
        if (frase.charAt(x) == 'i' || frase.charAt(x) == 'I'){
        i++;
        }
    }
    for (int x = 0; x < frase.length(); x++){
        if (frase.charAt(x) == 'o' || frase.charAt(x) == 'O'){
        o++;
        }
    }
    for (int x = 0; x < frase.length(); x++){
        if (frase.charAt(x) == 'u' || frase.charAt(x) == 'U'){
        u++;
        }
    }
    System.out.println("Se encontró 'a': " + a + " veces");
    System.out.println("Se encontró 'e': " + e + " veces");
    System.out.println("Se encontró 'i': " + i + " veces");
    System.out.println("Se encontró 'o': " + o + " veces");
    System.out.println("Se encontró 'u': " + u + " veces");
    }
}

// M A L D O // 