package P_FuncionsII;

public class E_QuantsEspais {

  static int quantsEspais(String str) {
    return D_CharVegadesCad.quantesVegades(str, ' ');
  }

  public static void main(String[] args) {
    System.out.println(quantsEspais("Hola que tal?"));
  }
}
