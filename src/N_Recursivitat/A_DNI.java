package N_Recursivitat;
import java.util. *;
/*
    Joan Marc Maldonado
    GitHub: https://github.com/Maldo601
    -------------------------------------------------------------------------------------------------------------
    - El programa funciona correctament en els casos de

        1.- Nif complet. 
        2.- Nif amb part digital completa i lletra interrogant. 
        3.- Nif amb interrogants a la part digital i lletra interrogant.
        4.- Nif amb lletra establerta i part digital amb interrogants.
        5.- Validador.
        6.- Funció principal
        7.- Ramificador
        8.- Missatge d'error si la part Alfabètica és numèrica.

    - Presenta problemes a resoldre amb NIFS de...{

        1.- Nif amb lletra establerta i part digital amb interrogants.
            Retorna una aleatorietat de lletres valides corresponents a la combinació
            de números, tot i estar el resultat vàlid entre ells, necessita ser filtrat. 
                
                R: Resolt amb la extraccio desde llegeixNif() de dos variables globals que son cridades a 
                   la ramificació booleana si s'entra un DNI com he especificat. 

        2.- Excés de variables globals i codi complicat de lectura. 
        3.- No demana reiteradament el DNI en cas de mala introducció.
        4.- No és recursiu, pero funciona.
        5.- El programa peta si es passen lletres a la part digital. 
*/
public class A_DNI {
    // VARIABLES GLOBALS 
    static String [] nifsOk = new String[ 9 ];    // Vector Principal
    static int numNIFs = 0;                       // Quantitat de NIFS 
    static String Validar = "";                   // Part digital després de randomitzar.
    static char lletraOperacional;                // Lletra Assignable a digits.
    static String lletra1 = "";                   // Lletra Original.
    static String DNI = "";                       // DNI complet entrat.
    static Scanner lect;                          // Scanner de lectura.
    static String historial [] = new String[ 1 ]; // Logs DNI, Array de longitud incrementable, inicia a 1.
    static List <String> list = Arrays.asList( historial) ;
    // FUNCIO DE LECTURA
        /* S'encarrega de registrar a la variable NIF */
    static String llegeixNif(){
        lect = new Scanner( System.in );
        System.out.print( "Introdueix els caràcters del NIF incomplet, indicant en ? el caracter desconegut: " );
        String lectura = lect.nextLine();
               lectura.toUpperCase();
               DNI = lectura;
               lletra1 = String.valueOf( lectura.charAt( 8 ));
        return lectura;
    }
    static boolean nifCorrecte(String nif){
        int interrogants = 0;
        boolean interrogant = false;
        boolean maxEnter = false;
        boolean lastLetter = false;
        // Al passar lletres retorna true, arreglar. 
        // Funciona en true passantli
        /*
            - 8 digits 1 lletra
            - 8 digits en interrogants i lletra
            - 8 digits en interrogants i lletra interrogant
        */
        for ( int i = 0; i < nif.length(); i++){
            if ( nif.charAt( i ) == '?' )
                interrogants++;
                
            if (nif.charAt( i ) <= 9 || nif.charAt( i ) >= 0 || nif.charAt( i ) == '?' )
                maxEnter = true;
            if (!nif.substring( 8 ).matches( "\\d*" ))
                lastLetter = true;
        }
        if (interrogants <= 6)
            interrogant  = true;
        if ( (interrogant && maxEnter && lastLetter) == true )
            return true;
        return false;
    }
    // FUNCIO PRINCIPAL
    static void addStringArray (String nif){
        if (nifCorrecte(nif)==true){
            int i = 0;
            while ( i <= 1000){   
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
                                numNIFs++;
                                System.out.println( Arrays.toString( nifsOk ));
                            }
                        }
                    i++;
                }
            System.out.println("\nS'han trobat " + numNIFs + " DNI's vàlids.");
        }else
        System.out.println("\n\tError Fatal. Format d'entrada no vàlid");
    }
    // RAMIFICACIO OPERACIONAL BOOLEANA
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
    public static void main (String [] args){
        String nif = llegeixNif();
        System.out.println("\n");
        addStringArray(nif);
        }
    }


