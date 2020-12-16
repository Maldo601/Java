package RANDOM;
import java.util.Scanner;
public class Lletres {
    public static Scanner sc;
    public static void main(String[] args) {
        String s;   // Cadena llegida
        sc = new Scanner(System.in);
        char c;     // caràcter que llegirem
        do{
            System.out.print("Introdueix una lletra: ");
            s = sc.nextLine();
            if (s.length() != 1)
                System.out.println("T'he demanat una sola lletra");
        }
        while (s.length() != 1);
        
        c = s.charAt(0);
        switch(c){
            case 'A': 
                System.out.println("És la primera lletra majúscula");
                System.out.println("És una vocal majúscula");
                    break;
            case 'a': 
                System.out.println("És la primera lletra minúscula");
                System.out.println("És una vocal minúscula");
                    break;
            case 'Z': 
                System.out.println("És la darrera lletra majúscula");
                    break;
            case 'z': 
                System.out.println("És la darrera lletra minúscula");
                    break;
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("És una vocal majúscula");
                    break;
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("És una vocal minúscula");
                    break;
            default:
                System.out.println("No m'agrada la lletra que has triat");
        }
    }
}


