package H_Bucles;

public class N_Bunga {
    public static void main (String[] args){
        int counter =0;
        for (int a=1; a<=9; a++){           // Familia A
            for (int b=1; b<=9; b++){       // Familia B
                if(a!=b)                    // Descarta igualtats entre A i B 
                for(int c=1; c<=9; c++){    // Familia C   
                    if (c!=a && c!=b){      // Descarta igualtats entre C i A i C i B
                    counter++;
                    }
                }
            }
        }
        System.out.println(counter);
    }
}
// M A L D O // 
