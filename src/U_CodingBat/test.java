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
      
      
      
      
      
    public static void main (String[] args){
        
    }
}
