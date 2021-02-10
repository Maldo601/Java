package K_FuncionsClase;

public class exercici1 {
    // MAX IV
    private static int mayor4 (int a, int b, int c, int d) {
        // o return max2(max2(a,b),max2(c,d))
        int mayor4 = Math.max(Math.max(a,b), Math.max(c,d));
        return mayor4;
    }
    // MAX III
    private static int maxim3 (int a, int b, int c){
        // o return max2(a,max2(b,c))
        int maxim3 = Math.max(Math.max(a,b), Math.max(b,c));
        return maxim3;
    }
    // MAX II 
    private static int max2 (int a, int b){
        int max2 = Math.max(a,b);
        return max2;
    }
    public static void main(String[] args){
        System.out.println(mayor4(80,16,27,32));
        System.out.println(maxim3(78,89,90));
        System.out.println(max2(89,88));
    }
}
// M A L D O 
