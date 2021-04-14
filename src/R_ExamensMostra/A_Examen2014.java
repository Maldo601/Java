package R_ExamensMostra;

public class A_Examen2014 {
    static String primerUltim (String str){
        if (str.length() == 0)
            return "";
        return (str.length() > 1) ? str.substring(0,2) : "" + str.charAt(0);
    }
    static boolean vector (int v[] ){
        int counterTrue = 0;
        int counterFalse = 0;
        for ( int i = 0; i < v.length; i ++){
            if ( v[i] < 5 && v[i] >= 0 )
                counterFalse++;
                else if ( v[i] >= 5 && v[i] <= 10 )
                    counterTrue++;
        }
        if (counterTrue == counterFalse)
            System.out.println( "50/50" );
        return (counterTrue > counterFalse) ? true : false;
    }
    static int vectorEnters (int v1[], int v2[]){
        int v[] = new int[v1.length > v2.length ? v2.length : v1.length];
        int counter = 0;
        for (int i = 0; i < v.length; i++){
            if (v1[i] == v2[i])
                counter++;
        }
        return counter;
    }
    static boolean allVowels (String v [][] ){
        String str = "";
        for(int i = 0; i < v.length; i ++){
            for (int j = 0; j < v[0].length; j++)
                str += v[i][j];
        }
        if (str.substring(0, str.length() ).contains("a") && 
            str.substring(0, str.length() ).contains("e") &&
            str.substring(0, str.length() ).contains("i") && 
            str.substring(0, str.length() ).contains("o") && 
            str.substring(0, str.length() ).contains("u")   )
            return true;
            // System.out.println(str) ;
        return false;
    }
    static void constructor (){
        allVowels();
        vector();
        vectorEnters(v1, v2);
        primerUltim(str);
    }
    public static void main (String[] args){
            // VARS 

        String str = "Haaaaaaaaaa";
         int a[] = {5,3,1,2,8,3,8,9,6,4,7};
         int v1[] = {5, 3,1,2,8, 3, 8,9,6,4,7};
         int v2[] = {5,-3,8,2,8,-5,-8};
        String v [][] = {
                         {"a","a","b","b","e","e","i","o","u"},
                         {"a","a","h","y","e","m","o","u","u"}
                        }; 
        System.out.printf(constructor());
    }
}
