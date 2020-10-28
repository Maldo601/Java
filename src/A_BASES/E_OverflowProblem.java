package A_BASES;
public class E_OverflowProblem {
    public static void main(String[] args) throws Exception {
        // En el siguiente caso veremos como arreglar un problema
        // de desbordamiento (overflow). Partimos de la base que un
        // println (3000000000) nos desborda y tira error. 
        // Lo solucionamos de la siguiente forma.
        System.out.println(3000000000L);
    }
}
