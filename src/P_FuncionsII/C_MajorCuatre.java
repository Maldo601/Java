package P_FuncionsII;

public class C_MajorCuatre {

  static int major4(int a, int b, int c, int d) {
    return Math.max(Math.max(a, b), Math.max(c, d));
  }

  public static void main(String[] args) {
    System.out.println(major4(3, 4, 5, 6));
  }
}
