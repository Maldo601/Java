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
        5.- Detecta nifs no vàlids presentant interrogant a lletra o complets. ( Resultat 0 )
        6.- Validador.
        7.- Funció principal.
        8.- Ramificador.
        9.- Tira els errors i reitera la entrada de donarse el cas hasta ser valida i passarla.
        10. Es compleix la sequència relacional de resultat retornat en base als
            interrogants introduits (10,100,1000,10000,100000...)
        11. Resolts problemes de duplicitats.
        12. Es pot considerar un programa amb un paradigma de Força Bruta

    - Presenta problemes del tipo ... {

        1.- Excés de variables globals i codi complicat d'entendre si passen uns dies sense veurel.
        2.- No es recursiu, pero alguna pinzellada té.

    - Documentació del Programa:

        - addStringArray{} esta montada amb un bucle While que itera un milló
          de vegades, (si la plantilla es true), necessaries per a 6 interrogants 
          lletra interrogant inclosa amb 100.000 resultats. Es adaptable baix 
          modificació.

        - El primer for s'encarrega de copiar a nifsOk la cadena, amb interrogants inclosos.
          Es detecta si el contingut de nifsOk conté interrogants i de ser el cas que si
          es crida a un generador d'aleatoris, que substitueixen interrogants. Es -1 perque
          suprimim el pase de la lletra al parsejador. S'evita que la lletra interrogant
          sigui convertida a numeros aleatoris i es permet tractar la part digital.

        - En aquest moment s'entra a validar si la funció ValidNif retorna true o false.
          Pot retornar dos trues, el de que te lletra o el de que es desconeguda.
          En ambdos casos de true, reservara una lletra correcta amb una part digital aleatoritzada
          vàlida. Si te lletra al passarli, l'agafarà de la variable global "lletra1" i comprobara
          si la lletra operacional resultant d'una combinació aleatoria de la part interrogant digital
          és vàlida i es equal a l'introduida. 

          En la resta de casos, es generarà un historial de registres digitals en base a un vector
          de longitud 1 amb la primera posició a "null" que serà incrementat de longitud a mesura que
          se li passen datos de registre sense la lletra, vàlids, tot el que sigue valid assignable a una 
          lletra, es printara. El que no, es descarta d'entrar al registre i desapareix. 

          Si es dona el cas que la lletra és interrogant, entrarà al primer true, haurà
          randomitzat els interrogants dels digits i extreura en base a estos la lletra operacional
          valida correpsonent als digits correctes a aquesta i registrara la part digital a
          "historial[ historial.length -1 ]" Si els resultats son correctes, entra al else 
          de !comprova i aumenta el counter dels nifs valids trobats i imprimix el resultat.
          Es pot comprovar descomentant el print del historial.

          Aquests cicles de comparatius estan regits per nifs[8] + "" + lletraoperacional.
          Si la lletra es interrogant i digits tambe, no farà aquesta operació. 

          Amb això s'imprimiran tots els resultats vàlids sense duplicitats. 
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
    
    // PLANTILLA D'ENTRADA CORRECTA
    static boolean nifCorrecte(String nif){
        if (nif.length() != 9)
                return false;
        // Tenia que posar aixo a algun puesto perque al main trencava el programa.
        lletra1 = String.valueOf( nif.charAt( 8 ));
        int interrogants = 0;
        if (nif.length() != 9)
                return false;
        if (!"TRWAGMYFPDXBNJZSQVHLCKE?".contains(String.valueOf(nif.charAt(nif.length()-1))))
                return false;
        for ( int i = 0; i < nif.length()-1; i++){
            if ( nif.charAt( i ) == '?' )
                interrogants++;
                if (!"0123456789?".contains(String.valueOf(nif.charAt(i))))
                return false;
        }
        //Si s'incrementa per damunt de 6, s'ha d'afegir un "0" al WHILE de addString Array
        if (interrogants > 6)//------------------------------------------------*
            return false;                                                      //
        return true;                                                           //                            
    }                                                                          //                               
    // FUNCIO PRINCIPAL                                                        //         
    static void addStringArray (String nif){                                   //
        int numNIFs = 0;                                                       //                           
        if (nifCorrecte(nif)==true){                                           //
            int i = 0;                                                         //            
            // Incrementar un 0 si es modifica el limit d'interrogants.        //      
            while (i <= 1000000){ //--------------------------------------------* 
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
                if ( validNif( Validar )){  
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
                            // OUTPUT FINAL
                            //System.out.println( Arrays.toString( nifsOk ));
                        //  System.out.println( Arrays.toString( historial ));
                        }
                    }
                    // Counter de repetició
                    i++;
                }
            System.out.println("\nS'han trobat " + numNIFs + " DNI's vàlids.");
        }else{
        
        }
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
    
    // BUCLE MAIN METHOD 
    public static void main (String[] args){
        lect = new Scanner( System.in );
        System.out.print( "Introdueix els caràcters del NIF incomplet, indicant en ? el caracter desconegut: " );
        String nif = lect.nextLine();
               nif.toUpperCase();
               DNI = nif;
               // Fi de la recursivitat d'error. Mort del Programa.
               if (nif.equals("ESC")){
               System.exit(0);
            }
        // Validació d'entrada
        if (nifCorrecte(nif) == true)
            addStringArray(nif);
            else if (!nifCorrecte(nif) == true){
                //Errors i reiteració d'entrada.
                System.out.println("\n\tError Fatal. Format d'entrada no vàlid. Possibles causes: ");
                System.out.println("\t\t-Lletres a la part numèrica.");
                System.out.println("\t\t-Números a la part de la lletra.");
                System.out.println("\t\t-Longitud Incorrecta.");
                System.out.println("\t\t-Superat límit operacional d'interrogants." + "\n");
                System.out.println("\n\t-Introdueix les dades de nou o escriu \"ESC\" per sortir." + "\n");
                /*  
                   A partir d'aquí s'em plantejen dubtes de codi existencials, com si el programa
                   senser ha acabat sent recursiu perque el main es recursiu cridantse a ell mateix i cridant
                   al seu contingut cuan es crida a ell mateix. Tot i no resoldre-ho recursivament
                   
                */
                main(args);
            }
        }
    } 
//... Continuará, idea de passarlo a una app d'escriptori amb JavaFX o Swing o algun Builder. 

