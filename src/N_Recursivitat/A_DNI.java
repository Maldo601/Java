package N_Recursivitat;
import java.util. *;
/*
    Joan Marc Maldonado
    GitHub: https://github.com/Maldo601
    ----------------------------------------------------------------------------------
    - El programa funciona correctament en els casos de

        1.- Nif vàlid  complet. 
        2.- Nif vàlid amb part digital completa i lletra interrogant. 
        3.- Nifs vàlids amb interrogants a la part digital i lletra interrogant.
        4.- Nifs vàlids amb lletra establerta i part digital amb interrogants.
        5.- Detecta nifs no vàlids presentant interrogants o complets. ( Resultat 0 )
        6.- Validador.
        7.- Funció principal.
        8.- Ramificador.
        9.- Missatge d'error si la part Alfabètica és numèrica.
        10. Es compleix la sequència relacional de resultat retornat en base als
            interrogants introduits (10,100,1000,10000,100000...)

    - Presenta problemes del tipo ... {

        1.- Excés de variables globals i codi complicat de lectura. 
        2.- No demana reiteradament el DNI en cas de mala introducció.
        3.- No és recursiu, pero funciona.
        4.- El programa peta si es passen lletres a la part digital. 
*/
public class A_DNI {
    // VARIABLES GLOBALS 
    static String [] nifsOk = new String[ 9 ];             // Vector Principal                                
    static String Validar = "";                            // Part digital després de randomitzar.
    static char lletraOperacional;                         // Lletra Assignable a digits.
    static String lletra1 = "";                            // Lletra Original.
    static String DNI = "";                                // DNI complet entrat.
    static Scanner lect;                                   // Scanner de lectura.
    static String historial [] = new String[ 1 ];          // Logs DNI, Array de longitud incrementable, inicia a 1.
    static List <String> list = Arrays.asList(historial);
    // FUNCIO DE LECTURA INICIAL 
    static String llegeixNif(){
        lect = new Scanner( System.in );
        System.out.print( "Introdueix els caràcters del NIF incomplet, indicant en ? el caracter desconegut: " );
        String lectura = lect.nextLine();
               lectura.toUpperCase();
               DNI = lectura;
               lletra1 = String.valueOf( lectura.charAt( 8 ));
        return lectura;
    }
    // PLANTILLA D'ENTRADA CORRECTA
    static boolean nifCorrecte(String nif){
        int interrogants = 0;
        boolean interrogant = false;
        boolean maxEnter = false;
        boolean lastLetter = false;
        for ( int i = 0; i < nif.length(); i++){
            if ( nif.charAt( i ) == '?' )
                interrogants++;
                
            if (nif.charAt( i ) <= 9 || nif.charAt( i ) >= 0 || nif.charAt( i ) == '?' )
                maxEnter = true;
            if (!nif.substring( 8 ).matches( "\\d*" ))
                lastLetter = true;
        }
        //Si s'incrementa per damunt de 6, s'ha d'afegir un "0" al WHILE de addString Array
        if (interrogants <= 6)//------------------------------------------------*
            interrogant  = true;                                               //
        if ( (interrogant && maxEnter && lastLetter) == true )                 //
            return true;                                                       //
        return false;                                                          //                            
    }                                                                          //                               
    // FUNCIO PRINCIPAL                                                        //         
    static void addStringArray (String nif){                                   //
        int numNIFs = 0;                                                       //                           
        if (nifCorrecte(nif)==true){                                           //
            int i = 0;                                                         //            
            // Incrementar un 0 si es modifica el limit d'interrogants.        //      
            while ( i <= 1000000){ //-------------------------------------------* 
                    // Passa indiscriminadament una cadena al vector. 
                    for (int x = 0; x < nif.length(); x++){
                        nifsOk[x] = String.valueOf(nif.charAt(x));
                    }
                    // Generadora de numeros aleatoris si hi han interrogants.
                    String numP = "";
                    Validar = "";
                    for ( int y = 0; y < nif.length()-1; y++){
                        if (nifsOk[y].equals("?")){
                            numP = String.valueOf( (int) (Math.random() * (9-0+1)) + 0);
                            nifsOk[y] = numP;
                        }
                        Validar += nifsOk[y];
                    }
                    boolean comprova = false;
                    if(!validNif(Validar)){ 
                        nifsOk[ 8 ] = "" + lletraOperacional;
                    } 
                    if ( validNif( Validar )){ // Sempre arribara en lletra. 
                        List<String> list = Arrays.asList( historial );
                        if( !list.contains( Validar ) ){
                            historial = Arrays.copyOf( historial, historial.length + 1 );
                            historial[ historial.length -1 ] = Validar; 
                        }
                        else 
                        comprova = true;
                            if( !comprova ){
                                // Counter de NIFS vàlids
                                numNIFs++;
                                // Output Final
                                System.out.println( Arrays.toString( nifsOk ));
                            }
                        }
                    // Counter de repetició
                    i++;
                }
            System.out.println("\nS'han trobat " + numNIFs + " DNI's vàlids.");
        }else
        System.out.println("\n\tError Fatal. Format d'entrada no vàlid");
    }
    // RAMIFICACIO OPERACIONAL BOOLEANA
    /*
        Originalment la segona part (!) no estaba. No obstant al detectar que 
        tots els casos operaven be menys els que tenien la lletra i interrogants, es fa necessari
        reservar la original entrada, de no ser aixi la primera part la maxacaba, ja que
        al haver una part digital completa, aleatoritzada o no, reassignaba la lletra per una valida, sent
        diferent de la introduida. En cada una es compara si la lletra entrada originalment
        correspon a la part numerica.  
    */
    static boolean validNif(String nif){ 
        if (lletra1.equals("?")){
            String lastLetter = nifsOk[8];
            lletraOperacional = "TRWAGMYFPDXBNJZSQVHLCKE".charAt((Integer.parseInt(nif) % 23));
            if (lastLetter.equals(String.valueOf(lletraOperacional)))
                return true;
            }
        else if(!lletra1.equals("?")){
            lletraOperacional = "TRWAGMYFPDXBNJZSQVHLCKE".charAt((Integer.parseInt(nif) % 23));
            if (lletra1.equals(String.valueOf(lletraOperacional)))
                return true;
        }
        return false;
    }
    // MAIN 
    public static void main (String [] args){
        String nif = llegeixNif();
        System.out.println("\n");
        addStringArray(nif);
        }
    }


