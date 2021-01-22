package H_Bucles;
public class K_SumaProductes {
    public static void main (String[] args){
        byte m = 2;
        short sum = 5;
        while( (Math.sqrt(sum) != (byte)Math.sqrt(sum)) ){
            m++;
            sum += m*m;
            System.out.println(sum);
        }
    }
}
// M A L D O // 


