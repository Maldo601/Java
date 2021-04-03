package P_FuncionsII;

public class D_CharVegadesCad {

  public static int quantesVegades(String cad, char c) {
    int counter = 0;
    int position;
    position = cad.indexOf(c);
    // Usem -1 per a que el bucle corrigue, ja que no es una posicio valida de la cadena.
    while (position != -1) {
      counter++;
      position = cad.indexOf(c, position + 1);
    }
    return counter;
  }

  public static void main(String[] args) {
    System.out.println(quantesVegades("eccca", 'c'));
  }
}
