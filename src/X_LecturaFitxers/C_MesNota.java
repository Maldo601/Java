package X_LecturaFitxers;
// import java.util.Arrays;
import java.io.*;
import java.util.*;


/* D O C U M E N T A C I O
    Joan Marc Maldonado
    GitHub: https://github.com/Maldo601
    ----------------------------------------------------------------------------------
    - Plantejament lògic emprat ... {

        0.- Encapsular el màxim possible en funcions, construir al main. 
        1.- Agafar números, tractarlos i parsejarlos.
        2.- Agafar noms, no tractarlos. Suposar que tots són vàlids.
        3.- Establir un 0 tot el que no sigui de [0-10]
        4.- Tornar una copia de la terminal a un fitxer de logs ben formatat. 
        
    ----------------------------------------------------------------------------------
    - Testing ... {

        1.- Porta d'entrada try-catchejada segons requeriments.         OK
        2.- 2 Vectors buclejats en condicio de relació "nom-nota"       OK                                
        3.- Lectura UTF-8 i impresió / volcat                           OK
        4.- Logs correctes i formatats                                  OK
        5.- Escalable                                                   OK
        6.- Mitjana                                                     X
        7.- Busqueda per nom                                            X
           
    ----------------------------------------------------------------------------------
    - Problemes ... {

        - La cadena sense espais queda retallat el "llar" final. 
        - Veure que a les terminals "Nota" queda desplaçat i al logs.txt 
          queda ben formatat, em dona TOC. 
        - Obviament potser dos vectors no eren necessaris, pero me fan sentir 
          en molta tranquilitat programant este tipo de coses i que les coses
          no vagin al vol dins d'un while.
        - Potser el temps d'execució es una mica altet. 
        
    ----------------------------------------------------------------------------------
    - Documentació del Programa ... {
        
        1.- validFormat()

            1.1 - El programa demana una execució que requereix de la crida al programa
                  i una nota. Si no es compleix el pas de dos parametres, tira un missatge
                  de benvinguda i explicació de que s'ha de fer.
            1.2 - Si es dona el cas que el fitxer passat a args[0] no existeix, es 
                  notifica.
            1.3 - Es comproba que el segon parametro es pugue parsejar a doble i estigue a 
                  rango. Cas contrari, exepció.
            1.4 - Reserva dos booleans globals (true/false) per determinar si el procés 
                  d'esta funció ha d'executar la seguent instrucció al constructor del main. 

        2.- extracter()

            2.1 - S'obre un reader per llegir el fitxer i contar cuantes linies hi han,
                  per poder establir una mida exacta als vectors de reserva.
            2.2 - S'ha usat un Try-with-resources de lectura del tipo InputStreamReader.
                  Perque aquest en concret, accepta la lectura d'un fitxer amb "UTF-8".
                  Si no es comença llegint el fitxer en "UTF-8", es cuan els problemes
                  mes endavant truquen a la porta. Tot es tanca explicitament. En fi,
                  tota la lectura es passa a un BufferedReader per agilitzar.
            2.3 - Cada "columna numèrica no numèrica, stringuejada" serà la primera de ser
                  tractada i reservada. He elegit agafar 4 caracters del length.
                  Replacejar les comes per punts per poder parsejar adecuadament i eliminar els 
                  espais a l'esquerra. Tot aixo es parseja i s'almacena en ordre de cascada 
                  al vector v[].
                - Després s'agafa tota la cadena restant de "nom" i es passa al vector lec[];

        3.- printer()

            3.1 - 

        4.- logs()

            4.1 - 
            4.2 - 

        5.- Main()

            - Al decidir encapsular-ho casi tot en funcions independents, subdividint
              el problema en petites capces que resolen aquesta fragmentació del problema.
              he optat per dixar el main el mes llimpio possible per unicament
              construir les funcions.

*/
public class C_MesNota {
    static Scanner lect;
    static boolean file = true;
    static boolean score = true;
    static Double v[];
    static String lec[];
    static int counter = 0;
    static void validFormat(String[] args){
        if (args.length != 2){
            System.out.println("Programa per llegir notes d'Alumnes. " + 
                               "Siusplau, passa una nota com argument. ");
        }
        try (FileReader fr = new FileReader(args[0])){  }
        catch (Exception e) {
            System.out.println("Fitxer Desconegut.");
            file = false;
        }
        try{
            if ( (Double.parseDouble(args[1]) > 10 || Double.parseDouble(args[1]) <  0)) 
                throw new Exception("");
        }
        catch(Exception e){
            System.out.println("Nota invalida. Escriu una nota entre 0 i 10");

            score = false;
        }
    }
    static void extracter(String[] args){
        String c;
        String note = "";
        try(FileReader fr = new FileReader(args[0])){
            BufferedReader bRead = new BufferedReader(fr);
                while((c = bRead.readLine()) != null)
                    counter++;        
        }catch (Exception e) {
            System.out.println("Error per definir 1.");
        }
        v = new Double[counter];
        lec = new String[counter];
        int cnt = 0;
        int cnt2 = 0;
        try(InputStreamReader fr = new InputStreamReader(new FileInputStream(args[0]), "UTF-8")){
            BufferedReader bRead = new BufferedReader(fr);
                while((c = bRead.readLine()) != null){
                    note = c.substring(c.length()-4, c.length());
                    note = note.replace(",", ".");
                    note = note.replace(" ", "");
                    note = note.replaceAll("[^0-9+.]", "0");
                    v[cnt++] = Double.parseDouble(note);
                    lec[cnt2++] = c.substring(0, c.length()-4);
                }
        }catch(Exception e){
            System.out.println("Error per definir 2.");
        }
        // System.out.println(Arrays.toString(v));
        // System.out.println(Arrays.toString(lec));
    }
    static double mediaGlobal (Double v[], String[] args){
        Double mediaGlobal = 0.0;
        int counter = 0;
        for(int i = 0; i < v.length; i++){
            if(Double.parseDouble(args[1]) <= v[i]){
                counter++;
                mediaGlobal += v[i];
            }
        }
        return mediaGlobal / counter;
    }
    static double altaGlobal(Double v[], String[] args){
        Double altaGlobal = 0.0;
        for(int i = 0; i < v.length; i++){
            if(Double.parseDouble(args[1]) <= v[i] && v[i] > altaGlobal){
                altaGlobal = v[i];
            }
        }
        return altaGlobal;
    }
    static double baixaGlobal(Double v[], String[] args){
        Double baixaGlobal = 10.0;
        for(int i = 0; i < v.length; i++){
            if(Double.parseDouble(args[1]) <= v[i] && v[i] < baixaGlobal){
                baixaGlobal = v[i];
            }
        }
        return baixaGlobal;
    }
    static void printer (Double v[], String lec[], String[] args){
        System.out.printf("%-40s%-2s%-10s\n","Alumne","","Nota");
        System.out.println("---------------------------------------------------------------------------------------");
        for(int i = 0; i < v.length; i++){
            if(Double.parseDouble(args[1]) <= v[i])
                System.out.printf("%-46s%-1.2f\n",lec[i].trim(), v[i]);
        }
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-45s%-1.2f\n","Mitjana: ",  mediaGlobal(v, args));
        System.out.printf("%-45s%-1.2f\n","Alta: ",   altaGlobal(v, args)); 
        System.out.printf("%-45s%-1.2f\n","Baixa: ",  baixaGlobal(v, args)); 
    }
    static void logs (String[] args, Double v[], String lec[]){
        try (PrintWriter writer = new PrintWriter("logs.txt", "UTF-8");){
            writer.printf("%-35s%-10s%-40s\n","Alumne","","Nota");
            writer.println("---------------------------------------------------------------");
            for(int i = 0; i < v.length; i++){
                if(Double.parseDouble(args[1]) <= v[i])
                    writer.printf("%-45s%-1.2f\n",lec[i].trim(), v[i]);
        }
        writer.println("---------------------------------------------------------------");
        writer.printf("%-45s%-1.2f\n","Mitjana: ",mediaGlobal(v, args));
        writer.printf("%-45s%-1.2f\n","Alta: ",   altaGlobal(v, args)); 
        writer.printf("%-45s%-1.2f\n","Baixa: ",  baixaGlobal(v, args));  
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main (String[] args){
        long temps = System.currentTimeMillis();
        lect = new Scanner(System.in);
        String opt;
            validFormat(args);
                if (file && score == true){
                    extracter(args);
                    printer(v, lec, args);
                    System.out.print("\nDesitjes imprimir els resultats a un .txt? [yes][no]: ");
                    opt = lect.nextLine();
                    if(opt.equals("yes"))
                        logs(args, v, lec);
                }
        else 
            
        System.out.println("Execution time: " + (System.currentTimeMillis() - temps) + " ms.");
    }
}
    

