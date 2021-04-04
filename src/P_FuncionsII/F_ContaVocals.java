package P_FuncionsII;
public class F_ContaVocals {
  // Retorna un enter que son totes les vegades que es reemplaça una vocal
  // quan es troba al patró.
  static int quantesVocals(String cad, String sonVocals) {
    return cad.replaceAll(sonVocals, "").length();
  }
  public static void main(String[] args) {
    System.out.println( quantesVocals("Ara no el trobarà", "[^AEIOUaeiouÁÉÍÓÚÀÈÌÒÙáàéèíìóòúùÄËÏÖÜäëïöü]") );
  }
}
