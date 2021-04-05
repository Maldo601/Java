package P_FuncionsII;

public class H_Bruixes {

  // Genera una cadena de longitud "n" amb els caracters que formen
  // una bruixa, aleatoritzats.
  static String explanada(int n) {
    String cad = "=()";
    String str = "";
    for (int i = 0; i < n; i++) {
      int num = (int) (Math.random() * cad.length());
      str += String.valueOf(cad.charAt(num));
    }
    return str;
  }
  // Comprova si el patró conté almenys una bruixa.
  static boolean hiHaBruixa(String cad) {
    return cad.contains("=()=");
  }
  // Torna una cadena de longitud "n" >= 10 i < 100. Almenys 1 bruixa.
  static String explanadaBruixes(int n) {
    String cad = explanada(n);
    return ( explanada(n).length() >= 10 &&
             explanada(n).length() < 100 &&
             hiHaBruixa(cad) == true ) 
              ? cad 
              : "";
  }
  static int quantesBruixes(String explanada){
    int counter = 0;
    for ( int i = 0; i < explanada.length(); i++){
        if ( explanada.contains(String.indexOf("=()=")) )
            counter ++;
    } 
    return counter;
  }
  public static void main(String[] args) {
    System.out.println(quantesBruixes(explanada(20)));
    // System.out.println(explanadaBruixes(80));
  }
}
