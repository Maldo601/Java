package RANDOM;
import java.util.Scanner;
import java.util.Arrays;
public class EliminarVector {
    
    public static Scanner lect;
    public static Arrays array;
    public static void main (String[] args){
        lect = new Scanner (System.in);
    // Array 
    int [] v = {1,2,3,3,4,5,5,6,6,7,8,9};
    int lv = v.length;
    // Mètode per imprimir un vector en la classe arrays. 
    System.out.println();
    System.out.println(java.util.Arrays.toString(v));
    System.out.print("Introdueix quin número vols borrar del Array: ");
    int x = lect.nextInt();
    System.out.println("Es borrarà el número" + x + " de l'Array");
    // Només s'ha d'executar una vegada per fer-ho, no es ciclic.
        for (int y = 0; y < lv; y++){
            if(v[y] == x){
                
            }
            }
            System.out.println(java.util.Arrays.toString(v));
            }
        }
// substituir problema de borrar el index 0 i que no salte al negatiu. 