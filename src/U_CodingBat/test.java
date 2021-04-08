package U_CodingBat;

public class test {
    // Rotar cadenes. 
    public String left2(String str) {
        return str.substring(2,str.length()) + str.substring(0,2);
    }
    // Rotar cadenes a la dreta "Hello -> loHel"
    public String right2(String str) {
        return str.substring(str.length()-2) + str.substring(0, str.length()-2);
    }
    // True retorna primer caracter. False últim
    public String theEnd(String str, boolean front) {
        if (front == true)
          return ""+str.charAt(0);
        return str.substring(str.length()-1);
    }
    // Retallar primer i ultima posicio. 
    public String withouEnd2(String str) {
        return (str.length() <= 2) ? ""
                                   : str.substring(1, str.length()-1) ;
    }
    // Torna els dos caracters de la mitat d'una cadena
    public String middleTwo(String str) {
        String cad = str.substring( (str.length()/2)-1);
        return cad.substring(0,2);
        // Torna tres caracters del mig de una cadena:
        //     return cad.substring(0,3);
    }
    // Torna boolean si el patro acaba en "ly"
    public boolean endsLy(String str) {
        if ( str.length() < 2 )
          return false;
        return (str.substring(str.length()-2).equals("ly")) ? true 
                                                            : false;
    }
    // Torna la cadena tallada per front i back (n)
    public String nTwice(String str, int n) {
        return str.substring(0,n) + str.substring(str.length()-n);
    }
    // Agafa partint de l'index un caracter mes. Si no es possible o l'index passat
    // no es valid, torna els dos primers caracters de la cadena. 
    public String twoChar(String str, int index) {
    return ( str.length() > index+1 && index >= 0 ) ? str.substring(index, index+2)
                                                    : str.substring(0, 2);
    }
    /* Retorna true o false si la string conté el patró "bad" al index 0 o 1.
       Té en compte casos d'error de pas de parametre. 
    */
    public boolean hasBad(String str) {
        int i = str.indexOf("bad");
        if (i != -1 && i <= 1)
          return true;
        return false;
    }
    // Un altre exemple de l'anterior proposat per CodingBat diferent al meu. 
    public boolean hasBad2(String str) {
        if (str.length()>=3 && str.substring(0, 3).equals("bad")) 
          return true;    
        if (str.length()>=4 && str.substring(1, 4).equals("bad")) 
          return true;
        return false;
        // Solution notes: basically want to call substring(0, 3) and
        // substring(1, 4) and check if that equals "bad". Need to check
        // the length first so as to not go off the end of the string.
        // Alternately one could use indexOf() -- that code is short
        // but it runs much slower, since it needlessly checks over the whole
        // string.
    }
    /* Retorna els dos primers caracters. Si nomes hi ha un caracter retorna caracter + @
       si no hi ha res, dos arrobes.
    */
    public String atFirst(String str) {
        if (str.equals(""))
          return "@@";
        return (str.length() <= 1 ) ? str.substring(0) + "@" : str.substring(0,2) ;                         
    }
    /* 
       Retorna la primera lletra de A i la ultima de B
       Si la cadena es buida es retorna una "@"
    */
    public String lastChars(String a, String b) {
        String cad = "";
        if ( a.equals("") && b.equals("") )
          return "@@";
        if ( a.equals("")){
          cad = "@";
          return cad + b.substring(b.length()-1);
        }
        if ( b.equals ("")){
          cad = a.charAt(0) + "@";
          return cad;
        }
        return a.charAt(0) + b.substring(b.length()-1, b.length());
      }
      
      
      
      
      
      
      
    public static void main (String[] args){
        
    }
}
