
import java.util.Arrays;

public class A_TaulaChar {
    static void printArray(char [][] m){
        for (int n=0; n<m.length; n++)
            System.out.println(Arrays.toString(m[n]));
    }
    
    public static char[][] omplirTaula(char c, int n, int d){
        int quants = 0;     // Quants caràcters hem posat
        int x,y;    
        char [][] mat = new char[d][d];
        if (n>d*d)
            return mat;
        while (quants < n){
            x = (int)(Math.random()*d);
            y = (int)(Math.random()*d);
            if (mat[x][y]!=c){
                mat[x][y] = c;
                quants++;
            }  
        }
        return mat;
    }

    // POEMA 
    public static String acrostic (String v[]){
        String pas  =  v[0]; String millor = v[4];
        String blat =  v[1];  String tots = v[5];
        String rem =  v[2];
        String suc =  v[3];
        String cad = ""+pas.charAt(0) + blat.charAt(0) + rem.charAt(0) + suc.charAt(0) + millor.charAt(0) + tots.charAt(0);
        return cad.toUpperCase();
    }
    static int [] fusioOrdena (int v1[], int v2[]){
        
        int counter = 0;
        int v[] = new int [v1.length + v2.length];
        System.arraycopy(v1,0,v,0,v1.length);
        System.arraycopy(v2,0,v,v1.length,v2.length);
        Arrays.sort(v);
        String def[] = new String[v.length];
        for (int i = 0; i < v.length; i++)
            def[i] = String.valueOf(v[i]);
        for (int x = 1; x < def.length; x++){
            if (def[x-1].equals(def[x]))
                def[x-1] = "";
        }
        Arrays.sort(def);
        for ( int i = 0; i < def.length; i++){
            if(def[i].equals(""))
                counter++;
        }
        String fin[] = new String [def.length - counter];
        System.arraycopy(def, counter, fin, 0, def.length-counter);
        int truefin[] = new int [fin.length];
        for (int i = 0; i < truefin.length; i++ ){
            truefin[i] = Integer.parseInt(fin[i]);
        }
        Arrays.sort(truefin);
        return truefin;
    }
    public static void main(String[] args){
        // char [][] mchar = omplirTaula('0',10,5);
        // printArray(mchar);
        // String v[] = {"Faig els pastissos","amb el blat","remenem be", "i afegim sucre", "no hi ha res millor", "a menjar tots"};
        // System.out.println(acrostic(v));
        int v1[] = {5,1,7,1,9};
        int v2[] = {0,1,10,4,4,5};
        System.out.println(Arrays.toString(fusioOrdena(v1, v2)));
    }
}
