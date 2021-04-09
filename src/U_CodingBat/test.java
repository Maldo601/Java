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
      // Concatena les dos parts. Si el final de "a" es == al principi de "b", elimina el caracter.
    static String conCat(String a, String b) {
        if (a.equals(""))
            return b;
        if (b.equals(""))
            return a;
        if (a.substring(a.length()-1).equals(""+b.charAt(0)))
            return a + b.substring(1);
        return a + b;
      }
    // Permutar la posicio dels dos ultims caracters i contempla la nulitat o monocaracter
    static String lastTwo(String str) {
        if (str.length() >= 2){
          String cad = str.substring(0,str.length()-2);
          String last = str.substring(str.length()-1);
          String pre = str.substring(str.length()-2);
          return cad + last + ""+pre.charAt(0);
        }
        if (str.length() == 0)
          return "";
        return str;
      }
    // Retorna el color si apareix al principi de la cadena:
    static String seeColor(String str) {
        if(str.indexOf("red") == 0)
          return "red";
        if(str.indexOf("blue") == 0)
          return "blue";
        return "";
      }
    // Retorna true si els dos primers caracters son iguals als dos ultims caracters
    static boolean frontAgain(String str) {
        if( str.length() < 2)
          return false;
        return (str.substring(0,2).equals(str.substring(str.length()-2))) ? true : false;
    }
    // Retorna una cadena concatenada a la mesura de la mes petita passada
    static String minCat(String a, String b) {
        if (a.length() > b.length())
          return a.substring(a.length()-b.length()) + b;
          else if(a.length() < b.length())
            return a + b.substring(b.length() - a.length());
        return "";
      }
    // Retorna 3 vegades els dos primers caracters. Si es mono caracter 1. 
    static String extraFront(String str) {
    String cad = "";
        for (int i = 0; i < 3; i++){
          if(str.length() > 1)
            cad += str.substring(0,2);
          else if (str.length() == 1)
            cad += str.substring(0);
        }
        return cad;
    }
    // Si els dos primers caracters son iguals als dos ultims, lleva els primers dos i torna str. 
    // Si no, torna cadena sencera 
    static String without2(String str) {
        if (str.length()==1)
          return String.valueOf(str.charAt(0));
        else if (str.equals(""))
          return "";
        if ( str.substring(0,2).equals(str.substring(str.length()-2 )))
          return str.substring(2, str.length());
        return str;
      }
    // Porta Booleana.
    /*
    Si teniu una cadena, torneu una versió sense els 2 primers caràcters. 
    Excepte guardeu el primer caràcter si és "a" i mantingueu el segon caràcter si és "b". 
    La corda pot tenir qualsevol longitud. Més difícil del que sembla
    */
    static String deFront(String str) {
  
      if( str.charAt(0) == 'a' && str.charAt(1) != 'b')
        return str.replaceFirst(""+str.charAt(1), "");
    
      if (str.charAt(1) == 'b' && str.charAt(0) != 'a')
        return str.substring(1);
        
      if (str.charAt(0) == 'a' && str.charAt(1) == 'b' && str.length() <= 3)
        return str;
        
      if (str.charAt(0) == 'a' && str.charAt(1) == 'b' && str.length() > 3)
        return str;
      
      if (str.charAt(0) != 'a' && str.charAt(1) != 'b' && str.length() > 2)
        return str.substring(2);
    
      return "";
    }
  /* 
     Retorna una cadena de la longitud de la segona paraula on si la primera lletra
     no es igual a la de la primera paraula, es permuta a aquesta, aquest caracter.
     Si les lletres seguents, alguna no coincideix amb el contingut de la primera, es retorna
     cadena buida. Mes info al penultim exercici de Strings 1 de codeBat.
  */
  static String startWord(String str, String word) {
  
    if (!str.contains(word.substring(1,word.length())))
      return "";
      
    if (str.length() < word.length() )
      return "";
      
    if( str.contains(word) )
      return str.substring( 0 ,word.length() );
    
    if ( str.charAt(0) != word.charAt(0) )
      return word.replaceFirst(""+word.charAt(0), ""+str.charAt(0));
  
    return "";
  }
  
    
      
      

    public static void main (String[] args){
        System.out.println(conCat("abc","cat"));
    }
}
