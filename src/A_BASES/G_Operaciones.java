package A_BASES;
public class G_Operaciones {
    public static void main (String[] args) {
        //-------------------------------- 1
        final long MAX = (long) 1e12;
        final int MIN = 100;
        //-------------------------------- 2

        int x = 5 + 12;
        double y = -23.56;
        float z = 3e32f;
    
        //-------------------------------- 3
        int a;
        long b = 100;
        a = (int) b;
        //-------------------------------- 4
        int D = 10 - 6 * 2;
        int F = D + 12; 
        long G = D + 2 * F;
        //-------------------------------- 5
        int j, k, l;
        j = 3;
        k = ++j + 2;
        l = j-- + 2;
        //-------------------------------- 6
        int m = 10;
        m = (int) Math.pow(m,2);
        //-------------------------------- 7
        int q;
        q = (int) (3.5 + 6.5);
        //-------------------------------- 8
        long error;
        error = (long)2147483645 + 3;
        //-------------------------------- 9
        // Es un error de desbordament. Resultats no correctes, s'ha d'anar amb compte. 
        long mal;
        long mal2;
        mal = 100000 * 100000;
        mal2 = 1000000 * 1000000;
        //-------------------------------- 10
        // 97 * 98 * 99 = 941.094. CHAR PROMOCIONARA A INT. 
        char s = 'a', scnd = 'b', trcr = 'c';
        int result = s * scnd * trcr;
        //-------------------------------- 11
        // 100 * 100 = 10.000
        byte bt = 100, by = 100;
        int resol = bt * by;
        short bt1 = 1000, byt = 1000;
        int resol2 = bt1 * byt;
        //-------------------------------- 12
        float tst = 2.40282347e37f;
        double result3 = tst * 100;
        result3 = result3/100;
        //-------------------------------- 13
        //-------------------------------- 14
        


        // Resultats
        
        System.out.println(x + " " + y + " " + z);  //1 
        System.out.println(MAX + " " + MIN);        //2
        System.out.println(a);                      //3
        System.out.println( D + " " + F + " " + G); //4
        System.out.println(j + " " + k + " " + l);
        System.out.println(m);
        System.out.println(q);
        System.out.println(1.234e60 + 1e50);
        System.out.println(error);
        System.out.println(mal);
        System.out.println(mal2);
        System.out.println(result);
        System.out.println(resol);
        System.out.println(resol2);
        System.out.println(tst);
        System.out.println(result3);
        System.out.println(100/0);
        System.out.println();
    }
}
