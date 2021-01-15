package H_Bucles;

public class J_NumNarcisista {
    public static void main (String[] args){
        // Bucle Narcisista.
       int n;
       for(n=100; n<=500; n++){
           int c = n / 100;
           int res = n % 100;
           int d = res/10;
           int u = res%10;
           if (n == Math.pow(c,3)+Math.pow(d,3)+Math.pow(u,3))
            System.out.println(n);
       }
    }
}
// M A L D O // 




