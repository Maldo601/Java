package I_Arrays;
import java.util.Scanner;
public class A_ReinaAlfil {
    public static Scanner lect;
    public static void main (String[] args){
        lect = new Scanner(System.in);
        boolean v[][] = new boolean[4][4];
        // Bloc de peticions de posició.
        System.out.print("\t\033[33mPosicio \"x\" de  Reina: \u001B[0m");
        int rX = lect.nextInt();
        System.out.print("\t\033[33mPosicio \"y\" de  Reina: \u001B[0m");
        int rY = lect.nextInt();
        System.out.print("\t\033[33mPosicio \"x\" de  Alfil: \u001B[0m");
        int aX = lect.nextInt();
        System.out.print("\t\033[33mPosicio \"y\" de  Alfil: \u001B[0m");
        int aY = lect.nextInt();
        // Colocador de peça.
        v[rX][rY] = true; // Reina
        v[aX][aY] = true; // Alfil
        // Filtro de casella ocupada.
        if ( (rX == aX) && (rY == aY) ){
            System.out.println("\n\tCasella ocupada.");
        }
        else
        {
        // Moviment de Torre; REINA
        for (int i = 1; i < 4; i++) 
        {
            v[rX][i] = true;
            v[i][rY] = true;
        }
        // Diagonal \ Esquerra REINA
        int valorFila = rX - 1;
        int valorColumna = rY - 1;
        while (valorFila >= 1 && valorColumna >= 1) {
            v[valorFila][valorColumna] = true;
            valorFila--;
            valorColumna--;
        }
        // Diagonal \ Dreta REINA
        valorFila = rX + 1;
        valorColumna = rY + 1;
        while (valorFila < 4 && valorColumna < 4) {
            v[valorFila][valorColumna] = true;
            valorFila++;
            valorColumna++;
        }
        // Diagonal / Esquerra REINA
        valorFila = rX + 1;
        valorColumna = rY - 1;
        while (valorFila < 4 && valorColumna >= 1) {
            v[valorFila][valorColumna] = true;
            valorFila++;
            valorColumna--;
        }
        // Diagonal / Dreta REINA
        valorFila = rX - 1;
        valorColumna = rY + 1;
        while (valorFila >= 1 && valorColumna < 4) {
            v[valorFila][valorColumna] = true;
            valorFila--;
            valorColumna++;
        }
        // A L F I L 
        // Diagonal \ Esquerra ALFIL
        int valorFilaA = aX - 1;
        int valorColumnaA = aY - 1;
        while (valorFilaA >= 1 && valorColumnaA >= 1) {
            v[valorFilaA][valorColumnaA] = true;
            valorFilaA--;
            valorColumnaA--;
        }
        // Diagonal \ Dreta ALFIL
        valorFilaA = aX + 1;
        valorColumnaA = aY + 1;
        while (valorFilaA < 4 && valorColumnaA < 4) {
            v[valorFilaA][valorColumnaA] = true;
            valorFilaA++;
            valorColumnaA++;
        }
        // Diagonal / Esquerra ALFIL
        valorFilaA = aX + 1;
        valorColumnaA = aY - 1;
        while (valorFilaA < 4 && valorColumnaA >= 1) {
            v[valorFilaA][valorColumnaA] = true;
            valorFilaA++;
            valorColumnaA--;
        }
        // Diagonal / Dreta ALFIL
        valorFilaA = aX - 1;
        valorColumnaA = aY + 1;
        while (valorFilaA >= 1 && valorColumnaA < 4) {
            v[valorFilaA][valorColumnaA] = true;
            valorFilaA--;
            valorColumnaA++;
        }
        // Bucle Print
        for (int x = 1; x < v.length; x++) {
            for (int y = 1; y < v.length; y++) {
                System.out.print("\t" + " " + v[x][y]);
            }
               System.out.println();  
           }
        for ( int x = 1; x < v.length; x++){
            for (int y = 1; y < v.length; y++){
                // Filtro de falsos
                if(v[x][y] == false){
                    System.out.print("\t"+"Posicio disponible a: "+"["+x+"]"+"["+y+"]");
                    System.out.println();
                }
            }
        }
        }
        }   
    }
// MALDO // 