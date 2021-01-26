package I_Arrays;
/*
    - Joan Marc Maldonado Negre. G2 DAW 
*/
public class J_SopaSimple {
    public static void main (String[] args){
        // Palabras. 
        final String words [] = { 
            "patata", "ancla", "huevo",
            "switch", "ventana", "plus",
            "altavoz", "supercalifragilistico", "internet",
            "comic"};
          // Matriz Sopera 
          final char soup[][] = { 
            {'p','a','t','a','t','a','i','u','o','b'},
            {'i','n','t','a','t','b','n','i','o','l'},
            {'z','c','o','m','i','v','t','a','a','u'},
            {'z','l','a','p','i','z','e','f','w','s'},
            {'a','a','l','o','l','a','r','t','t','p'},
            {'a','l','t','a','v','o','n','w','f','l'},
            {'i','t','a','a','h','u','e','v','o','u'},
            {'r','a','n','v','e','n','t','a','a','s'},
            {'e','v','e','n','t','a','n','a','a','a'},
            {'c','o','m','i','c','s','u','p','e','r'}, 
        };
        /*
           Ese ejercicio me supuso un extenso trabajo mental. Primero intenté con un shift+L modificar los 'chars'
           para ponerlo todo a string i cambiar el tipo de vector a String. Descarté esa idea porque no era lo que 
           el maestro probablemente hubiera querido y no le veía el sentido.
           Pero gracias a ello se me ocurrió... "pero puedo parsear los caracteres a una
           supercadena String". Entonces eso me dio la primera idea para proceder a ese ejercicio y no caer en una metodologia
           de pensamiento de "voy a meter 50.000 bucles anidados con cosas y breaks.". También me hizo rehuyir de los booleanos. 
           No terminé de entender como iba el tema de los booleanos aplicados a eso, aunque algun flash al ejercicio del ajedrez me vino. 
           Y aquel ejercicio me supuso una quiebra a mi vida de dos dias de trabajo. Por tanto, decidí almacenar las verticales y horizontales, letra a letra
           en dos variables String, que serían analizadas por dos bucles independientes, buscando si contenian alguna posicion
           de "words[]". Y salió eso: ( Y funcionó. ) ( Y no repite cosas ) ( Y no tiene breaks ni interrumpe nada. )
                                      ( Y contiene una depuradora de falsos en la sopa). 

           Me gusta porque es muy simple de leer. Óptimo? Quién sabe... 

        */
        // Almacenamiento de supercadenas.
        String horizontales ="";
        String verticales="";
        String depuradora="";
        // Constructor/Parseador de chars a supercadenas. 
        for ( int x = 0; x < soup.length; x++){
            for ( int y = 0; y < soup[0].length; y++){
                horizontales += Character.toString(soup[x][y]);
                verticales += Character.toString(soup[y][x]);
            }
        }
        // Analisis de Verticales 
        for ( int v = 0; v < words.length; v++){
            if (verticales.contains(words[v]) ){
            System.out.println("Se encontró en vertical: " + words[v]);
            depuradora += words[v];
            }
        }
        // Analisis de Horizontales.
        for ( int h = 0; h < words.length; h++){
            if (horizontales.contains(words[h]) ){
            System.out.println("Se encontró en horizontal: " + words[h]);
            depuradora += words[h];
            }
        }
        // Depuradora. 
        for (int d = 0; d < words.length; d++)
            if (!depuradora.contains(words[d]))
            System.out.println("No se encontró: " + words[d]);
    }
}

// MALDO // 
