package P_FuncionsII;

public class B_MajorTres {

    static int major3(int a, int b, int c) {
        return Math.max(Math.max(a, b), Math.max(a, c));
    }

    public static void main(String[] args) {
        System.out.println(major3(3, 5, 9));
    }
}
