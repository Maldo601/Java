package M_TryCatch;
/*
    Si una instruccion provoca una excepcion, se salta al catch.
    No podemos evitar que el error se produzca, pero podemos evitar que el programa pete
    capturando la excepcion producida y gestionarla. 
    En double la divisio entre 0 no dona error. En enter o long si. Double es infinit. 
*/
public class A_ProvaTryCatch {
    private static void divideix (int x, int y){
        int v[] = {0,1,2,3,4,5,6};
        try{
            System.out.println("El resultat de " + v[x] + "/" + v[y] + " es " + v[x]/v[y]); 
        // Se poden posar altres catch per controlar les altres excpecions com el 7/5
        }catch (ArithmeticException ae){
            System.out.println("Error - Divisio sense zero");
            System.out.println("Error reportat: " + ae.toString());
        }catch (Exception error_indeterminat){
            System.out.println("Error indeterminat en executar el programa.");
            System.out.println("Reporte: " + error_indeterminat.toString());
        }
        /* Opcional
        finally{
            System.out.println("codi que s'executa sempre");
        }
        */
    }
public static void main (String[] args){
    divideix(6,2);
    divideix(4,0);
    divideix(7,2);
    }
}

