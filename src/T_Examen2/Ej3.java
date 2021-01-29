package T_Examen2;
import java.util.Scanner;

public class Ej3 {

    public static Scanner lect;
    public static void main (String[] args){
    int x =0, y=0, i, j;
    lect = new Scanner(System.in);
    System.out.print("Introdueix lletra a representar: ");
    String lletra = lect.nextLine();
    do {
        System.out.print("Quantes fileres vols ? ");
        x = lect.nextInt();
      
        y = 3;
    }while(x < 5);
    
    for (i = 0; i < x; i++) {
        if (i == 0 || i == x-1) {
            for (j = 0; j < y; j++) {
                System.out.print(lletra);
            }
        }
        else {
            System.out.print(" "+lletra);
            for (j = 1; j < y-2; j++) {
                System.out.print("");
            }
        }
        System.out.println();
    }
}
}
