package O_ExamensMostra;
import java.util.Arrays;

/**
 *
 * @author Maldonado Negre, Joan Marc
 */

public class C_ExamenResol {
    // Añadir aqui el codigo de las funciones pedidas
    // Ejercicio 1          
    static boolean tieneRepes(int x){
        String cad = String.valueOf(x);
        String v[] = new String [cad.length()];
        for ( int i = 0; i < v.length; i++){
            v[i] = ""+cad.charAt(i);
        }
        if (v[0].equals("-"))
            v[0] = "";
        Arrays.sort(v);
        int counter = 0;
        for ( int y = 1; y < v.length; y++){
            if(v[y].equals(v[y-1]))
                counter++;
        }
        System.out.println(Arrays.toString(v));
        return (counter > 0) ? true : false ;
    }
    static int menosVeces(int [] v){
        Arrays.sort(v);
        System.out.println(Arrays.toString(v));
        int num = 0;
        for ( int i = 1; i < v.length; i++){
            if ( v[i-1] < v[i] && v[i] < v[i+1]){
                num = v[i];
                break;
            }
        }
        return num;   
    }
        
    // Ejercicio 4
    
    
    // Ejercicio 5
    
       
    // Codigo para probar las funciones que se piden.  Eliminar o comentar el c�digo de prueba de las
    // funciones que no hayais programado  (si no lo haceis as�, no compilar� el programa).
    public static void main(String[] args) {
        /*
        System.out.println("Ejercicio 1");
        System.out.println("tieneRepes(19256403) = " + tieneRepes(19256403));
        System.out.println("tieneRepes(0) = " + tieneRepes(0));
        System.out.println("tieneRepes(-102985371) = " + tieneRepes(-102985371));
        System.out.println("tieneRepes(-22) = " + tieneRepes(-22));
        */
        
        System.out.println("Ejercicio 2");
        int [] va = {0,2,9,4,3,5,1,2,0,8,6,9,4,1,2};
        int [] vb = {0,1,2,3,0,1,2,3,0,1,2,3,0,1,2,3};
        System.out.println("va = " + Arrays.toString(va));
        System.out.println("vb = " + Arrays.toString(vb));
        System.out.println("menosVeces(va) = " + menosVeces(va));
        System.out.println("menosVeces(vb) = " + menosVeces(vb));
        /*
        System.out.println("Ejercicio 3");
        System.out.println("carLasTres(\"acoso\",\"osa\",\"Lola\") = " + carLasTres("acoso","osa","Lolas"));
        System.out.println("carLasTres(\"basmani\",\"bambas\",\"bombas\") = " + carLasTres("basmani","bambas","bombas"));
        System.out.println("carLasTres(\"mama\",\"timo\",\"mia\") = " + carLasTres("mama","","mia"));
        System.out.println("carLasTres(\"comico\",\"ocico\",\"mico\") = " + carLasTres("comico","ocico","mico"));
        System.out.println("carLasTres(\"mio\",\"\",\"mio\") = " + carLasTres("mio","","mio"));
        
        System.out.println("Ejercicio 5");
        int [] v1 = {123,324,987},  v2 = {1223,33224,6733421,123},  v3 = {123121,23311};
        System.out.println("v1 = " + Arrays.toString(v1) + "   v2 = " + Arrays.toString(v2) + "   v3 = " + Arrays.toString(v3));
        System.out.println("cifrasComunes(v1) = " + cifrasComunes(v1));
        System.out.println("cifrasComunes(v2) = " + cifrasComunes(v2));
        System.out.println("cifrasComunes(v3) = " + cifrasComunes(v3));
        
       */
    }
}

