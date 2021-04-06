package P_FuncionsII;

public class H_Bruixes {
  static String str;;
  // Genera una cadena de longitud "n" amb els caracters que formen
  // una bruixa, aleatoritzats.
  static String explanada(int n) {
    String cad = "=()";
    str = "";
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
  static String explanadaBruixa(int n) {
    String cad = explanada(n);
    return ( explanada(n).length() >= 10 &&
             explanada(n).length() < 100 &&
             hiHaBruixa(cad) == true ) 
              ? cad 
              : "";
  }
  // http://lineadecodigo.com/java/contador-de-ocurrencias-en-java/
  static int quantesBruixes(String explanada){
    int counter = 0;
    String cad = "=()=";
    while (explanada.indexOf(cad) > -1) {
      explanada = explanada.substring(explanada.indexOf(cad) + cad.length(), explanada.length());
        counter++; 
    }
    // System.out.println(str);
    return counter;
  }
  static String explanadaDeBruixes ( int n, int numBruixes ){
    return ( explanada(n).length() >= 50 &&
             explanada(n).length() < 1000 &&
             quantesBruixes(str) >= numBruixes ) 
              ? str + "\n" + quantesBruixes(str)
              : "";
  }
  static String mataBruixa (String explanada){
    int i = explanada.indexOf("=()=");
    return explanada.substring(0,i) + explanada.substring(i+4);
  }
  // Pendent
  static int mataBruixes ( String explanada ){
    int counter = 0;
    while (quantesBruixes(explanada) > 0)
           explanada = mataBruixa(explanada);
           counter++;
      return counter;
  }
  public static void main(String[] args) {
    // System.out.println(quantesBruixes(explanada(80)));
    //   System.out.println(explanadaDeBruixes(800, 5));
    //      System.out.println(mataBruixa("))(=()=))))()"));
              System.out.println(mataBruixes("=(=(=()=)=)="));
  }
}
