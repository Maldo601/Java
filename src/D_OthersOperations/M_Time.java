package D_OthersOperations;

import java.util.Scanner; 

public class M_Time {
    public static Scanner lectime;
    public static void main (String[] args) {
        lectime = new Scanner(System.in);
        // Almacena entrada en segons.
        int sec;
        // Almacena les conversions i residu de segons.
        int min,day,hour,res;
        // Lectura per terminal
        System.out.print("\n\tIntrodueix els segons: ");
        sec = lectime.nextInt();
        // Inicialitzem variables i les posem a 0. Si no, no funcionaran
        // els condicionals.
        res = 0;
        min = 0;
        hour = 0;
        day = 0;
        /* Condicionals
         Si sec es mes gran o igual a 60, extrau els minuts del Quocient. 
         El residu es calula en un floorMod per reservar els segons. 
         Aquesta lògica s'aplica a la resta de condicionals. 
        */
        if (sec >= 60) {
            min = sec/60;
            res = Math.floorMod(sec, 60);
        }
        if (min >= 60) {
            hour = min/60;
            min = Math.floorMod(min, 60);
        } 
        if (hour >= 24) {
            day = hour / 24;
            hour = Math.floorMod(hour, 24);
        }
        // Outputs
        System.out.println("\n\tSegons: " + res);
        System.out.println("\tMinuts: " + min);
        System.out.println("\tHores: " + hour);
        System.out.println("\tDies: " + day);
        
    }    
}
/*_Maldo_*/
