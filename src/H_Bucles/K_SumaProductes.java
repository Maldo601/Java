package H_Bucles;
public class K_SumaProductes {
    public static void main (String[] args){
        int m = 2;
        int sum = 5;
        while( (Math.sqrt(sum) != (int)Math.sqrt(sum)) ){
            m++;
            sum += m*m;
            System.out.println(sum);
        }
    }
}
// M A L D O // 


