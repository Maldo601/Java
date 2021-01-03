package RANDOM;
import java.util.Scanner;
public class TresEnRatlla {
    public static Scanner lect;
    public static void main (String[] args) {
        lect = new Scanner(System.in);
        System.out.println("\n\t\033[36mBenvinguts al tres en ratlla." + "\n\033[30m");
        int tab[][] = new int[3][3];
        // Bucle print tablero. 
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[0].length; j++) {
                tab[i][j] = (i * tab.length) + (j + 1);
                System.out.print("\t" + tab[i][j] + " ");
            }
            System.out.println("\n");
        }
        System.out.print("\t\033[33mPrimera fitxa: \u001B[0m");
        byte x = lect.nextByte();
        System.out.print("\t\033[33mSegona fitxa: \u001B[0m");
        byte y = lect.nextByte();
        // Invalidació per igualtat.
        if ( x == y )
        System.out.println("\n\t\033[31mPosició ocupada per una fitxa.\u001B[0m");
// 1                                                     MATCH 
        else if ( (x == tab[0][0]) && (y == tab[0][1] || // 2
                                       y == tab[0][2] || // 3
                                       y == tab[1][0] || // 4
                                       y == tab[1][1] || // 5
                                       y == tab[2][0] || // 7
                                       y == tab[2][2] )) // 9
        System.out.println("\n\t\033[32mTres en Ratlla");
//  2
        else if ( (x == tab[0][1]) && (y == tab[0][0] || // 1
                                       y == tab[0][2] || // 3
                                       y == tab[1][1] || // 5
                                       y == tab[2][1] )) // 8
        System.out.println("\n\t\033[32mTres en Ratlla");
//  3
        else if ( (x == tab[0][2]) && (y == tab[0][0] || // 1
                                       y == tab[0][1] || // 2
                                       y == tab[1][1] || // 5 
                                       y == tab[1][2] || // 6
                                       y == tab[2][0] || // 7
                                       y == tab[2][2] )) // 9
        System.out.println("\n\t\033[32mTres en Ratlla");
//  4
        else if ( (x == tab[1][0]) && (y == tab[0][0] || // 1
                                       y == tab[1][1] || // 5
                                       y == tab[1][2] || // 6
                                       y == tab[2][0] )) // 7
        System.out.println("\n\t\033[32mTres en Ratlla");
//  5
        else if ( (x == tab[1][1]) && (y == tab[0][0] || // 1
                                       y == tab[0][1] || // 2
                                       y == tab[0][2] || // 3
                                       y == tab[1][0] || // 4
                                       y == tab[1][2] || // 6
                                       y == tab[2][0] || // 7
                                       y == tab[2][1] || // 8
                                       y == tab[2][2] )) // 9
        System.out.println("\n\t\033[32mTres en Ratlla");
//  6
        else if ( (x == tab[1][2]) && (y == tab[0][2] || // 3
                                       y == tab[1][0] || // 4
                                       y == tab[1][1] || // 5 
                                       y == tab[2][2] )) // 9
        System.out.println("\n\t\033[32mTres en Ratlla");
//  7
        else if ( (x == tab[2][0]) && (y == tab[0][0] || // 1
                                       y == tab[0][2] || // 3
                                       y == tab[1][0] || // 4
                                       y == tab[1][1] || // 5 
                                       y == tab[2][1] || // 8
                                       y == tab[2][2] )) // 9
        System.out.println("\n\t\033[32mTres en Ratlla");
//  8
        else if ( (x == tab[2][1]) && (y == tab[0][1] || // 2                            
                                       y == tab[1][1] || // 5                          
                                       y == tab[2][0] || // 7                              
                                       y == tab[2][2] )) // 9
        System.out.println("\n\t\033[32mTres en Ratlla");
//  9
        else if ( (x == tab[2][2]) && (y == tab[0][0] || // 1                             
                                       y == tab[0][2] || // 3                         
                                       y == tab[1][1] || // 5 
                                       y == tab[1][2] || // 6
                                       y == tab[2][0] || // 7
                                       y == tab[2][1] )) // 8
        System.out.println("\n\t\033[32mTres en Ratlla");
        else if ( x > 9 || x < 1 || y < 1 || y > 9 )
            System.out.println("\n\t\033[31mError, paràmetres incorrectes.");
// Bloq I.
             if ( (x == 4 && y == 7) || (x == 5 && y == 9) || (x == 3 && y == 2) ||
                  (x == 7 && y == 4) || (x == 9 && y == 5) || (x == 2 && y == 3))
                System.out.println("\t\033[31mBloqueig a 1" + "\n");
// Bloq II 
        else if ( (x == 1 && y == 3) || (x == 5 && y == 8) ||
                  (x == 3 && y == 1) || (x == 8 && y == 5))
                System.out.println("\t\033[31mBloqueig a 2" + "\n");
// Bloq III 
        else if ( (x == 1 && y == 2) || (x == 7 && y == 5) || (x == 9 && y == 6) ||
                  (x == 2 && y == 1) || (x == 5 && y == 7) || (x == 6 && y == 9))
                System.out.println("\t\033[31mBloqueig a 3" + "\n");
// Bloq IV 
        else if ( (x == 1 && y == 7) || (x == 5 && y == 6) ||
                  (x == 7 && y == 1) || (x == 6 && y == 5))
                System.out.println("\t\033[31mBloqueig a 4" + "\n");
// Bloq VI 
        else if ( (x == 3 && y == 9) || (x == 4 && y == 5) ||
                  (x == 9 && y == 3) || (x == 5 && y == 4))
                System.out.println("\t\033[31mBloqueig a 6" + "\n");
// Bloq VII
        else if ( (x == 1 && y == 4) || (x == 5 && y == 3) || (x == 8 && y == 9) ||
                  (x == 4 && y == 1) || (x == 3 && y == 5) || (x == 9 && y == 8))
                System.out.println("\t\033[31mBloqueig a 7" + "\n");
// bloq VIII
        else if ( (x == 7 && y == 9) || (x == 2 && y == 5) ||
                  (x == 9 && y == 7) || (x == 5 && y == 2))
                System.out.println("\t\033[31mBloqueig a 8" + "\n");
// Bloq IX
        else if ( (x == 7 && y == 8) || (x == 3 && y == 6) || (x == 5 && y == 1) ||
                  (x == 8 && y == 7) || (x == 6 && y == 3) || (x == 1 && y == 5))
                System.out.println("\t\033[31mBloqueig a 9" + "\n");
        else if ( (x == 8 && y == 2) || (x == 4 && y == 6) || (x == 3 && y == 7) || (x == 1 && y == 9 ) || 
                  (x == 2 && y == 8) || (x == 6 && y == 4) || (x == 7 && y == 3) || (x == 9 && y == 1 ))
                System.out.println("\t\033[31mBloqueig a 5" + "\n");
        else
                System.out.println("\n\t\033[31mNo es pot fer match ni bloquejar.");
    }
}
