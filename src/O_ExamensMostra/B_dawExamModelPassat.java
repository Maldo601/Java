package O_ExamensMostra;

import java.util.Arrays;

public class B_dawExamModelPassat {
    static int numEspacios (String cad){
        int numEsp = 0;
        for ( int i = 0; i < cad.length(); i++){
            if (cad.charAt(i) == ' ')
                numEsp++;
        }
        return numEsp;
    }
    static String minEspacios (String s1, String s2, String s3){
        if (numEspacios(s1) == numEspacios(s3))
            return s1 + "\n" + s3;
        else if ( numEspacios(s2) == numEspacios(s3))
            return s2 + "\n" + s3;
        else if ( numEspacios(s1) == numEspacios(s2))
            return s1 + "\n" + s2;
        else if (numEspacios(s1) < numEspacios(s2) && numEspacios(s1) < numEspacios(s3))
            return s1;
        else if (numEspacios(s2) < numEspacios(s1) && numEspacios(s2) < numEspacios(s3))
            return s2;
        else if (numEspacios(s3) < numEspacios(s1) && numEspacios(s3) < numEspacios(s2))
            return s3;
        else 
        return null; 
    }
    static boolean restoSuma(int v[]){
        Arrays.sort(v);
        int sumes = 0;
        for (int i = 0; i < v.length; i ++){
            sumes += v[i];
        }
        for (int x = 0; x < v.length; x ++){
            if (sumes - v[x] == v[x])
            return true;
        }
        return false;
    }
    static int [] transforma (int [] v ){
        for ( int i = 0; i < v.length; i++){
            if ( i % 2 == 0  || i == 0)
                v[i] *=  2;
            if ( i % 2 != 0 )
                v[i] *= 3;
        }
        return v;
    }
    static boolean deficiente ( int x ){
        int num = 0;
        for (int i = 1; i <= x/2; i++){
            if ( x % i == 0)
                num += i;
        }
        System.out.println(num);
        if(num > x)
            return false;
        else if( num < x)
            return true;
        return false;
    }
    static int sumN (int n){
        if (n % 2 == 0)
        return n;
        else if (n % 2 != 0)
        return n;
    return sumN(n) / 2;
    }
    public static void main (String[] args){
        System.out.println(minEspacios("No se", "A B C DOS", "Solo yo"));
        int v[] = {1,3,15,2,5,4};
        //System.out.println(restoSuma(v));
        System.out.println(Arrays.toString(transforma(v)));
        System.out.println(deficiente(14));
        System.out.println(sumN(5));
    }
}
