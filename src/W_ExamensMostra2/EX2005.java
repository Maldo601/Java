package W_ExamensMostra2;

import java.util.Arrays;

public class EX2005 {
    // Ejercicio I
    static int sumaCifras(int x){
        if (x < 10 && x >= 0)
            return x;
        if (x < 0)
            return -x%10 + sumaCifras(Math.abs(x)/10);
        return x%10 + sumaCifras(Math.abs(x/10));
    }
    // Ejercicio II
    static int [] sumanIgualCifras(int v[], int x){
        int counter = 0;
        for (int i = 0; i < v.length; i ++){
            if (sumaCifras(v[i]) == x){
                counter++;
            }
        }
        int aux[] = new int [v.length];
        for (int i = 0; i < v.length; i ++){
            if (sumaCifras(v[i]) == x){
                aux[i] = v[i];
            }
        }
        Arrays.sort(aux);
        int arrayfinal[] = new int[counter];
        // System.arraycopy(def, counter, fin, 0, def.length-counter);
        System.arraycopy(aux, 0, arrayfinal, 0, 3);
        System.arraycopy(aux, 10, arrayfinal, 3, 3) ;
        // System.arraycopy(src, srcPos, dest, destPos, length);
        return arrayfinal;
    }

    static String[] cifrasSoloEnX (long x, long y){

        return null;
    }

    static boolean demonio (long x){
        String demon = Long.toString(x);
        int counter = 0;
        if (demon.length() < 5)
            return false;
        for (int i = 0; i < demon.length(); i++){
            if(demon.charAt(i) == '6')
                counter++;
        }
        if (demon.contains("66") || demon.contains("666") || counter > 3 )
            return false;
        return true;
    }
    public static void main(String[] args) throws Exception {
        
        /*
        System.out.println("Ejercicio 3");
        System.out.println("cifrasSoloEnX(-10222,301) = " + cifrasSoloEnX(-10222,301));
        System.out.println("cifrasSoloEnX(987,-532) = " + cifrasSoloEnX(987,-532));
        System.out.println("cifrasSoloEnX(-73809,-67542) = " + cifrasSoloEnX(-73809,-67542));
        System.out.println("cifrasSoloEnX(345,36524) = " + cifrasSoloEnX(345,36524));
        */

        
        
        

        // ARGUMENTS DEL MAIN 
            // De moment nomes funciona en el cas que es passen independentment. 
            // Tipo 1 2 3 4.
        if(args.length == 0)
            System.out.println("Pasa un numero con los ejercicios a probar y los ejecutare en orden." );
        for (int i = 0; i < args.length; i++){
          try{
            if(args[i].equals("1")){
                System.out.println("Ejercicio 1");
                System.out.println("sumaCifras(19256403) = " + sumaCifras(19256403));
                System.out.println("sumaCifras(0) = " + sumaCifras(0));
                System.out.println("sumaCifras(-12) = " + sumaCifras(-12));
            }
            else if(args[i].equals("2")){
                System.out.println("Ejercicio 2");
                int [] vSuman = {9,10,-64,245,1054,73,-10225,54,322,19,475,-23,-37};
                System.out.println("Vector original");
                System.out.println(Arrays.toString(vSuman));
                System.out.println("sumanIgualCifras(vSumar,10) = " + 
                Arrays.toString(sumanIgualCifras(vSuman,10)));
            }
            else if(args[i].equals("3"))

                throw new Exception("");

            else if (args[i].equals("4")){
                System.out.println("Ejercicio 4");
                System.out.println("demonio(-1) =  " + demonio(-1));
                System.out.println("demonio(6606) =  " + demonio(6606));
                System.out.println("demonio(-6362616) =  " + demonio(-6362616));
                System.out.println("demonio(6466) =  " + demonio(6466));
                System.out.println("demonio(64656) =  " + demonio(64656));
                System.out.println("demonio(666) =  " + demonio(666));
                System.out.println("demonio(-678654678) =  " + demonio(-678654678));
            }
        }catch ( Exception ex ){
            System.out.println("Ejercicio no Resuelto");
        }
    }
  }
}
