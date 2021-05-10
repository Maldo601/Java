package X_LecturaFitxers;
import java.io.*;
// import java.util.Arrays;
/*
    Joan Marc Maldonado
    GitHub: https://github.com/Maldo601
    ----------------------------------------------------------------------------------
    - Testing ... {

        1.- Vectors amb mides exactes.                                                  OK
        2.- Autotancament amb try-with-resources.                                       OK
        3.- Compleix les sortides demanades o molt semblants.                           OK
        4.- Les funcions funcionen correctament.                                        OK
        5.- Escalable a 10.000.000 M                                                    OK
            https://www.mediafire.com/file/6gg0dlrivz7nte5/Primeros10M_Primos.7z/file 
        6.- Temps òptimitzats per usar lectura amb BufferReader.                        Possiblement, óptim. 
            Per 10M tarda aprox 1948 ms. 
    ----------------------------------------------------------------------------------
    - Presenta o he vist o m'he trobat amb problemes del tipo ... {

        - Cap. (crec...)
        - No veig massa clar el tema del columneig espaiat als palindroms.
          Depenent del tamany de les terminals (Vscode, gitCMD, CMD, mingwin64) 
          o de la longitud numèrica es descuadra
          bastant. Potser hagués vist mes òptim tornar un Array...
        - No sé si hi ha una formula secreta per Utefeijar tot un bloc de codi
          amb una sola instruccio de linea. He anat posant als terminals 
          "chcp 650001" per fer-ho. (no uso NetBeans).
        
    ----------------------------------------------------------------------------------
    - Documentació del Programa ... {

        1.- Variables i variables Globals emprades.

            1.1 - Dos flags de posició per extreure els dos numeros amb 
                  distanciament mes gran.
            1.2 - Counter de números Bessons.
            1.3 - Counter de Palindroms. 
            1.4 - Interval temporal.
            1.4 - Contador de números prims totals.
            1.5 - Contador de distància.
            1.6 - Altres... 

        2.- Distance()

            2.1 - Funció que reb el vector plenat del main, als whiles. Es comproba
                  iniciant a 1, per evitar errors d'index, que "i" i "i-1" tinguin 
                  "x" diferencia. Diferencia almacenada a "max", que de no trobar 
                  una diferencia major, no s'actualitza.
            2.2 - Es pesquen amb el mateix procés els dos flags dels nums amb distancia
                  mes alta, que van als globals per extreure després al main, sense 
                  necessitat de reiterar un nou bucle a una nova funció. 
            2.3 - Retorna la maxima distància. 

        3.- InvertirNumero()

            3.1 - Aquesta funció es un braç de la següent. Es una instrucció de revertiment enter
                  que usarà la següent (palindromColumns) a cada cicle de bucle, retornant una inversió
                  per ser comparada amb la no inversió original i determinar si validar polindrom.
                  S'ha usat el mètode de mod i divisió per agafar els caracters numèrics i invertirlos
                  ja que amb una cadena hagues suposat mes cost de temps i de procediment. 

        4.- palindromColumns()

            4.1 - Aquesta funció void, recorre la llargaria del vector principal d'almacenament
                  i en cada volta reserva i actualitza la variable global "num", variable que 
                  a cada volta de bucle, es passa a l'anterior funció com hem dit, actualitzant
                  i revertint cada número del Array. Si el número reservat globalment concorda
                  amb el numero original del vector (actualitzen els dos al mateix temps)
                  es printa per pantalla amb el format de 6 espais + num. 

            4.2 - En aquesta segona part, si hi ha la singularitat que no hi ha palindroms 
                  (counter a 0), es genera i propaga un nou error que ho notifica.

        5.- Main()

            - Mètode resolt a classe. S'han millorat seguint les explicacions i exemples donats 
              el tema de passar el buffer i la ruta als recursos del try per tancar implicitament.
              No entenia massa bé el tema de la crida del fitxer i definia el nom a una variable.
              De la manera que es presenta, només crida fitxers existents a la carpeta o ruta 
              entrada com a arguments. 

*/
public class B_Primers100k {
    static int flag1 = 0;
    static int flag2 = 0;
    static int gem = 0;
    static int num = 0;
    static int distance (int v[ ]){
        int max = 0;
        for (int i = 1; i < v.length; i ++){
            if(v[i] - v[i-1] > max ){
                max = v[i] - v[i-1];
                flag1 = v[i-1];
                flag2 = v[i];
            }
            if (v[i] - v[i-1] == 2) gem++;
        }   
        return max;
    }
    static int invertirNumero(int num){
        int xifra, invers = 0;
        while(num!=0){
            xifra = num%10;
            invers = (invers * 10) + xifra;
            num/=10;
        }
        return invers;
    }
    static void palindromColumns (int v[]){
        int count = 0;
        for (int i = 0; i < v.length; i ++){
            num = invertirNumero(v[i]);
            if(v[i] == num){
                System.out.print(String.format("%6d", num)); // Camp de 6 precedits d'espai.
                count++;
            }
        }
        if (count == 0){
            try {
                throw new Exception("");
            }catch (Exception e) {
                System.out.println("No s'han trobat palíndroms.");
            }
        }else{
            System.out.print("\n");
            System.out.println("Trobats " + count + " Palíndroms.");
        }
    }
    public static void main (String[] args){
        int linies = 0;
        String c = "";
        int counter = 0;
        long temps = System.currentTimeMillis();
        int v[];
        if (args.length != 1){
            System.out.println("\nPrograma per llegir una llista de primers d'un fitxer\n" + 
                               "-----------------------------------------------------  \n"  +
                               "Ha de passar al programa el nom d'un fitxer de text    \n"  +
                               "contenint números primers. El programa farà una serie  \n"  +
                               "d'operacions amb aquests primers. No s'han passat      \n"  +
                               "arguments al programa. L'execució no pot continuar.");
        }else{
            // Primer try, conta linies per determinar la longitud del vector.
            try(FileReader fr = new FileReader(args[0])) {
                BufferedReader bRead = new BufferedReader(fr);
                while((c = bRead.readLine()) != null){
                    linies++;
                }
                    
            }catch(Exception e){
                System.out.println("S'ha produit un error.\n ");
                // e.printStackTrace();
            }
            // Vector de Sortida.
            v = new int [linies];
            try (FileReader fr = new FileReader(args[0])){
                BufferedReader bRead = new BufferedReader(fr);
                while((c = bRead.readLine()) != null)
                    v[counter++] = Integer.parseInt(c);  
                // System.out.println(Arrays.toString(v));
                System.out.println("\nTrobat un total de " + linies + " numeros prims.\n"     +
                                   "--------------------------------------------------\n"     +
                                   "La distancia mes gran entre dos numeros consecutius es: " + 
                                    distance(v) + "\n");
                System.out.println("Numero -> " + flag1);
                System.out.println("Numero -> " + flag2);
                System.out.println("Gemelos-> " + gem);
                palindromColumns(v);
            }catch (Exception e){
                System.out.println("\nError al processar el fitxer. \n");
                System.out.println(e.getMessage());
                // e.printStackTrace();
            }
            System.out.println("Execution time: " + (System.currentTimeMillis() - temps) + " ms.");
        }
    }
}
    