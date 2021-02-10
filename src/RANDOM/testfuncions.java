package RANDOM;

public class testfuncions {
    // Public es si volem accedir a esta funcio desde fora de la clase. Per tant no es necessari que 
    // posessem de moment modificador d'accés. Si no ho posem tindrem un accés default, el que vol dir que desde 
    // els nostres paquets i desde fora podrem acceder. Private es que nomes podem accedir desde aqui. 
    // STATIC es un modificador que diu que esta funcio, per invocarla, necessito crear un objecte de la clase. 
    // Totes per defecte seran estatiques. Private o nada. 


   /* private static void mensaje(String dia){
        System.out.println("\n\tAyer " + dia + " hacia calor.");
        
    }
    */
    public static void main (String[] args){
        //mensaje("miercoles"); 
        System.out.println(primeroMayor(10, 5));   // Podem usar metodes i multiplicacions ifato aqui dins. 
    }                           // 
    static boolean primeroMayor(long a, long b){     // No te relació en les variables. Nomes la posicio es la important                                    
        //Retorna true si a > b i false si a < b    
        return a > b;
    }
    static boolean primeroMayor(int a, int b){     // No te relació en les variables. Nomes la posicio es la important                                    
        //Retorna true si a > b i false si a < b    
        return a > b;
    }
    static boolean primeroMayor(byte a, byte b){
        return a > b;
    }
}
